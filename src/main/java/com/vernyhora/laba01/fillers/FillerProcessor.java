package com.vernyhora.laba01.fillers;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @see java.lang.annotation.Annotation
 * @author <Vernyhora Elena></>
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FillerProcessor {

}
