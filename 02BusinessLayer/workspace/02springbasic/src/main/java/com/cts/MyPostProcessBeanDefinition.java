package com.cts;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyPostProcessBeanDefinition implements BeanFactoryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// Modifications to bean factory
		
		System.out.println("****** ...Modify the beans.xml if need be");
		
		for(String beanName: beanFactory.getBeanDefinitionNames()){
			if(!beanName.startsWith("org.springframework")){
				System.out.println(beanName);
			}
			
		}
		
	}

}
