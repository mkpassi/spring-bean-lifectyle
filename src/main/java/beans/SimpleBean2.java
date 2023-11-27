package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleBean2 {

	private SimpleBean3 simpleBean3;
	public SimpleBean2() {
		System.out.println(getClass().getSimpleName() + "::constructor");
	}

	@Autowired
	public void setSimpleBean3(SimpleBean3 simpleBean3) {
		System.out.println(getClass().getSimpleName() + "::setSimpleBean3");
		this.simpleBean3 = simpleBean3;
	}

	public SimpleBean3 getSimpleBean3() {
		return simpleBean3;
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
