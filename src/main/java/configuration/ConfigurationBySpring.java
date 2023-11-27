package configuration;

import beans.CustomBeanFactoryPostProcessor;
import beans.CustomBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("beans")
@Configuration
public class ConfigurationBySpring {

	@Bean(name = "simpleBean", initMethod = "initMethod", destroyMethod = "destroyMethod")
	public beans.SimpleBean getSimpleBean() {
		System.out.println("ConfigurationBySpring.getSimpleBean");
		return new beans.SimpleBean();
	}

	@Bean
	public CustomBeanPostProcessor getCustomBeanPostProcessor() {
		System.out.println("ConfigurationBySpring.getCustomBeanPostProcessor");
		return new CustomBeanPostProcessor();
	}

	@Bean
	public CustomBeanFactoryPostProcessor getCustomBeanFactoryPostProcessor() {
		System.out.println("ConfigurationBySpring.getCustomBeanFactoryPostProcessor");
		return new CustomBeanFactoryPostProcessor();
	}

}
