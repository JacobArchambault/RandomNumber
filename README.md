# RandomNumber
A Java tutorial I designed illustrating how to achieve both high class cohesion and loose coupling through the injection of object dependencies and the use of multiple implementations of interfaces. 

The base application the tutorial is based on generates random numbers to a .TXT file, then reads them from the file and prints them to a console. As indicated in the version control history, The application begins with a large body of procedural code executed entirely within a static main method. Separation of concerns is poor and temporal coupling is high. This application is refactored through successive commits to distinct functionality into various classes in accordance with the principles of SOLID programming design. 

The final result is an application making heavy use of dependency injection - the process of requiring objects to have other objects they depend on passed in as arguments to their constructors - even to the point of injecting strings and other instances of relatively low level classes. Because of this, it becomes possible to make all methods parameterless, since methods only use fields injected in their object's constructors. Furthermore through the use of multiple implementations of interfaces, code becomes more reusable and loose coupling of classes with their dependencies is achieved.
