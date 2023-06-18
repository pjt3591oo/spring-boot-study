package com.example.ksb.user.provider

import com.example.ksb.user.entity.User
import com.example.ksb.user.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserReader(private val userRepository: UserRepository) {
    fun findAll(): MutableList<User> {
        return userRepository.findAll();
    }
}