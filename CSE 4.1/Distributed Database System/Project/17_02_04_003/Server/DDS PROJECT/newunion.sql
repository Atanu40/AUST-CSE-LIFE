
 @"G:\17_02_04_003\Server\DDS PROJECT\table3.sql";

CREATE OR REPLACE PROCEDURE tablesUnion
IS

BEGIN
   FOR i IN (
        SELECT * FROM list1
        UNION
        SELECT * FROM list2@site1  
    ) LOOP
        insert into studentList values(i.id,i.name,i.m_marks,i.e_marks,i.sres,0.00);
        commit;	 
	END LOOP; 

END tablesUnion;
/







