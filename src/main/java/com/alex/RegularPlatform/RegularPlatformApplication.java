package com.alex.RegularPlatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.alex.RegularPlatform.mapper")
public class RegularPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegularPlatformApplication.class, args);
	}
}
