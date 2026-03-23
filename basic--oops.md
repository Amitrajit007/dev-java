## 1. **Class**
A class is a blueprint for creating objects. It defines the structure (attributes) and behavior (methods) that objects will have.

```java
public class Car {
    // Class definition
    String color;
    void drive() { }
}
```

## 2. **Object**
An object is an instance of a class a concrete realization of the blueprint.

```java
Car myCar = new Car();  // myCar is an object
```

## 3. **Instance Variable**
Variables that belong to individual objects. Each object has its own copy of instance variables.

```java
public class Person {
    String name;  // Instance variable
    int age;      // Instance variable
}
```

## 4. **Static Variables**
Variables shared by all instances of a class. They belong to the class, not individual objects.

```java
public class Student {
    static int totalStudents = 0;  // Shared by all Student objects
    String name;
}
```


## 5. **Taking Input Through Command Line**
Passing data to a program through command-line arguments.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);  // args[0] is first argument
    }
}
// Run: java Main HelloWorld
```

## 6. **Abstraction**
Hiding implementation details and showing only essential features to the user.

```java
public abstract class Animal {
    abstract void makeSound();  // Hide how sound is made
    // have to override this in the cild mandetory.
}
```


## 7. **Encapsulation**
Bundling data and methods together, controlling access using access modifiers (private, public, protected).

```java
public class BankAccount {
    private double balance;  // Hide balance from direct access
    
    public void deposit(double amount) {
        balance += amount;
    }
}
```

## 8. **Inheritance**
A class (child) inherits properties and methods from another class (parent).

```java
public class Vehicle {
    void start() { }
}

public class Car extends Vehicle {
    // Car inherits start() method
}
`