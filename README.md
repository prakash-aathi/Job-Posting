# Job Posting Backend API

This project is a Spring Boot application built to provide backend functionality for a job posting platform. It utilizes MongoDB for data storage and implements various endpoints for managing job posts. The application also configures Swagger for API documentation and utilizes MongoDB aggregation for implementing search functionality.

## Endpoints

### Get All Job Posts

- URL: `/posts`
- Method: `GET`
- Response Body (JSON):
```json
[
  {
    "desc": "string",
    "exp": "string",
    "location": "string",
    "profile": "string",
    "techs": [
      "string"
    ]
  }
]
```
### Create a Job Post

**URL**: `/posts`

**Method**: `POST`

**Request Body (JSON)**:
```json
{
  "desc": "string",
  "exp": "string",
  "location": "string",
  "profile": "string",
  "techs": [
    "string"
  ]
}
```
### Search Job Posts
- URL: /posts/{text}
- Method: GET
- Path Parameter: text (string): The search text
Response Body (JSON):

```json
[
  {
    "desc": "string",
    "exp": "string",
    "location": "string",
    "profile": "string",
    "techs": [
      "string"
    ]
  }
]
```
## Configuration
- The project is built using Spring Boot framework and requires the following dependencies:

   - Spring Web: Used for creating RESTful APIs
   - Spring Data MongoDB: Provides integration with MongoDB
   - Springfox Swagger UI: Generates API documentation using Swagger
## Running the Application

To run the application, follow these steps:
- Make sure you have MongoDB installed and running.
- Clone the project repository.
- Open the project in your preferred IDE.
- Configure the MongoDB connection details in the application.properties file.
- Build the project and resolve any dependencies.
- Run the main application class.
- Access the API documentation through Swagger UI at http://localhost:8080/swagger-ui.html.
