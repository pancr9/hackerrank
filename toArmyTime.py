#!/bin/python3
# Program to convert normal time to Army Time using input in format of "HH:MM:SSAM" or "HH:MM:SSPM"
import sys
time = input().strip()
a = int(time[0:2])
def convertAMtoArmy(time):
    if(time == "12:00:00AM"):
        print("00:00:00")
        exit()
    else:
        print(time[0:8])
def convertPMtoArmy(time):
    if(time =="12:00:00PM"):
        print("12:00:00")
        exit()
    else:
        a = int(time[0:2])
        a = a + 12
        print(str(a)+time[2:8])
if "AM" in time:
    if (a == 12):
        time = "00" + time[2:8]
    convertAMtoArmy(time)
    
else:
    if (a != 12):
        convertPMtoArmy(time)
    else:
        print(time[0:8])
