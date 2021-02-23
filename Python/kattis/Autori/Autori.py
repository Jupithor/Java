#https://open.kattis.com/problems/autori

import sys

for i in sys.stdin:
    name = i.split('-')
    newName = ''
    for x in name:
        newName += x[0]
    print(newName)