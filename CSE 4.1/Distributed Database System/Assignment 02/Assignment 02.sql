-- Check box for students from student table if the student is eligable for maried.
-- Requirement for maried Age >=21
clear screen;
SET VERIFY OFF;
SET SERVEROUTPUT ON;

DECLARE

S_AGE  student.age%TYPE;
S_NUM student.snum%TYPE;
		
		
BEGIN
      
	 
	 S_NUM := '&S_NUM';
	 
	 SELECT age INTO S_AGE FROM student WHERE snum = S_NUM;

     IF (S_AGE >= 21) THEN
	        DBMS_OUTPUT.PUT_LINE ('CONGRATULATION YOU ARE ELIGIBLE FOR MARIED');
	 ELSE 
	        DBMS_OUTPUT.PUT_LINE ('AGE UNDER 21.NOT MARIED');
	 END IF;

END;
/	 