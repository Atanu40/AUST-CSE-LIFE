create or replace view totalList (id,name,m_marks,e_marks,sres,sdis) as 
select S.sid,S.sname,S.math_marks,S.english_marks,S.sresult,S.sdistance 
from studentList S;

select * from totalList;

commit;