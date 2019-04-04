package org.migue.learning.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

// adding an annotation @Component here is equivalent to declaring this as a bean in xml. But then tell Spring in the xml where to scan for all such components using <context:component-scan base-package="com.something" />
public class Circle implements Shape, ApplicationEventPublisherAware {

	private Point center;
	private MessageSource messageSource;
	
	private ApplicationEventPublisher publisher;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void draw() {
		System.out.println("Drawing a circle");
		System.out.println("Circle's Center point is (" + center.getX() + "," + center.getY() + ")");
		System.out.println("Printing message using MessageSource object - "
				+ messageSource.getMessage("greeting", null, "Default greeting", null));// you can explore locales,
																						// parameter passing into the
		// we publish a custom event DrawEvent (a custom class we implemented) . 
		//See how we have implemented event publishing using  ApplicationEventPublisher and ApplicationEventPublisherAware																			// 2nd Object etc.
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	public Point getCenter() {
		return center;
	}

	// we will mark the center point as required for a circle. If someone tries to
	// create a circle with no center point, then validation will fail.
//So we add a @Required annotation.
	// Also, if we have to mention a BeanPostProcessor that does this validation and
	// shouts if the requirement is not met in the bean initialization phase itself.
	// We therefore add
	// RequiredAnnotationBeanPostProcessor bean in the spring.xml
	// You can add @Autowired annotation which will autowire the Point center into
	// Circle. PostProcessor needed to be added is
	// AutowiredAnnotationBeanPostProcessor
	// @Autowired: tries by type first, then byName (name of the member variable and
	// the dependency bean must match) if there are many similar types. If we don't
	// want to get into the naming business then use @Qualifier
	// For using Qualifiers, use <qualifier value= "abc" /> in the dependency bean
	// and use the @Qualifier("abc") on top of the setter of the member variable.
	// This creates a linking.
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}

	// We learnt and implemented three JSR-250 annotations that Spring
	// supports:Resource which does autowiring, PostConstruct (which runs on
	// initializing the beans )and PreDestroy (which runs before the bean is
	// destroyed). JSR-250 annotations are implemented by many frameworks not just
	// Spring. We can use these annotations in Spring or use Spring's custom
	// annotations.

}
