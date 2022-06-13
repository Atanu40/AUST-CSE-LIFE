drop table newstudentList;


create table newstudentList(serialNo number,sid number,sname varchar2(20),math_marks number,english_marks number,sresult varchar2(20),sdistance number);

insert into newstudentList values(1,null,null,null,null,null,null);
insert into newstudentList values(2,null,null,null,null,null,null);
insert into newstudentList values(3,null,null,null,null,null,null);

commit;

select * from newstudentList;