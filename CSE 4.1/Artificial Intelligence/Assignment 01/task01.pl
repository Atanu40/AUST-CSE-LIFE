
parent('Hasib', 'Rakib').
parent('Rakib', 'Sohel').
parent('Rakib','Rebeka').
parent('Rashid', 'Hasib').
grand_parent(X,Z) :- parent(Y,Z), parent(X,Y).

findGrandparent :- write('Enter the name of grandchild: '), read(NAME), write('grandparent: '),
grand_parent(K,NAME ), write(K), tab(5), fail.
findGrandparent.
