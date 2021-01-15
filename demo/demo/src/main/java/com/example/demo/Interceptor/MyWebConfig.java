package com.example.demo.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    // 将登录拦截器配置到容器中
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns(
                        "/",
                        "/index","/admin",
                        "/admin/login",
                        "/admin/register",
                        "/css/**", "/js/**",
                        "/img/**",
                        "/font_seop24v5vbs/**");
    }
}
