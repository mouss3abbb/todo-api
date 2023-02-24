# Todo-API
Simple Todo API with mongodb integration

## End points
Main end point is `todos/`

Sub end points are 

- `get-all/` : Return all available todos

- `get/{id}` : Get a todo by an id

- `add-todo/` : Adds new todo with json body {`title`, `description`}

- `delete/{id}` : Deletes a todo with the specific id

## Configuration

You can specify the server and port with mongodb db name, host and port in the `application.yml` file found in res directory

## Installation

You can simply build and run the api with Maven installed

First, you first need to build the project using `mvn compile` then run `mvn package` that will create a .jar file

To run it use `java -jar target/todo-api-0.0.1-SNAPSHOT.jar` 
