Accounts API
============

## Technologies Used ##
1. Java 8
2. Spring boot 2.1.5
3. HSQLDB

## How To ##
The API jar can be built by downloading the Repository and running the command **mvn package**  
from AccountsAPI.

To run the jar, **cd** to **AccountsAPI/target** and run **java -jar AccountsAPI-1.0.jar**.  
This deploys the API on port **8082**.

## The Database ##

I have used HSQLDB for developing this API.  
The Database has three tables. The details of these can be found inside **src/main/resources/schema.sql**.  
The Data used in these tables, can be found inside **src/main/resources/data.sql**.

## Exception Handling ##

I have used the Generic Exception handling concept of Spring by using the **@RestControllerAdvice**. 
Any unexpected exception in the API will trigger the method **GenericExceptionHandler/handleAllException** which  
returns an error object (constructed using the model class ErrorDetail.java) to the client. 

The error object contains a unique ID and the exception message.  
The ID and stacktrace are written to logs.  
Using this Id, the developer can visit logs to find the full stacktrace.

If the provided input is not valid, then a custom exception is thrown and a similar error object is returned to client.

## End Points ##

Three end points can be accessed.  
1. **/getAccounts** : this returns the list of accounts. (http://localhost:8082/getAccounts)  
2. **/getTransactions/{accountNumber}** : this returns the list of account transactions or the error object if the account number is invalid. (http://localhost:8082/getTransactions/5853092093)  
3. **/testExceptionHandling** : an end point just to see the error object construction.  (http://localhost:8082/testExceptionHandling)

## Unit tests ##
Both the methods are covered using Unit Tests in AccountsControllerTest.java

## Results ##

1. Result of getAccounts call:

![alt text](https://github.com/venki276/AccountsAPI/blob/master/Endpoint1.jpg)

2. Result of getTransaction/{accountNumber} call:

![alt text](https://github.com/venki276/AccountsAPI/blob/master/Endpoint2.jpg)

3. Result of testExceptionhandling call:

![alt text](https://github.com/venki276/AccountsAPI/blob/master/Endpoint3.jpg)

**End of File**
