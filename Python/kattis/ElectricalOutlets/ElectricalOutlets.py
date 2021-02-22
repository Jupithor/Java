import sys

cases = int(input())
for i in range(cases): 
       case = list(map(int, input().split()))
       #always start with 1 plug
       plugs = 1
       #sum all the plugs (minus the amount of strips)
       plugs += sum(case)-case[0]
       #subtract 1 for each strip (except for the last)
       plugs -= len(case)-1

       print(plugs)