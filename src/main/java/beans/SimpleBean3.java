package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleBean3 {

	public SimpleBean3() {
		System.out.println(getClass().getSimpleName() + "::constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println(getClass().getSimpleName() + "::init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println(getClass().getSimpleName() + "::destroy");
	}
}
