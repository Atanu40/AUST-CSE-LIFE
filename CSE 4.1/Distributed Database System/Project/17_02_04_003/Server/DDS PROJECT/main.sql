@"G:\17_02_04_003\Server\DDS PROJECT\insertintoServer.sql";
@"G:\17_02_04_003\Server\DDS PROJECT\insertintoSite.sql";
@"G:\17_02_04_003\Server\DDS PROJECT\deletefromServer.sql";
@"G:\17_02_04_003\Server\DDS PROJECT\deletefromSite.sql";
@"G:\17_02_04_003\Server\DDS PROJECT\knnImplementation.sql";
@"G:\17_02_04_003\Server\DDS PROJECT\showMessage.sql";

SET SERVEROUTPUT ON;
SET VERIFY OFF;


ACCEPT ID NUMBER PROMPT "ENTER ID ="
ACCEPT NAME CHAR PROMPT "ENTER NAME ="
ACCEPT MATH_MARKS NUMBER PROMPT "Enter Math Marks ="
ACCEPT ENGLISH_MARKS NUMBER PROMPT "Enter English Marks = "
ACCEPT RES CHAR PROMPT "ENTER RESULT ="
ACCEPT X NUMBER PROMPT "ENTER OPTION ="
ACCEPT Y NUMBER PROMPT "ENTER INSERT OPTION ="
ACCEPT Z NUMBER PROMPT "ENTER DELETE OPTION ="

DECLARE
input_math_marks number :=0;
input_english_marks number :=0;
input_name varchar2(20);
input_id number :=0;
input_result varchar2(20);
minDistance number;
secondMinDistance number;
thirdMinDistance number;
x number :=0;
y number :=0;
z number :=0;
ERROR EXCEPTION;



BEGIN 
  input_math_marks := &MATH_MARKS;
  input_english_marks := &ENGLISH_MARKS;
  input_id :=&ID;
  input_name :='&NAME';
  input_result :='&RES';
  x:=&X;
  y:=&Y;
  z:=&Z;
  IF x=1 THEN
      tablesUnion();
      knnImplementation.findDistance(input_math_marks,input_english_marks);
      minDistance :=knnImplementation.findMin();
      --DBMS_OUTPUT.PUT_LINE('Minimum value'|| ' '||minDistance);
      secondMinDistance:=knnImplementation.secondMin();
      --DBMS_OUTPUT.PUT_LINE('Second Minimum value'|| ' '||secondMinDistance);
      thirdMinDistance:=knnImplementation.thirdMin();
      --DBMS_OUTPUT.PUT_LINE('Third Minimum value'|| ' '||thirdMinDistance);
      knnImplementation.nearestNeighbourFinding();
      knnImplementation.ResultCount();
 ELSIF x=2 THEN
   IF y=1 THEN
     insertToServer(input_id,input_name,input_math_marks,input_english_marks,input_result);
   ELSIF y=2 THEN
     insertToSite(input_id,input_name,input_math_marks,input_english_marks,input_result);  
   ELSE 
     raise ERROR;   
   END IF;	
 ELSIF x=3 THEN
   IF z=1 THEN
     deletefromServer(input_id); 
   ELSIF z=2 THEN
     deletefromSite(input_id);
   ELSE 
      raise ERROR;   
   END IF;
  ELSE 
     raise ERROR;  
 END IF;   
 
 EXCEPTION
	WHEN ERROR THEN
		DBMS_OUTPUT.PUT_LINE('Invalid !!');
	WHEN OTHERS THEN
		DBMS_OUTPUT.PUT_LINE('Other errors !!');
		
 
END;
/
