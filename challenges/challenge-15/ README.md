# Trees
A Tree is a non-linear data structure where data objects are organized in terms of hierarchical relationship.
it contain from node and use root , right ,left to move in it using diff algorithim
## Challenge
Create a Binary Tree class
Define a method for each of the depth first traversals:

pre order;
in order;
post order which returns an array of the values, ordered appropriately.

--------------------------------------------------------------

Create a Binary Search Tree class
This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
- Add
Adds a new node with that value in the correct location in the binary search tree.
- Contains
## Approach & Efficiency
Big O for the methods :

- preOrder: Big O time is O(n),Big O Space is O(n+c) which c is node

- inOrder: Big O time is O(n),Big O Space is O(n+c) which c is node
- postOrder: Big O time is O(n),Big O Space is O(n+c) which c is node
- add : Big O time is O(n), Big O Space isO(n+c) which c is node

- contains: Big O time is O(n),Big O Space is O(n+c) which c is node

## API
BinaryTreeClass: this class to create a binary tress.

 three methods implemented for the three ways of traverse over tress using Depth First category as follows:

- Pre-order:returns an array of the values, ordered as root >> left >> right

 - In-order:returns an array of the values, ordered as left >> root >> right 

 - Post-order:returns an array of the values, ordered as left >> right >> root

Binary Search Tree: it is a rooted binary tree whose internal nodes each store a key greater than all the keys in the node's left subtree and less than those in its right subtree. The following methods created to support this kind of trees as follows:

- Add: it is accept value Arguments, and then decide the correct place to the new node based on the Binary Search Tree definition. note: a support private method (traverse) created to use inside this method.

- Contains: it accept value and return true if it exists at the tree.

