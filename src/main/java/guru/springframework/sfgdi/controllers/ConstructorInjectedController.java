package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;
@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	// Injeção diretamente no constructor
	//A tag @Qualifier vai no parametro dentro do constructor. Essa é a melhor prática.
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
	
	

}
