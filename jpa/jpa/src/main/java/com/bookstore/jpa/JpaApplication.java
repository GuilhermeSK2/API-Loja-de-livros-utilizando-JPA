package com.bookstore.jpa;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);
		log.error("Mensagem error");
		log.warn("Mensagem warn");
		log.info("Mensagem info");
		log.debug("Mensagem debug");
		log.trace("Mensagem trace");

	}
}
