/**
 * 
 */
package org.migue.learning.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author migue
 *
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Triangle triangle = new Triangle();
		// BeanFactory beanFactory = new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));

		// AbstractApplicationContext and registerShutdownHook() because we want spring
		// context to close when this DESKTOP APP closes. Not needed for web app since
		// it happens automatically for web app.
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// so the spring.xml file must reside in the classpath which is inside the src
		// folder. Not the root of the project.
		context.registerShutdownHook();
		Shape s1 = (Shape) context.getBean("triangle1");

		System.out.println("CALL TO DRAW METHOD.....");

		// Coding to interfaces means that the DrawingApp method does not need to know
		// the type of the object on which it calling the draw method. Eg: Triangle or
		// Circle etc. Hence shape interface
		// Use: For eg. View layer can call service interface, and you can swap the
		// service's
		// implementation whenever you want.
		// So you are essentially coding to the interfaces.
		s1.draw();

		Shape s2 = (Shape) context.getBean("circle");
		s2.draw();
		System.out.println("Printing message using context - " + context.getMessage("greeting", null, "Default greeting", null));
	}

}
