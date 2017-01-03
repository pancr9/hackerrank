#!/bin/python3

import sys
h = 1                                                                                 # Initial Height
heights = [1]                        
a = list()                                                                            # Creating an empty list for storage of values
t = int(input().strip())                                                              # Number of test cases
for a0 in range(t):                                                       
    n = int(input().strip())
    a.append(n)  
n = max(a)                                                                            # Calculating height for the maximum value
for i in range(1,n+1,1):
        if (i%2 == 0):
            h = h + 1
            heights.append(h)
        else:
            h = h + h
            heights.append(h)

for i in range(t):
    print(heights[a[i]])                                                            # Printing height as per input
