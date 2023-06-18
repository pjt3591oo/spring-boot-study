package com.example.ksb.config

import com.example.ksb.interceptor.HttpInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer


@Configuration
class WebMvcConfig : WebMvcConfigurer {
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(HttpInterceptor())
            .addPathPatterns("/*")
            .excludePathPatterns("/board") // 해당 경로는 인터셉터가 가로채지 않는다.
    }
}