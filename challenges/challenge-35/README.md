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
- addNode: Time complexity O(1), space complexity O(n).
- addEdge: Time complexity O(1), space complexity O(1).
- getNodes: Time complexity O(n), space complexity O(1).
- getNeighbors: Time complexity O(1), space complexity O(1).
## API
- addNode Arguments: value Returns: The added node Add a node to the graph

- addEdge Arguments: 2 nodes to be connected by the edge, weight Returns: nothing Adds a new edge between two nodes in the graph , and assign a weight to the edge Both nodes should already be in the Graph
- getNodes Arguments: none Returns all the nodes in the graph as a collection.

- get neighbors Arguments: node Returns a collection of edges connected to the given node Include the weight of the connection in the returned collection

- size Arguments:  Returns the total number of nodes in the graph