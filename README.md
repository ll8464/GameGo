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

# Log:

~~ The Game Endpoint cannot be found. ~~

This was a configuration issue. Added Configuration to the App file for each package which resolved the error.

~~500 Error -Circular view path [game]: would dispatch back to the current handler URL [/game] again ~~

This error was caused by using @Controller instead of @RestController
