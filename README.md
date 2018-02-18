# Spring-HibernateWithXML
This project will be to explain Spring - Hibernate interaction using XML configurations.

Made changes to have Spring and hibernate configuration XML based.

This project is to demonstrate the usage of Spring-hibernate to query results from a database. 
Oracle 11 is used in here as the database.

AppDAO interface defines the function to list the entries in the locations table.
AppDAOImpl implements by using sessionFactory, hbm config files to connect to the db to list all the data in the Locations table
THe App class is the main service class is making the call to the DAO class to get the list of Locations.
jUnit test cases are used initiate the whole flow. jnuit test case calls, the function in the App (main service kinda).



*As and when the project adds more function, this file needs to get updated.