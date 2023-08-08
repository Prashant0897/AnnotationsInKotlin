package com.annotation.implementation

import com.annotation.ValidationAnnotations.NotNull
import kotlin.reflect.KClass

class AnnotationUtility {
    companion object {
        private val customAnnotations: List<KClass<out Annotation>> = listOf(
            NotNull::class
        )

        fun validate(obj: Any): List<String> {
            val errors = mutableListOf<String>()
            val fields = obj::class.java.declaredFields

            for (field in fields) {
                field.isAccessible = true

                for (annotationClass in customAnnotations) {
                    val annotation = field.getAnnotation(annotationClass.java)
                    if (annotation != null) {
                        val value = field.get(obj) as? String
                        when (annotation) {
                            is NotNull -> NotNullAnnotation.implementation(value, field, annotation, errors)
                        }
                    }
                }
            }
            return errors
        }
    }
}