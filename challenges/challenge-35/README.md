# Graphs
<!-- Short summary or background information -->

## Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

- add node

- add edge

- get nodes

- get neighbors

- size

## Approach & Efficiency
- addNode: Time complexity O(1) no looping , space complexity O(n) change space take more to add at graph
- addEdge: Time complexity O(1) no looping , space complexity O(1) no change at space we add edge btween two node we added before 
- getNodes: Time complexity O(n) loop at Neighbors, space complexity O(1) no change at space.
- getNeighbors: Time complexity O(1) get all Neighbors for spicfic node so no looping  , space complexity O(1) no change at space.
size: Time complexity: O(n) loop at Neighbors  , Space complexity -> O(1) no change at space.

## API
- addNode Arguments: value Returns: The added node Add a node to the graph

- addEdge Arguments: 2 nodes to be connected by the edge, weight Returns: nothing Adds a new edge between two nodes in the graph , and assign a weight to the edge Both nodes should already be in the Graph
- getNodes Arguments: none Returns all the nodes in the graph as a collection.

- get neighbors Arguments: node Returns a collection of edges connected to the given node Include the weight of the connection in the returned collection

- size Arguments:  Returns the total number of nodes in the graph