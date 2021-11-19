input : [8,4,23,42,16,15]

### i=1
[8,4,23,42,16,15]  j=0 ,temp=4
[8,8,23,42,16,15]  j=-1 ,temp< arr[0]
[4,8,23,42,16,15]  j=-1,arr[0]==temp     her we put 4 in correct place
-----------------------------------
### i=2
[4,8,23,42,16,15]   j=1,temp=23>arr[1]    her no thing is change becase 23>8
--------------------------------------
### i=3
[4,8,23,42,16,15]   j=2,temp=42>arr[2]   her no thing is change becase 42>23 
------------------------------------
### i=4
[4,8,23,42,16,15]  j=3,temp=16>arr[3]     her chech 16<42 it is so we put 42 arr[4]
[4,8,23,42,42,15]  j=2,temp=16<arr[2]     her chech 16 <23 it is so we put 23 arr[3]
[4,8,23,23,42,15]  j=1,temp=16<arr[1]    her chech 16 < 8 it is so we put it at arr[2]
[4,8,16,23,42,15]                         16 in correct place 
-------------------------------------
### i=5
[4,8,16,23,42,15]        j=4,temp=15>arr[4]
[4,8,16,23,42,42]        j=3,temp=15>arr[3]
[4,8,16,23,23,42]        j=2,temp=15>arr[2]
[4,8,16,16,23,42]        j=1,temp=15>arr[1]
[4,8,15,16,23,42]        j=0,temp=15>arr[0]
[4,8,15,16,23,42] 
her we do the same as we check  Selection Sort is a sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence. The traversal keeps track of the minimum value and places it in the front of the array which should be incrementally sorted.