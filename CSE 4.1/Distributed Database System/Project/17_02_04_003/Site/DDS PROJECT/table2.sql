drop table studentList2;

create table studentList2(sid number,sname varchar2(20),math_marks number,english_marks number,sresult varchar2(20));

insert into studentList2 values(6,'Shamim Islam',25,40,'fail');
insert into studentList2 values(2,'Jarin Nawar',40,60,'fail');
insert into studentList2 values(5,'Jubayer Khan',35,30,'fail');



commit;

select * from studentList2;
