package com.example.api_study.core.exception

class InvalidException(
    message: String = "Invalid Input"
): RuntimeException(message)