package kr.co.etoursoft.fxapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import javafx.application.Application;
import kr.co.etoursoft.fxapp.ex.ExampleApplication;

@SpringBootApplication
@EnableCaching 
@ComponentScan(value = { "kr.co.etoursoft.fxapp.*" })
@PropertySource({ "classpath:property/fxapp.properties"})
public class SpringBootJavaFxApplication {

	public static void main(String[] args) {
		Application.launch(ExampleApplication.class, args);
	}

}
