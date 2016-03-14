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
* Assembly language code needs to be translated to machin language before the computer processes it.
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
* In OOP programmers define not only the data type of a data structure, but alse the types of operations/methods(functions) that can be applied to the data structure.
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