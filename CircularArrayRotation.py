#!/bin/python3

import sys

n,k,q = input().strip().split(' ')
n,k,q = [int(n),int(k),int(q)]
a = [int(a_temp) for a_temp in input().strip().split(' ')]
k = k % n                                                                              # Reducing rotation to equivalent by removing redundant rotations.
b = list(a)                                                                            # Creating a new array. b = a will create a reference of 'a' as 'b'.
if (k!=0):                                                                             # if k = 0, no need to rotate; else rotate as required.
    for i in range(n):
        a[(i+k)%n] = b[i]
for a0 in range(q):
    m = int(input().strip())
    print (a[m])
