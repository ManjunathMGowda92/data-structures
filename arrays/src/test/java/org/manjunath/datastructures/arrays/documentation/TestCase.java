package org.manjunath.datastructures.arrays.documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestCase {
	String Author() default "Manjunath HM";
	String testCaseDescription() default "";
	String expectedResult() default "";
}
