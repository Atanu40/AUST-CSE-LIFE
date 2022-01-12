
FAMILYLIST =   [('parent', 'HASIB', 'RAKIB'),              
               ('parent', 'RAKIB', 'SOHEL'),             
               ('parent', 'RAKIB',  'REBEKA'),                 
               ('parent', 'RASHID',  'HASIB'),                
                           
               ]

K = str(input("Grandchildren:\n"))
print('Grandparent:', end='\n')


for i in range(len(FAMILYLIST)):
    if ((FAMILYLIST [i][0] == 'parent') and  (FAMILYLIST [i][2] == K)):
        
        for j in range(len(FAMILYLIST)):
            if (FAMILYLIST [j][0] == 'parent') and (FAMILYLIST [i][1] == FAMILYLIST[j][2]):
                 print(FAMILYLIST[j][1])

    i=i+1




