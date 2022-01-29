'''
goal status :
1	2	3
8	_	4
7	6	5

current status :
8	1	2
3	6	4
_	7	5

'''


gtp=[
    (1,1,1), 
    (2,1,2), 
    (3,1,3), 
    (4,2,3), 
    (5,3,3), 
    (6,3,2), 
    (7,3,1), 
    (8,2,1)
]
gblnk = (2,2)

tp=[
    (1,1,2), 
    (2,1,3), 
    (3,2,1), 
    (4,2,3), 
    (5,3,3), 
    (6,2,2), 
    (7,3,2), 
    (8,1,1)
]
blnk = (3,1)

print('\n')
i,h=0,0
L = []



print('--- Recursion Solution ---')
def Heuristics_2(i,h,L = []):
    if i>=len(gtp):
        print('T = ' , L)
        print('h2(Heuristics 2): ' , h)
        return
    
    val = abs( gtp[i][1] - tp[i][1] ) + abs( gtp[i][2] - tp[i][2] ) 
    h += val
    L.append(val)
 
    i += 1
    Heuristics_2(i , h)


Heuristics_2(0,0)
