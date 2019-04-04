/**
 * 
 */
package org.migue.learning.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author migue
 *
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	
	/*
	 * Parameters:
	 * arg0 the new bean instance
	 * arg1 the name of the bean
	 * Returns:
	 * the bean instance to use, either the original or a wrapped one; if null, no
	 * subsequent BeanPostProcessors will be invoked
	 * Throws:
	 * BeansException - in case of errors
	 */	
	
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
			System.out.println(">>Here in postProcessAfterInit bean: " + arg1 + "");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println(">>Here in postProcessBeforeInit bean: " + arg1 + "");
		return arg0;
	}
	
}
