# poc-swagger-userservice

WIP

REST Api java projects frequently generate the Open API (Swagger) specification from the controllers.
This 'Code First' approach is usually more convenient for the developer mostly because it is faster to implement than the 'Design First' approach.
The differences between those two approaches is nicely described here: https://swagger.io/blog/api-design/design-first-or-code-first-api-development/


This Proof of Concept explores how Open API can be used in a spec-driven scenario where server AND client code are generated from specification to make Design First a faster alternative.
From one specification file, we will generate:
  - the Spring Boot Rest controller that the developer only has to plug in to its service layer and map to the generated DTOs.
  - the Retrofit Client that can be conveniently used by any other java projects using this API. 

-----

For this example, we will consider a very simple REST webservice: a User Service that returns a user from a repository.

### Webservice

The webservice project is splitted in the following different logical maven submodules:

#### `/userservice/api-doc`: 
  
Module that only contains the Open API specification of the api (`/userservice/api-doc/src/main/resources/api.yaml`):

`GET /user/{id}`

#### `/userservice/api-controller`: 
  
Spring boot application whose REST endpoints are generated directly from the Open API specification.

The UserRestController implements the generated `UserApi` and maps the objects provided by the service layer.

`UserApi` and generated code reside in `target/generated-sources`

#### `/userservice/services`: 
  
Simple jar used by the controller which contains the repositories where the users are stored and where business logic resides.

#### `/userservice/api-client`: 
  
Retrofit mappings generated from the Open API specification to query the webservice.

`UserApi` and generated code reside in `target/generated-sources`


### Demo client

A simple demo client is also provided and uses the Retrofit client library in `/external-api-user`

-----

To make it work:
  - Run `mvn clean install` from `/userservice`.
  - Run the Controller Spring boot application `java -jar api-controller/target/api-controller-0.0.1-SNAPSHOT.jar`.
  - Run `mvn clean install` from `/external-api-user`.
  - Run the Client application `java -jar target/external-api-user-0.0.1-SNAPSHOT-spring-boot.jar`.
 
 
 
 
 
  
  




