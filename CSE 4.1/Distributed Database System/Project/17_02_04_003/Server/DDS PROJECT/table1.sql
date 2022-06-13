drop table studentList1;

create table studentList1(sid number,sname varchar2(20),math_marks number,english_marks number,sresult varchar2(20));

insert into studentList1 values(1,'Islam Nashrif',60,70,'pass');
insert into studentList1 values(2,'Jarin Nawar',40,60,'fail');
insert into studentList1 values(3,'Mahdi Alam',80,90,'pass');
insert into studentList1 values(4,'Rowthbah Siddique',70,60,'pass');


commit;

select * from studentList1;


