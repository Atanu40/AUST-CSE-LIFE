clear screen;
drop table Student;
drop table Borrows;
drop table Book;
drop table Author;


create table Student(studentID integer,studentname varchar2(50),phone varchar2(100),age integer );
create table Borrows(studentID integer,bookID integer,dateBorrowed date);
create table Book(bookID INTEGER,authorID INTEGER,title varchar2(100), genre varchar2(100),datePublished date);
create table Author(authorID INTEGER,authorname varchar2(50),age integer);

insert into Student values (1,'Atanu','01309018148',21);
insert into Student values (2,'Anup','01520715364',23);
insert into Student values(3,'Apon','01558057174',20);
insert into Student values (4,'kowshik','01662765984',21);
insert into Student values (5,'Shikhon','018353653623',21);
insert into Student values (6,'Opu','01955770920',24);

insert into Borrows values(1, 4,' 10-OCT-2021');
insert into Borrows values(2, 3,'9-SEP-2021');
insert into Borrows values(3, 2,'1-SEP-2021');
insert into Borrows values(4, 1,'10-NOV-2021');
insert into Borrows values(5, 6,'25-DEC-2021');
insert into Borrows values(6, 5,'21-SEP-2021');

insert into Book values(1, 1,'Gulliver’s Travels','Literary Fiction','03-SEP-1932');
insert into Book values(2, 2,'My Father My Bangladesh','Travel Fiction','28-DEC-2008');
insert into Book values(3, 3,'Munshigiri','Ditective Fiction','21-OCT-1997');
insert into Book values(4, 4,'Ladi Doctor','Fiction','22-JAN-1984');
insert into Book values(5, 5,'Agnigiri','Fiction','17-JUN-1892');
insert into Book values(6,6, 'karagare rujnamacha','Fiction','20-APR-2019');

insert into Author values(1,'Jonathan Swift',71);
insert into Author values(2,'Hasina',67);
insert into Author values(3,'OpuKysar',52);
insert into Author values(4,'Murad Hasan',46);
insert into Author values(5,'Kazi umor Islam',67);
insert into Author values(6,'Shekh Mujib',60);

select Author.age from Author INNER join Book on Book.authorID=Author.authorID WHERE Book.title='Gulliver’s Travels';


select Author.authorname from Author inner join Book on Book.authorID = Author.authorID where Book.genre = 'Fiction' And Author.age = (SELECT MIN(Author.age) FROM Author);

select Author.authorname from Author INNER join Book on Book.authorID = Author.authorID
WHERE Book.datePublished = TO_DATE('20-APR-2019','DD-MM-YYYY');

COMMIT;









