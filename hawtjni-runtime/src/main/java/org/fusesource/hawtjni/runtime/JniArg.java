/*******************************************************************************
 * Copyright (c) 2009 Progress Software, Inc.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.fusesource.hawtjni.runtime;

/**
 * 
 */
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JniArg {
    
    ArgFlag[] flags() default {};
    String cast() default "";

}
