package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * This is a custom annotation.
 * Use this annotation to mark methods for user security process.<p>
 * guidelines<p>
 * - provide the user jwt token in the Authorization headers:<p>
 * - Ensure the method signature is correct.<p>
 * - Provide the user id as the first parameter.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UserSecured {
}
