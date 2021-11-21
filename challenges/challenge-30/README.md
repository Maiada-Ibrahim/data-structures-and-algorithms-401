# Hashtables
Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.
- A hash table is an unordered collection of key-value pairs, where each key is unique.
- Buckets - A bucket is what is contained in each index of the array of the hashtable. 

## Challenge
Implement a Hashtable Class with the following methods:

- add
Arguments: key, value
Returns: nothing

- get
Arguments: key
Returns: Value associated with that key in the table
- contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.
- hash
Arguments: key
Returns: Index in the collection for that key

## Approach & Efficiency
- add: takes two arguments(key, value), and then hash the key, and add the key and value pair to the table, handling collisions as needed,time complexity of O(n^2) since there is a nested loops, and space complexity of O(n) in worst cases.

- get: takes one argument(key), and returns the value associated with that key in the table,time complexity will be O(n)becase loop, and O(1) for space complexity.



- contains: takes one argument(key), and returns true or false based on key exists in the table already,time complexity will be O(n)becase loop, and O(1) for space complexity no change in space wile loopiing


- hash:time and space complexity of O(1), there is no present for loops or any new data structure.

## API
- Adding a key/value to your hashtable results in the value being in the data structure
- Retrieving based on a key returns the value stored
- Successfully returns null for a key that does not exist in the hashtable
- Successfully handle a collision within the hashtable
- Successfully retrieve a value from a bucket within the hashtable that has a collision
- Successfully hash a key to an in-range value