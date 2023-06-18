package com.example.ksb.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice


data class ResCode(val code: HttpStatus, val desc: String, ) {}

@RestControllerAdvice
class GlobalControllerAdvice {

    @ExceptionHandler(BaseException::class)
    protected fun handleBaseException(e: BaseException): ResponseEntity<Any> {
        println(e.baseResponseCode.status)
        println(e.baseResponseCode.message)

        return ResponseEntity
            .status(e.baseResponseCode.status)
            .body(
                ResCode(e.baseResponseCode.status, e.baseResponseCode.message)
            )
    }
}