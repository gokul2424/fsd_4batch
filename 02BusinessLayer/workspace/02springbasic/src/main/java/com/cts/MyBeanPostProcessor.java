package com.cts;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" -- Post Process Before " + beanName);
		if(bean instanceof DatabaseConfig){
			DatabaseConfig config = (DatabaseConfig) bean;
			config.setDbPort(5555l);
			return config;
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(" -- Post Process After " + beanName);
		return bean;
	}

}
