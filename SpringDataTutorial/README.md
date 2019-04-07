
[**Data access in Spring**](https://javabrains.io/courses/spring_data)

Almost every application needs to access data. In this course, you will learn about Spring support for data access from relational databases.

This course covers:

- Understanding data access in Spring
- Implementing Spring&quot;s JDBC Template support
- Performing read and write operations
- Integrating with the Hibernate ORM framework

**UNIT**

# 1

#### Spring Data - What and Why?

Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.

It makes it easy to use data access technologies, relational and non-relational databases, map-reduce frameworks, and cloud-based data services. This is an umbrella project which contains many subprojects that are specific to a given database.

Its main modules are:

		Spring Data Commons - Core Spring concepts underpinning every Spring Data module.
		Spring Data JDBC - Spring Data repository support for JDBC.
		Spring Data JDBC Ext - Support for database specific extensions to standard JDBC including support for Oracle RAC fast connection failover, AQ JMS support and support for using advanced data types.
		Spring Data JPA - Spring Data repository support for JPA.
		Spring Data KeyValue - Map based repositories and SPIs to easily build a Spring Data module for key-value stores.
		Spring Data LDAP - Spring Data repository support for Spring LDAP.
		Spring Data MongoDB - Spring based, object-document support and repositories for MongoDB.
		Spring Data Redis - Easy configuration and access to Redis from Spring applications.
		Spring Data REST - Exports Spring Data repositories as hypermedia-driven RESTful resources.
		Spring Data for Apache Cassandra - Easy configuration and access to Apache Cassandra or large scale, highly available, data oriented Spring applications.
		Spring Data for Apace Geode - Easy configuration and access to Apache Geode for highly consistent, low latency, data oriented Spring applications.
		Spring Data for Apache Solr - Easy configuration and access to Apache Solr for your search oriented Spring applications.
		Spring Data for Pivotal GemFire - Easy configuration and access to Pivotal GemFire for your highly consistent, low latency/high through-put, data oriented Spring applications.

This unit introduces you to Spring Data's JDBC support and makes the case for it by contrasting it with just plain JDBC. Learn how Spring&#39;s data integration removes the boilerplate code you&#39;d typically have to write.

### 1.1 Introduction to Spring Data and Setting Up

This tutorial serves as an introduction to Spring Data support. We&#39;ll also install a lightweight database Apache Derby that we&#39;ll use in subsequent tutorials. We&#39;ll learn how to start Derby in Network server mode, and how to connect and run SQL queries using the ij client tool.

### 1.2 Using JDBC without Spring

We&#39;ll now implement a simple DAO class that fetches data from the database using JDBC. We&#39;ll look at all the boilerplate code we need to write to establish connections, execute queries, close objects and handle exceptions.

**UNIT**

# 2

#### Implementation and Template Classes

Learn about the various support classes provided by Spring for the purpose of data integration. Connect with database using JDBC and Hibernate using Spring&#39;s template classes.

### 2.1 Adding Spring and DataSource Configuration

We&#39;ll now add the Spring framework to our JDBC project. We&#39;ll add dependency injection to our Main and DAO class. We&#39;ll also learn how to configure DataSource as a Spring bean and supply connection parameters to it in the XML file.

### 2.2 Using JdbcTemplate

We&#39;ll use the JdbcTemplate class provided by Spring to implement a DAO method. We&#39;ll see how using the template class makes the DAO methods simple, and how it takes care of much of the boilerplate code we&#39;d have to write otherwise.

### 2.3 Returning Other Datatypes from JdbcTemplate

We returned an integer datatype result from our query in the previous tutorial. In this tutorial, we&#39;ll learn how to return other datatypes. We&#39;ll implement a method that returns a String query output.

### 2.4 Implementing RowMapper

In this tutorial, we implement a custom RowMapper class to map our domain objects. We then use this class to write fetch methods that return custom model objects.

### 2.5 Performing Write Operations with JdbcTemplate

We&#39;ll now implement some database write operations. We&#39;ll write a DAO method to update a value in the database, as well as use the execute() method to run a DDL SQL query.

### 2.6 Named Parameter JDBC Template

We&#39;ll use the NamedParameterJdbcTemplate class to run queries with named placeholders.

### 2.7 DAO Support Classes

We&#39;ll wrap up discussion on the Spring JDBC support by using the DAO support classes that Spring provides out of the box. We&#39;ll see how this makes our DAO classes cleaner than ever.

### 2.8 Using Hibernate with Spring

In this video, we&#39;ll learn how to integrate the Hibernate framework in our Spring application. We&#39;ll create a SessionFactory as a Spring singleton and use that in our DAO class to work with the database.

--------------------------------------------------
#### Notes:

1. JPA vs Hibernate:

JPA or Java Persistence API is a standard specification for ORM implementations whereas Hibernate is the actual ORM implementation or framework. JPA is Java Persistence API. ... Hibernate is a JPA provider/Vendor who responsible for implementing that APIs.


2. DAO vs Repository:

DAO is an abstraction of data persistence. Repository is an abstraction of a collection of objects.

DAO would be considered closer to the database, often table-centric. Repository would be considered closer to the Domain, dealing only in Aggregate Roots. A Repository could be implemented using DAO's, but you wouldn't do the opposite.

Also, a Repository is generally a narrower interface. It should be simply a collection of objects, with a Get(id), Find(ISpecification), Add(Entity). A method like Update is appropriate on a DAO, but not a Repository - when using a Repository, changes to entities would usually be tracked by separate UnitOfWork.

In this Spring project, we annotate DAO classes with @Repository too. :-(

3. DAO v/s DTO:

DAO is a class that usually has the CRUD operations like save, update, delete. Whereas the DTO is just an object that holds data. It is really a glorified JavaBean with instance variables and setter and getters. Usually it is the DTO that is passed to the save method of a DAO

