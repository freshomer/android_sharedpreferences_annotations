package com.freshomer.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface PreferenceKey {

    /**
     * The type of value.
     */
    ValueType valueType();

    /**
     * Desired preferences file.
     */
    String preferencesName() default "" ;

}
