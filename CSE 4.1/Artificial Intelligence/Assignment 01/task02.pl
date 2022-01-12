parent('BIPLOB', 'RAJKONNA').
parent('BIPLOB', 'AHONA').
parent('BIPLOB','BISHAL').
parent('MOTIUR', 'BIPLOB').
parent('MOTIUR', 'MURAD').
parent('MOTIUR','MOUSHOMI').

boy('BIPLOB').
boy('MURAD').
boy('BISHAL').
girl('RAJKONNA').
girl('AHONA').
girl('MOUSHOMI').

uncle(U,X):-parent(Y,X),parent(Z,Y),parent(Z,U),boy(U), not(Y=U).
aunty(A,X):-parent(Y,X),parent(Z,Y),parent(Z,A),girl(A),not(Y=A).
brother(B,X):- parent(Y,X),parent(Y,B),boy(B),not(X=B).
sister(S,X):- parent(Y,X),parent(Y,S),girl(S),not(X=S).


findUncle :- write(' Enter name '), read(NAME), write('Uncle:'),
		uncle(UNCLE , NAME), write(UNCLE), tab(5), fail.
findUncle.
findAunty :- write(' Enter name '), read(NAME), write('AUNTY : '),
		aunty(AUNTY,NAME), write(AUNTY), tab(5), fail.
findAunty.

findBrother:- write(' Enter name '), read(NAME), write('brother: '),
		brother(BROTHER,NAME), write(BROTHER), tab(5), fail.
findBrother.
findSister:- write(' Enter name '), read(NAME), write('sister: '),
		sister(SISTER,NAME), write(SISTER), tab(5), fail.
findSister.

