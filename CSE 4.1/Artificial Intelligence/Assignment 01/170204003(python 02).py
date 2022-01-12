FAMILYLIST =    [('parent', 'MURAD', 'RAJKONNA'),              
               ('parent', 'MURAD', 'JAYMA'),             
               ('parent', 'JAHANARA',    'RAJKONNA'),                 
               ('parent', 'JAHANARA',    'JAYMA'),                
               ('parent', 'MOTIUR',   'MURAD'),            
               ('parent', 'MOTIUR',    'HARUN'),
                ('parent', 'MOTIUR',        'MOUSHUMI'),                   
               ('parent', 'MURAD', 'YUVORAJ'),             
               ]
boy =['MOTIUR', 'MURAD', 'HARUN','YUVORAJ']
girl = ['JAHANARA', 'MOUSHUMI', 'JAYMA','RAJKONNA']
grandparent = []
parent = []
brother= []
sister = []
uncle = []
aunt = []
grandchildren = input("ENTER THE NAME :")
for i in range(8):
    if (FAMILYLIST[i][0] == 'parent') and  (FAMILYLIST[i][2] == grandchildren):
        parent.append(FAMILYLIST[i][1])
        for j in range(8):
            if (FAMILYLIST[j][0] == 'parent') and (FAMILYLIST[i][1] == FAMILYLIST[j][2]):
                if (FAMILYLIST[j][1] not in grandparent and  (FAMILYLIST[j][1] in boy)):
                    grandparent.append(FAMILYLIST[j][1])
                    for k in range(8):
                        if (FAMILYLIST[k][0] == 'parent') and  (j != k) and  (FAMILYLIST[j][1] == FAMILYLIST[k][1]):
                            if (FAMILYLIST[k][2] not in uncle and  (FAMILYLIST[k][2] in boy)):
                                uncle.append(FAMILYLIST[k][2])
                            for l in range(8):
                                if (FAMILYLIST[l][0] == 'parent') and  (j != l) and  (FAMILYLIST[k][2] == FAMILYLIST[l][2]):
                                    if (FAMILYLIST[l][2] not in aunt and (FAMILYLIST[l][2] in girl)):
                                        aunt.append(FAMILYLIST[l][2])

            elif (FAMILYLIST[j][0] == 'parent') and (i != j) and  (FAMILYLIST[i][1] == FAMILYLIST[j][1]):
                if (FAMILYLIST[j][2] not in brother and (FAMILYLIST[j][2]  in boy)):
                   brother.append(FAMILYLIST[j][2])
                elif (FAMILYLIST[j][2] not in sister and (FAMILYLIST[j][2] in girl)):
                    sister.append(FAMILYLIST[j][2])
                    print("BROTHER :", end=' ')
print(*brother, sep=', ')
print("SISTER :", end=' ')
print(*sister, sep=', ')
print("UNCLE :", end=' ')
print(*uncle, sep=', ')
print("AUNT :", end=' ')
print(*aunt, sep=', ')
