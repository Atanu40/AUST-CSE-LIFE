create or replace view list2 (id,name,m_marks,e_marks,sres) as 
select S.sid,S.sname,S.math_marks,S.english_marks,S.sresult 
from studentList2 S;

select * from list2;

commit;