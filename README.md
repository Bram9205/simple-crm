# Simple CRM
#### Example project for technical assessments
This is a base project to support technical assessments.

The project entails an API for a simple CRM system in which customers can be created, retrieved and removed.
The customers are stored in an in-memory H2 database.

The code is not completely finished yet, this is your assignment.

## TODO
1. Add an endpoint for retrieving all customers
    * Add a REST controller
    * Add a service to handle the request
    * Add a unit test for this service
    * Make sure `./mvnw clean install` runs successfully
2. Add an endpoint for creating a new Customer
    * Extend your REST controller
    * Extend your service
    * Extend your unit tests
    * Make sure `./mvnw clean install` still runs successfully
3. Add an endpoint for retrieving a Customer by id
   * Extend your REST controller
   * Extend your service
   * Extend your unit tests
   * Make sure `./mvnw clean install` still runs successfully
4. Add an endpoint for deleting a Customer by id
   * Extend your REST controller
   * Extend your service
   * Extend your unit tests
   * Make sure `./mvnw clean install` still runs successfully
