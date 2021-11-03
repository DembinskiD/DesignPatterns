package pl.wzorce.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.wzorce.demo.singleton.SingletonPattern;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println(SingletonPattern.getInstance().hashCode());
		System.out.println(SingletonPattern.getInstance().hashCode());
	}

}
