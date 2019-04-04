/**
 * 
 */
package org.migue.learning.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author migue
 *
 */

/*
 * public class Triangle implements ApplicationContextAware, BeanNameAware,
 * InitializingBean, DisposableBean{
 * 
 * ApplicationContextAware means the ApplicationContext can be accessed here.
 * Why would you want to do it? Eg. Triangle is singleton but pointA, pointB,
 * pointC want to be prototype - then what will you do? Because even they will
 * be initialised only once for the Spring container. Hence ApplicationContext
 * needed here. Done by implementing ApplicationContextAware Interface
 */

/*
 * BeanNameAware means making this bean ware of its name
 */

/*
 * 
 * InitializingBean {Interface to be implemented by beans that need to react
 * once all their properties have been set by a BeanFactory: for example, to
 * perform custom initialization, or merely to check that all mandatory
 * properties have been set.
 * 
 * An alternative to implementing InitializingBean is specifying a custom
 * init-method, for example in an XML bean definition using init-method
 * property.For a list of all bean lifecycle methods, see the BeanFactory
 * javadocs. } offers afterPropertiesSet() method
 * 
 * 
 * 
 * DisposableBean {Interface to be implemented by beans that want to release
 * resources on destruction. A BeanFactory is supposed to invoke the destroy
 * method if it disposes a cached singleton. An application context is supposed
 * to dispose all of its singletons on close.
 * 
 * An alternative to implementing DisposableBean is specifying a custom
 * destroy-method, for example in an XML bean definition using destroy-method
 * property.For a list of all bean lifecycle methods, see the BeanFactory
 * javadocs. } offers destroy() method
 */

public class Triangle implements Shape, ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {

	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	private ApplicationContext appContext;

	public void draw() {
		System.out.println("Drawing a triangle");
		System.out.println("Point A = " + "(" + pointA.getX() + "," + pointA.getY() + ")");
		System.out.println("Point B = " + "(" + pointB.getX() + "," + pointB.getY() + ")");
		System.out.println("Point C = " + "(" + pointC.getX() + "," + pointC.getY() + ")");
	}

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}

	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.appContext = arg0;
		System.out.println("Application context is: " + arg0);
	}

	public void setBeanName(String arg0) {
		System.out.println("Bean name is: " + arg0);

	}

	public void myInit() {
		System.out.println("My init method called for the Triangle");
	}

	public void myFinish() {
		System.out.println("My finish method called for the Triangle");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing beans init method called to bean Triangle");

	}

	public void destroy() throws Exception {
		System.out.println("Disposable beans destroyment called for the Triangle");

	}

}
