# GwtBoot
A Maven template project to use GWT on the client and Spring Boot on the server.

## Motivation

GWT is a Java client framework and Sprint Boot is a popular convention-over-configuration web framework for Java.
With GWT write your client side code in Java instead of JavaScript or TypeScript. The benefit is:

1. Strong typing and abstractions which is useful for refactoring, documentation and code pruning.
2. GWT can optimize JS and client side resources (code pruning, renaming long method names, location/browser/device permuations,
3.  base64 images, css bundling). These features are integrated into GWT and do not rely on a wide array of <i>sometimes</i> maintained packages or pluings.
4. Code re-use. Java source inside the GWTClient's shared folder can be used on the server.

## Quick Start

1. The project inside the GwtClient folder is a standard GWT Project. Run this project in SuperDev Mode (by default, the codeserver
is running at `localhost:8888`). All GWT features are supported.
2. In the Server folder is a standard Spring Boot application with some configurations (JPA with H2 database, Thyme for templating). 
  Run the Spring Boot application as normal (usually at `localhost:8080`).
  The GWT host page is served by the Spring Boot server and gets the JavaScript generated from the SuperDev Mode codeserver.
  Open a browser to `localhost:8080`.
  
4. As you make changes to your client side code, the GWT codeserver will incrementally re-compile your changes.
5. Instead of GWT RPC, [Domino-rest](https://github.com/DominoKit/domino-rest) is used for server communication to standard Spring Boot REST controllers
6. To resuse code inside the GWTClient's shared folder, run `mvn install` inside the GWTClient. Then the shared
   library is available to the Spring Boot application. For example, put your Entities inside the shared folder for use by the
   client and server. The project configured the Spring Boot application to scan for the entities in the shared jar. 

## Examples
Coming...
