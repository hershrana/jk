package jk;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JkApplication {

	public static void main(String[] args) {
		SpringApplication.run(JkApplication.class, args);
		System.out.println("op");
	}
	@GetMapping(path = "/welcome")
	public String welcome()
	{
		return "Welcome !!,"+LocalDateTime.now();
	}

}
