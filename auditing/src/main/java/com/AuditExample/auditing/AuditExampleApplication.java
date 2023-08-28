package com.AuditExample.auditing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
//@RestController
public class AuditExampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(AuditExampleApplication.class, args);
	}

}
