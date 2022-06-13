create or replace view list1 (id,name,m_marks,e_marks,sres) as 
select S.sid,S.sname,S.math_marks,S.english_marks,S.sresult 
from studentList1 S;

select * from list1;

commit;