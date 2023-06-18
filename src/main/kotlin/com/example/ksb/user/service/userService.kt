package com.example.ksb.user.service.user

import com.example.ksb.exception.BaseException
import com.example.ksb.exception.BaseResponseCode
import com.example.ksb.user.dto.SignupReqDto
import com.example.ksb.user.entity.User
import com.example.ksb.user.provider.UserCreater
import com.example.ksb.user.provider.UserReader
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userReader: UserReader,
    private val userCreater: UserCreater,
) {
    fun findAll(): MutableList<User> {
        return userReader.findAll();
    }

    fun signup(signupReqDto: SignupReqDto): User {
        throw BaseException(BaseResponseCode.BAD_REQUEST)
        return userCreater.signup(signupReqDto)
    }
}