package com.example.ksb.user.aop

import com.example.ksb.user.dto.SignupReqDto

fun <T> LoggingAop(key: SignupReqDto, function : () -> T): T {
    println("==================== LoggingAop start ======================")
    println(key)
    val result = function.invoke()
    println(result)
    println("==================== LoggingAop end ======================")
    return result
}
