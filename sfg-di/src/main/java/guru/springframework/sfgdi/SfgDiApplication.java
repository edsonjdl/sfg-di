package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		/*
		 * O contexto do Spring Framework consegue reconhecer o objeto MyController 
		 * devido à tag @Controller.
		 * A classe MyController porta um método particular à ela
		 */
		MyController myController = (MyController) ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);
		
		/*
		 * Posso definir mais de uma maneira para implementação de Inversão de COntrole (IoC).
		 * Pela propriedade (get), pela configuração (set) ou pela definição (constructor). Os exemplos abaixo ilustram o caso.
		 * 
		 */
		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
