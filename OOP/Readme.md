Programming Languages
=====================
* Programming languages allow programmers to develop software
* The three major families of languages are:
	* Machine languages
	* Assembly languages
	* High-Level languages

### Machine Languages
* Comprised of 1s and 0s
* The **"native" language** of a computer
* Difficult to program - one misplaced 1 or 0 will cause the program to fail
* Example of code:

  ```
  1110100010101 11101010111
  ```  
  ```
  1110100010101 11101011111
  ```
  
### Assembly Languages
* Assembly languages are a step towards easier programming.
* Assembly languages are comprised of a **set of elemental commands** which are tied to a specific processor.
* Assembly language code needs to be translated to machine language before the computer processes it.
* Example:

 ```
 ADD 1000010, 10110110
 ```
 
### High-Level Languages
* High-level languages represent a giant leap towards easier programming.
* The syntax of HL languages is similar to English.
	* Example:
	
		```
		grossPay = basePay + overTimePay
		```
* Historically, we divide HL languages into two groups:
 - Procedural languages
 - Object-Oriented languages (OOP)

#### Procedural Languages
* Early high-level languages are typically called procedural languages.
* Procedural languages are characterized by sequential sets of linear commands. The focus of such languages is on *structure*.
* Examples include C, COBOL, Fortran, LISP, Perl, HTML, VBScript

#### Object-Oriented Languages
* The focus of OOP languages is not on structure, but on *modeling data*.
* Programmers code using "blueprints" of data models called *classes*.
* Examples of OOP languages include C++, Java and C#.

OOP
===
* OOP is mainly a program design philosophy
* OOP uses a different set of programming languages than old procedural programming languages (C, Pascal, etc.).
* Everything in OOP is grouped as self sustainable "objects". Hence, you gain reusability by means of four main object-oriented programming concepts.
* In OOP programmers define not only the data type of a data structure, but also the types of operations/methods(functions) that can be applied to the data structure.
* In this way, the data structure becomes an object that includes both data and functions (methods) in one unit. In addition, programmers can create relationships between one object and another.
* For example, objects can inherit characteristics from other objects.

**Key idea in object oriented:**

*The real world can be "accurately" described as a collection of objects that interact.*

### Object-Oriented Programming Languages
* Pure OO Languages
> Eiffel, Actor, Emerald, JADE, Obix, Ruby, Python, Scala, Smalltalk, Self.

* Hybrid OO Languages
> Delphi/Object Pascal, C++, Java, C#, VB.NET, Pascal, Visual Basic, MATLAB,Fortran, Perl, COBOL 2002, PHP, ABAP, Ada 95.

### OOP Basic Terminology
***Object***
> Usually a person, place or thing (**a noun**)

***Method***
> An action performed by an object (**a verb**)

***Property or attribute***
> Characteristics of certain object

***Class***
> A category of similar objects (such as *automobiles*), *does not hold any values of the object's attributes/properties*

Classes and Objects
===
* A ***class*** is a prototype, idea, and blueprint for creating objects.
* An ***object*** is an instance of a class.
* For example, in Java we define classes, which in turn are used to create objects
* A class has a ***constructor*** for creating objects
* *Class* is composed of three things: its name, attributes/properties, and methods.

A ***class*** is a defination of objects with the same properties and the same methods.

```
class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
	void changeCadence(int newValue) {
		cadence = newValue;
	}
	
	void changeGear(int newValue) {
		gear = newValue;
	}
	
	void speedUp(int increment) {
		speed = speed + increment;
	}
	
	void applyBreaks(int decrement) {
		speed = speed - decrement;
	}
}
```

### What Is an Object, again?###

An object is an instance of a class


## More about objects
 Informally, an object represents an entity, either physical, conceptual, or software.

	1. Physical entity - Truck
	2. Conceptual entity - Chemical Process 
	3. Software entity - Linked List

### More formal defination of an "Object"

An object is a computational entity that:

	1. Encapsulates some state
	2. Is able to perform actions, or methods, on this state
	3. Communicates with other objects via message passing

	
Each copy of an object from a particular class is called an ***instance*** of the class.

The act of creating a new instance of an class is called **instantiation**

### In short...

* **An Object is a Class when it comes alive!**
* Homo Sapien is a **class**, John and Jack are **objects**
* Animal is a **class** "Snowball" the cat is an **object**
* Vehicle is a **class** My neighbor's BMW is an **object**
* Galaxy is a **class**, the MilkyWay is an **object**

### Technical contrast between Objects & Classes

|CLASS|OBJECT|
|-----|------|
|Class is a data type| Object is an instance of Class.|
|It generates OBJECTS|It gives life to CLASS|
|Does not occupy memory location|It occupies memory location.|
|It cannot be manipulated because it is not available in memory (except static class)| It can be manipulated.|

**Object is a class in "runtime"**

OOP Basic Concepts
===

* Encapsulation
* Inheritance
* Abstraction
* Polymorphism

## Encapsulation

* Is the inclusion of property & method within a class/object in which it needs to function properly.
* Also, enables reusability of an *instant* of an already implemented class within a new class while ***hiding & protecting*** the method and properties from the client classes.
* The class is kind of a container or capsule or a cell, which encapsulate the set of methods, attributes and properties to provide its indented functionalities to other classes.
* In that sense, encapsulation also allows a class to change its internal implementation without hurting the overall functioning of the system.
* That idea of encapsulation is to hide how a class does its operations while allowing requesting its operations.

### Encapsulation in action
Example:

Let's say we have a class called "Date" (day, month, year). And then you need to define another class called "Person" that has the following attributes (first name, last name, and birthdate). So in this case we can instantiate an object from class "Date" inside class "Person".

### Encapsulation Benefits

* Ensures that structural changes remain local:
	* Changing the class internals does not affect any code outside of the class
	* Changing methods' implementation does not reflect the clients using them
* Encapsulation allows adding some logic when accessing client's data
	* E.g. validation on modifying a property value
* Hiding implementation details reduces complexity
	* easier maintenance

## Inheritance

* *Inheritance* -  a way of organizing classes
* Term comes from inheritance of traits like eye color, hair color, and so on.
* Classes with properties in common can be grouped so that their common properties are only defined once in parent class.
* *Superclass* - inherit its attributes & methods to the subclass(es).
* *Subclass* - can inherit all its superclass attributes & methods besides having its own unique attributes & methods.
* Inheritance allows child classes to inherit the characteristics of existing parent class
	* Attributes (fields and properties)
	* Operations (methods)
* Child class can extend the parent class
	* Add new fields and methods
	* Redefine methods (modify existing behavior)
* A class can implement an interface by providing implementation for all its methods
* Expresses commonality among classes/objects
* Allows code reusability
* Highlights relationships
* Helps in code organization

## Abstraction

* Abstraction is a design principle.
* Is the process of removing characteristics from something in order to reduce it to a set of essential characteristics.
* Through the process of abstraction, a programmer hides all but the relevant data about a class in order to reduce complexity and increase reusability.
* Abstraction in a basic representation of a concept.
* Abstraction allows programmers to represent complex rela world in the simplest manner.
* It is a process of identifying the relevant qualities and behaviors an object should possess, in other word represent the necessary features without representing the back ground details
* You should always use abstraction to ease reusability, and understanding for the design and enable extension.
* When we design the abstract classes, we define the *framework* for later extensions.
* An abstract class, which declared with the "abstract" keyword, cannot be instantiated.
* It can only be used as a super-class for other classes that extend the abstract class. Abstract class is a design concept and implementation gets completed when it is being realized by a subclass.
* An ***abstract class*** is a class that may not have any direct instances.
* An ***abstract operation*** is an operation that it is incomplete and requires a child to supply an implementation of the operation.

## Polymorphism

* Encapsulation, Inheritance, and Abstraction concepts are very related to Polymorphism.
* Polymorphisms is a generic term that means "many shapes". More precisely Polymorphisms means the ability to request that the same *methods* be performed by a wide range of different types of things.
* In *OOP*, *polymorphisms* is a technical issue and priciple.
* It is achieved by using many different techniques named method overloading, operator overloading, and method overriding.
* An object has "multiple identities", based on its class inheritance tree
* It can be used in different ways
* In Java, two or more classes could each have method called `output`
* Each `output` method would do the right thing for the class that is was in.
* One `output` might display a number (output.number) in one class, whereas it might display a name (output.text) in another class.
* It is the ability to look at a class in its parent image.

Example:

```
public abstract class Robot
{
	public virtual abstract void Move(); 
}

public class LeggedRobot : Robot
{
	public override void Move()
	{
	   //actions of legged robot to move
	}
}

public class WheeledRobot : Robot
{
	public override void Move()
	{
	   //actions of wheeled robot to move
	}
}

public void moveRobot(Robot A)
{
	A.Move();
}

public moveAllRobots()
{
	LeggedRobot lr = new LeggedRobot();
	WheeledRobot wr = new WheeledRobot();
	
	moveRobot(lr);
	moveRobot(wr);
}
```

### Advantages of OOP

* Code reuse & recycling
* Improved software-development productivity
* Improved software maintainability
* Faster development
* Lower cost of development
* Higher-quality software
* Encapsulation

### Disadvantages of OOP

* Steep learning curve
* Could leed to larger program sizes
* Could produce slower programs

