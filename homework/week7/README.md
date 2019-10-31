## Homework 7 - Week 7

### Motivation
* Demonstrate your ability to program using generics in the Java programming language.

### Instructions
* There are five tasks to complete.
    - Create a [Repository](src/main/java/edu/nyu/cs9053/homework7/Repository.java) which uses Java generics.  The `Repository` should be able to store an array (Java array) of the generic type.  There should be an `add` method (returning a `boolean` type indicating if the value was added, it should only be added if it doesn't already exist within the array), a `contains` method (returning a `boolean` type), a `remove` method (returning a `boolean` if the value was found and removed from the array), a `get` method which takes an `int` index into the array (returning the generic type which is the value at the index, if the index does not exist an exception or null can be returned) and a `size` which returns the current amount of items inside the underlying array (returning an `int`).
    - Create a subclass of [Repository](src/main/java/edu/nyu/cs9053/homework7/Repository.java) which uses generics but only accepts the generic type extending from [Animal](src/main/java/edu/nyu/cs9053/homework7/Animal.java).  It should be named [Barn](src/main/java/edu/nyu/cs9053/homework7/Barn.java).  Create this `Animal` interface with one method of signature `String getName()`.
    - Create a [BarnTransfer](src/main/java/edu/nyu/cs9053/homework7/BarnTransfer.java) which has one method (an instance method) which can transfer any similar `Barn` class values between each other.  For this to be correct any generic type which can be polymorphically assigned should be able to be exchanged.  The exchange will be to copy values from one `Barn` into another.  It will not remove any items. 
    - Create an implementation of `Animal` which is a particular type of barnyard animal.   Make it have an instance field `name` of type `String`.
    - For every type used by the `Repository` or its subclasses, create an implementation of the [ArrayCreator](src/main/java/edu/nyu/cs9053/homework7/ArrayCreator.java).  The `ArrayCreator` is an interface with a generic parameter.  It has one method `create` which takes in an `int` which is the size of the array to create for the parameter and it returns an array of that parameter type.

### Implementation
* Ensure your code is correct by compiling and testing it.
* You must not use any [Java collection types](https://en.wikipedia.org/wiki/Java_collections_framework)
* Use immutable data (hint, see class [AtomicReference](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicReference.html)).
* Ensure proper style.
* Ensure your `Animal` implementation has proper `equals` and `hashCode` implementations.
* Do not repeat past mistakes.
* A portion of your grade will be based upon readability and organization of your code.
    - Follow the naming guidelines of lecture
    - Break large functions into multiple functions based on logical organizations
    