# Project structure and build

A Java project is composed with a `src/Main.java` who is the starter of our program, the principal file.

To run the program we need to build our java file, to do that we simply execute `javac Main.java` in terminal, this
will create a `Main.class` file, and with that we can simply run it `java Main`.

# Objects, Classes, Interfaces, Packages, and Inheritance

Objects it's a software bundle of related state and behavior. If we are dealing with a person object, this object will 
have the follow states: healthy, employed, happy, etc. And will be these behaviors: running, seeking friends, cooking.
States are fields (variables in almost all languages), and behaviors are methods.

The methods manipulate the states, and a common pattern is to hide states to only be accessed by methods, this is known
as data encapsulation.

# Class

In our program we will have a lot of objects to interact. And we can have various objects of the same kind, like a 
bicycle, that can be a faster bicycle, a bicycle for the mountains and go on. All these bicycles objects will belong
to one blueprint, those are instances of a class known as bicycles.

# Inheritance
In oop we have subclasses of a superclass. Each class has one superclass and a superclass can have a unlimited number of
classes.
To create a subclass we simply `extends` a superclass.