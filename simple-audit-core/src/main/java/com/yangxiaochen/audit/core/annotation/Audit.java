package com.yangxiaochen.audit.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Audit {
    String tag() default "";

    boolean recordInput() default true;
    boolean recordOutput() default true;
    boolean recordException() default true;
}
