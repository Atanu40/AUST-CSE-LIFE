CREATE OR REPLACE PROCEDURE deletefromServer(input_id IN list1.id%TYPE)
IS
flag int := 0;
DontExist EXCEPTION;

BEGIN
  FOR R IN (
        SELECT * FROM list1
    ) LOOP
        IF R.id = input_id  THEN
            flag := 1;
	        exit;
        END IF;
	END LOOP;
   	
 IF flag=1 THEN
    Delete from list1 where id=input_id;
    commit;  
 ELSE
    raise DontExist; 

END IF; 
 
  EXCEPTION
	WHEN DontExist THEN
		DBMS_OUTPUT.PUT_LINE('ID doesnot exist !!');
	WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('Other errors !!');
		

END deletefromServer;
/ 

CREATE OR REPLACE TRIGGER DeleteFromServer 
AFTER INSERT 
ON studentList1
DECLARE
BEGIN
	DBMS_OUTPUT.PUT_LINE('Data deleted !!');
END;
/


