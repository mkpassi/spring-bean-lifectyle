package runner;

import beans.SimpleBean;
import configuration.ConfigurationBySpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerAnnotationConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBySpring.class);
		context.getBean("simpleBean",SimpleBean.class).sayHello();
	}

}
