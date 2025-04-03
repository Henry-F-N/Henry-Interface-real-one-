# Interfaces and Iterators
This repo provides some practice with the concept of an interface and the idea of the Iterator design pattern.

## Interfaces
An interface is a way for programmers to ensure that objects contain certain method. It's useful if you have several related classes but they should all have the same method.

A super generic example:
You could have a `Vehicle` interface that requires `start()` and `stop()` methods.  You could then implement `Car`, `Truck`, `Motorcycle` classes. Storing several objects of all of these types in an array of `Vehicles` would allow you to loop through and call `start()` and `stop()` on them. 

## Iterator
An iterator is a design pattern (interface) that defines an object that takes a collection (array, `ArrayList`). The idea is that it iterates over the collection in a certain way without the programmer having to worry about loop mechanics (because someone already did it for them!). 

`getNext()`: Gets the next item in the iteration

`hasMore()`: Whether there are more things to iterate through