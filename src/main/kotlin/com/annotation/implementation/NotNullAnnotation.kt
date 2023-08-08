package com.annotation.implementation

import com.annotation.ValidationAnnotations.NotNull
import java.lang.reflect.Field

object NotNullAnnotation {
    fun implementation(
        value: String?,
        field: Field,
        annotation: NotNull,
        errors: MutableList<String>,
    ) {
        if (value == null || value.toString().trim().isEmpty() || value == "") {
            val errorMessage = annotation.message.takeUnless { it.isBlank() }
                ?: "${field.name} must not be empty"
            errors.add(errorMessage)
        }
    }

}