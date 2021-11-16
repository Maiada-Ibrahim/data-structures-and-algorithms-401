input : [8,4,23,42,16,15]

n=6
n>1 true
mid=3
left=[8,4,23]
right=[42,16,15]
divide the array at mid


mergesort(left)---> call the functin again with left array to divide it 
n=3
n>1  true
mid =1
left=[8]
right=[4,23]

mergesort(left)--->  still in the left just one element
n>1  false
mergesort(right)--->  call call the functin again with right array to divide it 
n=2
n>1  true
left=[4]
right=[23]
mergesort(left)--->
n>1  false
mergesort(right)--->
n>1  false
Merge([4],[23],[4,23])--->[4,23]   compare the element in the left side and put larger at left


Merge([8],[4,23],[8,4,23])--->[4,8,23]   go back to the left part and compar the two part put larger at left so merge her finish left side



mergesort(right)--->    call the functin again with left array to divide it 
n=3
n>1  true
mid =1
left=[42]
right=[16,15]

mergesort(left)--->     still in the left just one element
n>1  false
mergesort(right)--->   call call the functin again with right array to divide it 
n=2
n>1  true
left=[16]
right=[15]
mergesort(left)--->  still in the left just one element
n>1  false
mergesort(right)--->  still in the right just one element
n>1  false
Merge([16],[15],[16,15])--->[15,16]               compare the element in the left side and put larger at left


Merge([42],[15,16],[42,15,16])->[15,16,42]  go back to the right part and compar the two part put larger at left so merge her finish right side




Merge([4,8,23],[15,16,42],[8, 4, 23, 42, 16, 15])--->[4, 8, 15, 16, 23, 42]-------> primary array


her we still divide the array until still in every array anumber compare them put the larger at the left 
then go back and compare two part still do that until we reach to the parts that define the primary array