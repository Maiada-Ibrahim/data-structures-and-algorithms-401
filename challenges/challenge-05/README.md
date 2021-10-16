# Singly Linked List
linked list is a linear collection of data elements whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence.
we want to create it with outbuilt-in library

## Challenge
Create a Linked List class,this class should contain the following methods
insert,includes,to string

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

- Approach

(Can successfully instantiate an empty linked list
Can properly insert into the linked list
The head property will properly point to the first node in the linked list
Can properly insert multiple nodes into the linked list
Will return true when finding a value within the linked list that exists)-> for the insert methode  the Big O space/time for this is O(1)

(Will return false when searching for a value in the linked list that does not exist
Can properly return a collection of all the values that exist in the linked list) for the iclude and to string  methodes  the Big O space is O(1) and for time is O(n)


## API
insert : Adds a new node with its value to the first of the linkedlist

includes : take avalue and check if it in the linked list return true else return false.

toString : Returns all the value at the linked list as string at this format : "{ a } -> { b } -> { c } -> NULL"