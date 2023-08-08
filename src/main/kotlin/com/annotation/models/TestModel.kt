package com.annotation.models

import com.annotation.ValidationAnnotations.NotNull

data class TestModel (
    @NotNull("Test cannot be null")
    val test: String,
    val num: Number
)