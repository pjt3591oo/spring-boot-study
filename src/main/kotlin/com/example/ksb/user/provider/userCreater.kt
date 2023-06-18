package com.example.ksb.user.provider

import com.example.ksb.user.dto.SignupReqDto
import com.example.ksb.user.entity.User
import com.example.ksb.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserCreater(private val userRepository: UserRepository) {
    fun signup(signupReqDto: SignupReqDto): User {
        val user = User(name = signupReqDto.name, email = signupReqDto.email)
        userRepository.save(user)
        return user
    }
}