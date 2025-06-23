package com.project.Everyday_Essentials;

import org.springframework.boot.SpringApplication;

public class TestEverydayEssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.from(EverydayEssentialsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
