#https://open.kattis.com/problems/autori

import sys

for i in sys.stdin:
    #split by '-'
    name = i.split('-')
    newName = ''
    for x in name:
        #take first char from split-array
        newName += x[0]
    print(newName)