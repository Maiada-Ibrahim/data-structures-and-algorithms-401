input : [8,4,23,42,16,15]

n=6
n>1 true
mid=3
left=[8,4,23]
right=[42,16,15]
mergesort(left)--->
n=3
n>1  true
mid =1
left=[8]
right=[4,23]

mergesort(left)--->
n>1  false
mergesort(right)--->
n=2
n>1  true
left=[4]
right=[23]
mergesort(left)--->
n>1  false
mergesort(right)--->
n>1  false
Merge([4],[23],[4,23])--->[4,23]


Merge([8],[4,23],[8,4,23])--->[4,8,23]



mergesort(left)--->
n=3
n>1  true
mid =1
left=[42]
right=[16,15]

mergesort(left)--->
n>1  false
mergesort(right)--->
n=2
n>1  true
left=[16]
right=[15]
mergesort(left)--->
n>1  false
mergesort(right)--->
n>1  false
Merge([16],[15],[16,15])--->[15,16]


Merge([42],[15,16],[42,15,16])--->[15,16,42]



Merge([4,8,23],[15,16,42],[8, 4, 23, 42, 16, 15])--->[4, 8, 15, 16, 23, 42]


her we still divide the array until still in every array anumber compare them put the larger at the left 
then go back and compare two part still do that until we reach to the parts that define the primary array