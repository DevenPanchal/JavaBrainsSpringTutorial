# Spring Framework

Spring is one of the most popular enterprise application frameworks in the Java landscape today. It is so popular that it&#39;s even considered the de-facto standard for building large scale applications in Java today.

Spring is not just a framework. It&#39;s also a complete ecosystem of supporting frameworks and tools that provide you everything you need to build complex applications. It provides support for various common things that most enterprise applications need, like connecting to the database, managing business services, security and so on.

If you are extending code that was written using Spring, or setting out to write a new one, a good knowledge of Spring Core as well as the supporting frameworks used is very important.

[**Learning Spring Core**](https://javabrains.io/courses/spring_core)

This course provides an introduction to the Spring framework. You will understand the concepts of dependency injection, understand how the core Spring framework works and how to write an application using it.

This course covers:

- Understanding dependency injection
- Understanding the Spring application context
- Implementing a Spring application by configuring and using Spring beans
- Writing lifecycle hooks and BeanPostProcessors
- Writing event handling logic

**UNIT**

# 1

#### Introduction to Spring and Dependency Injection

Learn what the Spring Framework is all about. Understand the concept of Dependency Injection and get started with using the Spring framework. You&#39;ll learn how to setup your development environment to start writing Spring applications. You&#39;ll also create and inject Spring beans using XML configuration.

### 1.1 Understanding Dependency Injection

In this tutorial, we&#39;ll understand the concept of Dependency Injection and how it simplifies managing dependencies between objects

### 1.2 Setting Up

In this tutorial, we&#39;ll learn how to set up our Eclipse development environment to write Spring code.

### 1.3 Understanding Spring Bean Factory

In this tutorial, we&#39;ll discuss the role of Spring as a bean container. We&#39;ll also have a quick discussion on the Factory pattern, and I&#39;ll introduce you to the Spring Bean Factory object.

### 1.4 Writing Code Using the Bean Factory

In this tutorial, we&#39;ll write code to implement the BeanFactory concept that we learnt in our previous tutorial. We&#39;ll write a Spring XML to configure a Spring bean. Then we&#39;ll use the BeanFactory to instantiate our bean in the Spring container.

### 1.5 ApplicationContext and Property Initialization

We&#39;ll first replace the BeanFactory with the more powerful ApplicationContext. We&#39;ll then make Spring initialize a property of an object by specifying the value in the configuration XML.

### 1.6 Using Constructor Injection

We&#39;ll now use constructors to set the member variable values for our Spring beans. We&#39;ll also look at some techniques to resolve conflicts in the case of overloaded constructors.

### 1.7 Injecting Objects

In this tutorial, we&#39;ll use dependency injection to inject an object dependency to a Spring bean.

### 1.8 Inner Beans, Aliases and idref

In this tutorial, we&#39;ll look at some concepts related to bean naming and usage like alias and idref. We&#39;ll also understand how to write inner beans.

### 1.9 Initializing Collections

In this tutorial, we&#39;ll initialize a member variable that&#39;s a collection and each of the elements are references to other beans.

### 1.10 Bean Autowiring

We&#39;ll now look at a configuration feature provided by Spring to wire dependencies automatically: Bean Autowiring. We&#39;ll learn about different types of autowiring, and we&#39;ll write some code to implement bean autowiring by name.

**UNIT**

# 2

#### Scopes and Lifecycles

Understand the concept of scopes in a Spring application. Learn how to access the application context directly from your code. Use the bean inheritance feature to manage your configuration. Implement various post-processor hooks to tap into the lifecycle of your Spring application.

### 2.1 Understanding Bean Scopes

This tutorial covers the concepts of Bean Scopes in Spring. We&#39;ll understand when beans are created and how to configure different scopes for the beans.

### 2.2 Using ApplicationContextAware

We&#39;ll provide our beans with access to the ApplicationContext object by implementing the ApplicationContextAware interface. We&#39;ll also use BeanNameAware interface to get the name of the bean configured in the Spring XML.

### 2.3 Bean Definition Inheritance

In this tutorial, we&#39;ll learn what bean definition inheritance is, and how to configure a parent bean definition and have children beans inherit the bean definitions.

### 2.4 Lifecycle Callbacks

We&#39;ll use two different ways to run methods on initialization and destruction of beans.

### 2.5 Writing a BeanPostProcessor

In this tutorial, we&#39;ll understand what a BeanPostProcessor is. We&#39;ll also write a BeanPostProcessor that prints a message upon initializing each and every bean in the Spring XML.

### 2.6 Writing a BeanFactoryPostProcessor

In this tutorial, we&#39;ll learn about and write our own BeanFactoryPostProcessor. We&#39;ll also try out a handy BeanFactoryPostProcessor that comes with Spring: the PropertyPlaceholderConfigurer.

### 2.7 Coding To Interfaces

When using Spring for dependency injection, it&#39;s a good practice to use interfaces for referencing dependencies. In this tutorial, we&#39;ll learn how to &#39;code to interfaces&#39;.

**UNIT**

# 3

#### Annotations and Event Handling

There is an easier (and better) way to manage your Spring configuration - using Annotations. Learn how to declare and configure Spring beans using annotations. Learn how to autowire beans and implement component stereotypes. Also learn how to write and publish custom events in your Spring application

### 3.1 Introduction to Annotations and the Required Annotation

Here we&#39;ll have our first look at Spring annotations. We&#39;ll understand and implement the Required annotation, and we&#39;ll also learn how it&#39;s actually a BeanPostProcessor that&#39;s working behind the scenes.

### 3.2 The Autowired Annotation

In this tutorial, we&#39;ll use the Autowired annotation to wire up dependencies. We&#39;ll learn how to add dependencies by type and name. We&#39;ll also use Qualifiers to narrow down dependency contenders.

### 3.3 Some JSR-250 Annotations

We&#39;ll learn and implement three JSR-250 annotations that Spring supports:Resource, PostConstruct and PreDestroy.

### 3.4 Component and Stereotype Annotations

We&#39;ll now use the Component annotation to define Spring beans. We&#39;ll also look at some Stereotype annotations.

### 3.5 Using MessageSource To Get Text From Property Files

In this tutorial, we&#39;ll use the MessageSource interface to retrieve messages out of property files.

### 3.6 Event Handling in Spring

We&#39;ll now look at Spring&#39;s support for Event Handling. We&#39;ll write an event listener in this tutorial. I&#39;ll also show you how to write custom events and publish them anywhere in the code.


