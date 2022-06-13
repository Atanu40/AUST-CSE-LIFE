CREATE OR REPLACE PROCEDURE insertToSite(input_id IN list1.id%TYPE,input_name IN list1.name%TYPE,input_math IN list1.m_marks%TYPE,input_eng IN list1.e_marks%TYPE,input_res IN list1.sres%TYPE)
IS
flag int := 0;
duplicateID EXCEPTION;
duplicateIDinServer EXCEPTION;
nullValue EXCEPTION;
WrongResult EXCEPTION;
BEGIN
  FOR R IN (
        SELECT * FROM list2@site1
    ) LOOP
        IF R.id = input_id  THEN
            flag := 1;
	   
        END IF;
	END LOOP;
   FOR R IN (
        SELECT * FROM list1
    ) LOOP
        IF R.id = input_id AND ( NOT(R.name = input_name) OR NOT(R.m_marks =input_math) OR NOT(R.e_marks=input_eng) OR NOT(R.sres =input_res))  THEN
            flag := 2;
	   
        END IF;
	END LOOP;	
	
	
 IF flag=1 THEN
    raise duplicateID;
 ELSIF flag =2 THEN
    raise duplicateIDinServer;
 ELSIF input_id=0 OR input_name=null  THEN
   	raise nullValue;
 ELSIF NOT(input_res='pass' OR input_res='fail')  THEN
    raise WrongResult;
	
 ELSE  
   insert into list2@site1 values(input_id,input_name,input_math,input_eng,input_res);
   commit;  

 END IF; 
 
  EXCEPTION
	WHEN duplicateID THEN
		DBMS_OUTPUT.PUT_LINE('ID exists !!');
	WHEN duplicateIDinServer THEN
	    DBMS_OUTPUT.PUT_LINE('Information doesnot matches for the exiting ID !!');
	WHEN nullValue THEN
		DBMS_OUTPUT.PUT_LINE('Cannot enter null !!');
    WHEN WrongResult THEN
        DBMS_OUTPUT.PUT_LINE('Result should be either pass or fail !!');	
	WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('Other errors !!');
		

END insertToSite;
/ 




