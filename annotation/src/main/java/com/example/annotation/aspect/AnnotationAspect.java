package com.example.annotation.aspect;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Android on 1/9/2018.
 */


@Aspect
public class AnnotationAspect {
    private static final String TAG = "AnnotationAspect";

    private static final String POINTCUT_METHOD =
            "execution(@com.example.annotation.annotation.MyAnnotation * *(..))";

    @Pointcut(POINTCUT_METHOD)
    public void methodAnnotated() {

    }

    @Around("methodAnnotated()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.d(TAG, "weaveJoinPoint: Inside the AnnotationAspect Class");
        joinPoint.proceed();
        return null;
    }
}
