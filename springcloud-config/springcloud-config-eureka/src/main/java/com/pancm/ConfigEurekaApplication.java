package com.pancm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
* @Title: ConfigEurekaApplication
* @Description: 
* springcloud服务入口
  EnableEurekaServer 注解启动一个服务注册中心
* @Version:1.0.0  
* @author pancm
* @date 2018年3月29日
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaApplication.class, args);
		 System.out.println("config 注册中心服务启动...");
	}
//	@EnableWebSecurity
//	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http.csrf().disable();
//			super.configure(http);
//		}
//	}
}
