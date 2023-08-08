package com.annotation

class ValidationAnnotations {
    /**
     * This annotation indicates that the annotated element must not be empty.
     * The element should contain a non-null and non-empty value.
     */

    @Retention(AnnotationRetention.RUNTIME)
    @Target(AnnotationTarget.FIELD)
    annotation class NotNull(val message: String)
}