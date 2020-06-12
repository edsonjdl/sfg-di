package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	/*
	 * Propriedade
	 * Observação: GreetingService é uma interface. Para que PropertyInjectedController consiga uma implementação concreta 
	 * de sua propriedade, ele terá que buscar. A questão é que existem mais de uma implementação de GreetingService.
	 * 
	 * Sendo assim, é necessário que se vincule a propriedade nessa classe com a implementação correta de GreetingService: tag @Qualifier
	 * 
	 * Além disso não há nenhuma implementação de GreetingService iniciada: tag @Autowired
	 */
	@Qualifier("propertyInjectedGreetingService")
    @Autowired
	public GreetingService greetingService;
	
	// Propriedade: para se ter acesso ao objeto GreetingService, preciso usar o get 
	public String getGreeting(){
		return greetingService.sayGreeting();
	}

}
