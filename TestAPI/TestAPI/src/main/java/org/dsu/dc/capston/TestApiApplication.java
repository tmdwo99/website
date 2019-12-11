package org.dsu.dc.capston;

import java.io.UnsupportedEncodingException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Slf4j
public class TestApiApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SpringApplication.run(TestApiApplication.class, args);
	
		
	}

}
