package com.example.ksb.user.controller

import com.example.ksb.user.aop.LoggingAop
import com.example.ksb.user.aop.TokenRequired
import com.example.ksb.user.dto.ReadAllUserReqDto
import com.example.ksb.user.dto.SignupReqDto
import com.example.ksb.user.service.user.UserService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import kotlin.annotation.Retention
import kotlin.annotation.Target


data class ModelAttributeDto (
    val name: String,
    val email: String
)


@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
annotation class LoginUser

@RestController
class userController(private val userService: UserService) {

    // 환경변수 가져오기
    @Value("\${test.a}")
    private val a:String = ""

    @Value("\${test.b}")
    private val b:String = ""

    @GetMapping("/")
//    @TokenRequired
    fun readAllUser(@RequestParam() readAllUserReqDto: ReadAllUserReqDto): ResponseEntity<*> {
        val a = userService.findAll()
        return ResponseEntity.ok(a)
    }

    @PostMapping("signup")
    @TokenRequired
    fun signup(@RequestBody() signupReqDto: SignupReqDto) = LoggingAop(signupReqDto) {
        return@LoggingAop userService.signup(signupReqDto)
    }

    @PostMapping("signout")
    @TokenRequired
    fun signout(@RequestBody() signupReqDto: ModelAttributeDto): ArrayList<Any> {
        return arrayListOf(1, a, b)
    }
}

