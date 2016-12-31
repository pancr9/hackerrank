#!/bin/python3

import sys
letters = "abcdefghijklmnopqrstuvwxyz"
h = [int(h_temp) for h_temp in input().strip().split(' ')]
word = input().strip()
max = -1
for char in word:
    temp = letters.index(char)
    if (h[temp]>max):
        max = h[temp]
print(max*len(word))
