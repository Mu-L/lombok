/*
 * Copyright (C) 2018-2025 The Project Lombok Authors.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package lombok.experimental;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import lombok.Singular;

/**
 * The SuperBuilder annotation creates a so-called 'builder' aspect to the class that is annotated with {@code @SuperBuilder}, but which works well when extending.
 * It is similar to {@code @Builder}, except it is only legal on types, is less configurable, but allows you to {@code extends} other builder-able classes.
 * <p>
 * All classes in the hierarchy must be annotated with {@code @SuperBuilder}.
 * <p>
 * Lombok generates 2 inner 'builder' classes, which extend the parent class' builder class (unless your class doesn't have an extends clause).
 * Lombok also generates a static method named {@code builder()}, and a protected constructor that takes 1 argument of the builderclass type.
 * <p>
 * The <code><strong>T</strong>Builder</code> class contains 1 method for each parameter of the annotated
 * constructor / method (each field, when annotating a class), which returns the builder itself.
 * The builder also has a {@code build()} method which returns a completed instance of the original type.
 * <p>
 * Complete documentation is found at <a href="https://projectlombok.org/features/experimental/SuperBuilder">the project lombok features page for &#64;SuperBuilder</a>.
 *
 * @see Singular
 */
@Target(TYPE)
@Retention(SOURCE)
public @interface SuperBuilder {
	/** @return Name of the method that creates a new builder instance. Default: {@code builder}. If the empty string, suppress generating the {@code builder} method. */
	String builderMethodName() default "builder";

	/** @return Name of the method in the builder class that creates an instance of your {@code @Builder}-annotated class. */
	String buildMethodName() default "build";

	/**
	 * If {@code true}, generate an instance method to obtain a builder that is initialized with the values of this instance.
	 * In this case, all superclasses must also have {@code toBuilder=true}.
	 *
	 * @return Whether to generate a {@code toBuilder()} method.
	 */
	boolean toBuilder() default false;

	/**
	 * Prefix to prepend to 'set' methods in the generated builder class. By default, generated methods do not include a prefix.
	 *
	 * For example, a method normally generated as {@code someField(String someField)} would instead be
	 * generated as {@code withSomeField(String someField)} if using {@code @SuperBuilder(setterPrefix = "with")}.
	 *
	 * Note that using "with" to prefix builder setter methods is strongly discouraged as "with" normally
	 * suggests immutable data structures, and builders by definition are mutable objects.
	 * 
	 * For {@code @Singular} fields, the generated methods are called {@code withName}, {@code withNames}, and {@code clearNames}, instead of
	 * the default {@code name}, {@code names}, and {@code clearNames}.
	 * 
	 * This prefix only applies to the 'set' methods for the fields of the annotated class. 
	 * For consistency reasons, you should use the same prefix on all superclasses and subclasses that use {@code @SuperBuilder}.
	 * 
	 * @return The prefix to prepend to generated method names.
	 */
	String setterPrefix() default "";
}
