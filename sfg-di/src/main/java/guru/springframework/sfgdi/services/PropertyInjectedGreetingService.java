package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

	/*
	 * A tag @Service torna a classe "alcaçavel" por um controlador. Sem ela, o Spring Framework não tem como reconhecer,
	 * e consequentement instanciar esta classe de serviço.
	 */
	
	
	@Override
	public String sayGreeting() {
		return "Hello World - Property";
	}

}
