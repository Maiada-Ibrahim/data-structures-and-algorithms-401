arr[] =  {8  ,4,  23, 42,  16, 15}
Indexes:  0   1   2   3   4   5   

left = 0, right =  5, pivot = arr[5] = 15
if 0 < 5 true
call Partition({8  ,4,  23, 42,  16, 15},0,5)
pivot =15
low= -1
i=0
8< 15 true
low =0
{8  ,4,  23, 42,  16, 15}

i=1
4<15
low =1
{4  ,8,  23, 42,  16, 15}


i=2
23<15
low =1
{4  ,8,  23, 42,  16, 15}


i=3
42<15
low =1
{4  ,8,  23, 42,  16, 15}


i=4
16<15
low =1
{4  ,8,  23, 42,  16, 15}


i=5
15<15
low =1
{4  ,8,  23, 42,  16, 15}

------------------------------
call    QuickSort(arr, left, position - 1);

left = 0, right =  1
if 0 < 1 true


call Partition({4  ,8,  23, 42,  16, 15},0,1)
pivot =15
low= -1
i=0
4< 15 true
low =0
{4  ,8,  23, 42,  16, 15}



---------------------------------------------
call      QuickSort(arr, position + 1, right);

left = 3, right =  5
if 3 < 5  true
call Partition({8  ,4,  23, 42,  16, 15},3,5)
pivot =15
low= 2
i=3
42< 15 false

low=2
i=4
16<15  true
{4  ,8,  16, 42,  23, 15}

low=3
i=5
15<15  false
-------------------------------------
QuickSort(arr, left, position - 1);
call Partition({4  ,8,  16, 42,  23, 15},3,4)
if 3 < 5  true
pivot =15
low=2
i=3
false
------------------------------------
QuickSort(arr, position + 1, right);
5<5>
false
-------------------------------------
QuickSort(arr, , right);
