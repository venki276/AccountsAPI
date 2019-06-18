package com.anz.accounts.api.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.anz.accounts.api")
@EnableJpaRepositories("com.anz.accounts.api.dao.repository")
@EntityScan("com.anz.accounts.api.entity")
public class AccountsAPIBoot {
	public static void main(String[] args){
		SpringApplication.run(AccountsAPIBoot.class, args);
	}

}
