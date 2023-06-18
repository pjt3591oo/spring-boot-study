package com.example.ksb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KsbApplication

fun main(args: Array<String>) {
//	println("hello world1")
	runApplication<KsbApplication>(*args)
//	println("hello world2")
}
