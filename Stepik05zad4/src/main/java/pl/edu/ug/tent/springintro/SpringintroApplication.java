package pl.edu.ug.tent.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import java.util.Arrays;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringintroApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringintroApplication.class, args);
//		getAllBeans(context);
	}

	private static void getAllBeans(ApplicationContext context){
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println("Bean: " + beanName);
		}
	}

}