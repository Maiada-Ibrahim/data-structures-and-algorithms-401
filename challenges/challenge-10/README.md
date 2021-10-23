# Stacks and Queues
Stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.
Queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle.

## Challenge
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue
1. Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
2. Create a Stack class The class should contain the following methods:
- push
- pop
- peek
- is empty
3. Create a Queue class The class should contain the following methods
- enqueue
- dequeue
- peek
- is empty



## Approach & Efficiency
For all the method in Stack and Queue take same time and space complexity which is : Time -> O(1) Space -> O(1)

## API
## Stack method :
- push(value): used to insert node at the top of the stack (pushed), we need to pass element that want to be bushed .

- pop() : used to delete node from the top of the stack and we don't pass an arg. it checked if the stack is empty or not before conducting a pop to ensure that an exception is not raised.

- Peek(): function just returns the value of the top element available in the stack. it checked if the stack is empty or not before conducting a peek to ensure that an exception is not raised.

- isEmpty() : this function will return a true value if the stack is empty or otherwise it will return a false value.


## Queue
Create a Queue class that has a front property. It creates an empty Queue when instantiated. This object should be aware of a default empty value assigned to front when the queue is created. The class should contain the following methods:

- enqueue Arguments: value adds a new node with that value to the back of the queue with an O(1) Time performance.

- dequeue Arguments: none Returns: the value from node from the front of the queue Removes the node from the front of the queue Should raise exception when called on empty queue
- peek Arguments: none Returns: Value of the node located at the front of the queue Should raise exception when called on empty stack
- is empty Arguments: none Returns: Boolean indicating whether or not the queue is empty