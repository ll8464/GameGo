## GameGO

Gaming Store MVC Java Spring project.

The REST API has CRUD functionality and implements separation of concerns using MVC as the design method.

The first stepping stone is to get the API up and running. This requires the controller and service implementation.

- Controller Implementation

- DAO - Games, Consoles

- Service Implementation
- Model Memory (Initially)

# Model

~~ The model is initially using memory. A database implementation will occur at a future date. ~~

The current iteration utilizes Apache Derby. JPA, now jakarta, is used for the Object Relationship Mapping (ORM).

# View

A front-end web interface that allows the addition and removal of games can potentially be implemented.

UserI/O (input/output) - enable a user to perform all input/output operations for a data set

# Controller

Controller - The controller does not talk to the Repository. It interacts only with the Data Access Object and Service Layer.

# DAO/DTO

The two Data Access Objects are Game and Console.

- Game has the fields id, name, and cost
- Console has the fields id, name, cost and gameId

The Console has a Many to One relationship with game since multiple games can be on the same console.

# Issues

When creating a Console using the "/console/{gameId}" path, is a console id ever created? Or is the gameId being added as
the console id?

Turns out, the RequestBody when you make the POST request is for the console when using this path. This associates the
gameId in the pathVariable to the newly created Console.

Another finding is that adding another game to the same console overrides the previous game instead of adding to it.

Need a addGameToConsole method.
One idea for the addGametoConsole method is to turn the GameDAO field to a List and then simply add GameDAO objects to that list.
Another is to Embed the GameDAO to the Console Entity via Java Persistance Embeddables.

# Bug Log:

~~ The Game Endpoint cannot be found. ~~

This was a configuration issue. Added Configuration to the App file for each package which resolved the error.

~~500 Error -Circular view path [game]: would dispatch back to the current handler URL [/game] again ~~

This error was caused by using @Controller instead of @RestController
