package guru.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {

	// Somente um exemplo para ilustrar a Inversão de Controle através do JUnit
	@Override
	public String sayGreeting() {
		return "Hello Word";
	}

}
