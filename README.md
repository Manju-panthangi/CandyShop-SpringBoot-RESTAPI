# CandyShop-Spring-Boot-REST-API-Project

 The primary goal of this project (CandyShop-Spring-Boot-REST-API-Project) is to develop APIs for the backend of a Ecommerce CandyShop application. I will be using Java, Spring Boot Framework with Java Persistence API and MySql  to develop this application backend.

## SOFTWARE REQUIREMENTS

Any IDE that supports spring boot (I have used IntelliJ IDEA Community)
<br>
[**IntelliJ IDEA Community**](https://www.jetbrains.com/idea/download/#section=windows)

 
Any version above 8 will work
<br>
[**Java**](https://www.java.com/download/ie_manual.jsp)

Database
<br>
[**MySql**](https://www.mysql.com/downloads/)



## SETUP AND RUN INSTRUCTIONS

1. As a prerequisite you need to have all the software requirements intsalled on your system.
2. Clone the repository and change the directory.

```
git clone https://gitlab.com/Manjushree_Panthangi/candyshop-spring-boot-rest-api-project.git
cd candyshop

```

 3. Go to application.properties.
<br>
    ![Alt text](Resources/fileStructureForApplicationProperties.PNG)
<br>
4. Update username and password of mysql in application.properties


```
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
```
   
By default username is root with no password.
<br>
5. Run CandyshopApplication.java file.
<br>
6. Open http://localhost:8080/swagger-ui/index.html# in browser.
<br>
7.  Enter /v3/api-docs in explore.

This opens up a swagger.

Swagger describes the structure of the REST API so that machines can read and mock them.
By this automations made by Swagger, the API documentation process is a lot easier for developers to generate and maintain.



## Functionalities

### Roles
1. Customer
2. Admin

## CandyShop Functionalities

1. The system will support anyone to view the candies menu.

## Usecases and API Endpoints For CandyShop
| API Method        | URI           | Usecase  |
| ------------- |-------------|-----|
| GET    | "/menu"     |   Display candies table|

## Customer Functionalities

 1. The system will support registeration of the Customer.
 2. A customer will be able to place an order.
 3. A customer will be able to view his placed orders.


## Usecases and API Endpoints For Customer
| API Method        | URI           | Usecase  |
| ------------- |---------------|-----|
| POST    | "/customer/registration"     |   Add a customer to customer table|
| POST      | "/customer/order" | Add an order to order table for a customer|
| GET      | "/customer/ordersByCustomerId/{customerId}" | Get customer by id |

## Admin Functionalities

 1. Admin will be able to prepare menu by adding candies.
 2. Admin will be able to view all the orders placed by the customer.
 3. Admin will be able update the status of an order to success, failed or delivered.

## Usecases and API Endpoints For Admin
| API Method        | URI           | Usecase  |
| ------------- |-------------|-----|
| POST    | "admin/addCandy"     |   add a cady to candy table|
| GET      | "admin/orders" | get all rows from orders table |
| PUT      | "admin/updateOrderStatus" | update order status value in orders table using order id|

## [Database Design](https://app.quickdatabasediagrams.com/#/d/jYF3CD)

<br>
![db Design](Resources/CandyShopDatabaseDiagram.PNG)
