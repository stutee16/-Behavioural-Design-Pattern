# Design Patterns in Java

This repository showcases various design patterns implemented in Java, focusing on Creational, Structural, and Behavioral design patterns. Each section includes examples demonstrating the use of these patterns through practical use cases.

## Table of Contents
- [Creational Design Patterns](#creational-design-patterns)
  - [Singleton Pattern](#singleton-pattern)
  - [Factory Pattern](#factory-pattern)
- [Structural Design Patterns](#structural-design-patterns)
  - [Adapter Pattern](#adapter-pattern)
  - [Decorator Pattern](#decorator-pattern)
- [Behavioral Design Patterns](#behavioral-design-patterns)
  - [Strategy Pattern](#strategy-pattern)
  - [Observer Pattern](#observer-pattern)
- [Usage](#usage)
- [License](#license)

## Creational Design Patterns

Creational design patterns deal with object creation mechanisms, aiming to create objects in a manner suitable for the situation. They help to decouple the object creation process from the business logic.

### Singleton Pattern Demo

This project demonstrates the **Singleton Design Pattern** in Java through a database connection manager. The Singleton Pattern ensures a class has only one instance and provides a global point of access to it.

#### Overview

In this project, the **DatabaseConnection** class is designed as a singleton to manage database connections. By using the Singleton Pattern, we ensure that there is only one instance of the database connection throughout the application.

#### Problem Description

- The application needs a consistent way to access the database without creating multiple instances of the connection.
- Instead of allowing multiple instances, the **Singleton Pattern** restricts the instantiation of the **DatabaseConnection** class to one object.

#### Components

1. **DatabaseConnection Class**: The singleton class that manages database connections.
2. **getInstance() Method**: Provides the global access point to the singleton instance.
3. **executeQuery() Method**: Represents a method to execute SQL queries on the database.
4. **SingletonPatternDemo**: The main class demonstrating the use of the singleton database connection.

### Factory Pattern Demo

This project demonstrates the **Factory Design Pattern** in Java through a vehicle creation system. The Factory Pattern provides a way to create objects without specifying the exact class of object that will be created.

#### Overview

In this project, the **VehicleFactory** class is used to create different types of vehicles (like **Car** and **Bike**) based on input. The Factory Pattern abstracts the object creation process, allowing for easy extension of new vehicle types.

#### Problem Description

- The application needs to create different types of vehicles without tightly coupling the code to specific vehicle classes.
- By using the **Factory Pattern**, the application can easily introduce new vehicle types without changing existing code.

#### Components

1. **Vehicle Interface**: Defines a common interface for all vehicle types.
2. **Car Class**: Implements the **Vehicle** interface for car creation.
3. **Bike Class**: Implements the **Vehicle** interface for bike creation.
4. **VehicleFactory Class**: The factory class that creates vehicle instances based on input.
5. **FactoryPatternDemo**: The main class demonstrating the vehicle creation process.

## Structural Design Patterns

Structural design patterns deal with object composition and help define how objects and classes can work together to form larger structures.

### Adapter Pattern Demo

This project demonstrates the **Adapter Design Pattern** in Java through a media player system. The Adapter Pattern allows incompatible interfaces to work together by converting the interface of a class into another interface expected by the client.

#### Overview

In this project, the **AudioPlayer** class uses the Adapter Pattern to play different audio formats (like **mp3**, **vlc**, **mp4**) using a **MediaAdapter**. This allows the media player to support various audio formats without changing its structure.

#### Problem Description

- The application needs to play different media formats, but the existing media player only supports a limited number of formats.
- The **Adapter Pattern** allows the player to adapt to new media formats dynamically.

#### Components

1. **MediaPlayer Interface**: Defines a common interface for media playback.
2. **AudioPlayer Class**: The main media player class that uses adapters to support different formats.
3. **MediaAdapter Class**: Adapts different audio formats to work with the **AudioPlayer**.
4. **AdvancedMediaPlayer Interface**: Defines methods for playing advanced media formats.
5. **AdapterPatternDemo**: The main class demonstrating the media player functionality.

### Decorator Pattern Demo

This project demonstrates the **Decorator Design Pattern** in Java through a coffee shop system. The Decorator Pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

#### Overview

In this project, different types of coffee can be dynamically enhanced with various toppings (like **Milk** and **Sugar**) using decorators. This allows for flexible combinations of coffee types and toppings.

#### Problem Description

- The application needs to offer customizable coffee options without modifying existing coffee classes.
- The **Decorator Pattern** allows new behavior to be added to coffee objects at runtime.

#### Components

1. **Coffee Interface**: Defines a common interface for all coffee types.
2. **SimpleCoffee Class**: Implements the **Coffee** interface for basic coffee.
3. **CoffeeDecorator Class**: Abstract class that implements the **Coffee** interface and has a reference to a **Coffee** object.
4. **MilkDecorator and SugarDecorator Classes**: Concrete decorators that extend **CoffeeDecorator** to add milk and sugar, respectively.
5. **DecoratorPatternDemo**: The main class demonstrating the coffee customization process.

## Behavioral Design Patterns

Behavioral design patterns deal with object interaction and responsibility delegation among objects.

### Strategy Pattern Demo

This project demonstrates the **Strategy Design Pattern** in Java through a payment system in a shopping cart. The Strategy Pattern allows a client to choose an algorithm or method at runtime.

#### Overview

In this project, the **ShoppingCart** class can use different payment strategies (like **CreditCardPayment** and **PayPalPayment**) to process payments. By using the Strategy Pattern, the system is flexible and can accommodate new payment methods without modifying existing code.

#### Problem Description

- The **ShoppingCart** needs to handle payments using different methods, such as credit card and PayPal.
- Instead of hardcoding the payment method into the cart, we use the **Strategy Pattern** to allow the cart to switch between different payment strategies at runtime.

#### Components

1. **PaymentStrategy Interface**: Defines a common interface for all payment strategies.
2. **CreditCardPayment Class**: Implements the **PaymentStrategy** interface for credit card payments.
3. **PayPalPayment Class**: Implements the **PaymentStrategy** interface for PayPal payments.
4. **ShoppingCart Class**: The client that uses a payment strategy to handle payment processing.
5. **StrategyPatternDemo**: The main class demonstrating the payment process using different strategies.

### Observer Pattern Demo

This project demonstrates the **Observer Design Pattern** in Java through a weather monitoring system. The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.

#### Overview

In this project, a **WeatherStation** serves as the subject that notifies various observers (like **PhoneDisplay** and **WebDisplay**) of changes in weather conditions. By using the Observer Pattern, we can easily add or remove observers without modifying the subject.

#### Problem Description

- The application needs to provide real-time weather updates to multiple displays.
- The **Observer Pattern** allows displays to register for updates and receive notifications automatically when the weather changes.

#### Components

1. **Subject Interface**: Defines methods for attaching and detaching observers.
2. **WeatherStation Class**: The subject that maintains a list of observers and notifies them of changes.
3. **Observer Interface**: Defines the update method for observers to receive notifications.
4. **PhoneDisplay and WebDisplay Classes**: Concrete observers that implement the **Observer** interface.
5. **ObserverPatternDemo**: The main class demonstrating the weather monitoring system.

## Usage

To use the patterns in this repository, clone the repository and run the respective **Demo** classes for each pattern to see how they work in action.

## License

This project is licensed under the MIT License.
