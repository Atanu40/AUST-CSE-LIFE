@"G:\17_02_04_003\Server\DDS PROJECT\newunion.sql";

CREATE OR REPLACE PACKAGE knnImplementation AS
	PROCEDURE findDistance(input_math_marks IN number, input_english_marks IN number);
	FUNCTION findMin
	RETURN number;
	FUNCTION secondMin
	RETURN number;
	FUNCTION thirdMin
	RETURN number;
	PROCEDURE nearestNeighbourFinding;
	PROCEDURE ResultCount;
END knnImplementation;
/

CREATE OR REPLACE PACKAGE BODY knnImplementation AS

PROCEDURE findDistance(input_math_marks IN number, input_english_marks IN number)
IS
dist number := 0;
storeid number :=0;


BEGIN

   FOR R IN (
        SELECT * FROM studentList
    ) LOOP
        dist := SQRT(POWER((input_math_marks-R.math_marks),2)+POWER((input_english_marks-R.english_marks),2));
		
		select sid into storeid from studentList where sid=R.sid;
		--DBMS_OUTPUT.PUT_LINE(dist);
	   
        update  studentList set sdistance=dist where sid=storeid;
		
        commit;	 
	END LOOP; 

END findDistance;


FUNCTION findMin
RETURN number
IS
minDistance number := 999999999999999999999;
BEGIN
    FOR i IN (
        SELECT * FROM studentList
    ) LOOP
        IF minDistance>i.sdistance THEN
           minDistance := i.sdistance;  
        END IF;
	END LOOP;
	return minDistance;
	
END findMin;



FUNCTION secondMin
RETURN number
IS
secondMinDistance number := 999999999999999999999;
minDistance number;
BEGIN
    minDistance :=findMin();
    FOR i IN (
        SELECT * FROM studentList
    ) LOOP
        IF secondMinDistance>i.sdistance AND i.sdistance>minDistance THEN
           secondMinDistance := i.sdistance;  
        END IF;
	END LOOP;
	return secondMinDistance;
	
END secondMin;


FUNCTION thirdMin
RETURN number
IS
thirdMinDistance number := 999999999999999999999;
secondMinDistance number;
BEGIN
    secondMinDistance := secondMin();
    FOR i IN (
        SELECT * FROM studentList
    ) LOOP
        IF thirdMinDistance>i.sdistance AND i.sdistance>secondMinDistance THEN
           thirdMinDistance := i.sdistance;  
        END IF;
	END LOOP;
	return thirdMinDistance;
	
END thirdMin;


PROCEDURE nearestNeighbourFinding
IS
minDistance number;
secondMinDistance number;
thirdMinDistance number;
countMin number :=0;
countSecondMin number :=0;
storeid number;
storeidAgain number;
A number :=0;


BEGIN
  minDistance :=findMin();
  secondMinDistance :=secondMin();
  thirdMinDistance :=thirdMin();
  
  select count(sid) into countMin from studentList where sdistance=minDistance;
  select count(sid) into countSecondMin from studentList where sdistance=secondMinDistance;
  --DBMS_OUTPUT.PUT_LINE(countMin);
  --DBMS_OUTPUT.PUT_LINE(countSecondMin);
  
 For i in (select * from studentList)
     LOOP
	   
	   IF countMin=1 AND countSecondMin=1 THEN
	     
		 update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		 sresult=i.sresult,sdistance=i.sdistance where serialNo=1 and i.sdistance=minDistance;
		 update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		 sresult=i.sresult,sdistance=i.sdistance where serialNo=2 and i.sdistance=secondMinDistance;
	     update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		 sresult=i.sresult,sdistance=i.sdistance where serialNo=3 and i.sdistance=thirdMinDistance;
		 
	   ELSIF countMin=2 THEN
	      update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		  sresult=i.sresult,sdistance=i.sdistance where serialNo=1 and i.sdistance=minDistance;
		 
		  
		  update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		  sresult=i.sresult,sdistance=i.sdistance where serialNo=3 and i.sdistance=secondMinDistance;
		 
		   A:=2;
	   ELSIF countMin=3 THEN
          update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		  sresult=i.sresult,sdistance=i.sdistance where serialNo=1 and i.sdistance=minDistance;
          A:=3;
      ELSIF countMin=1 AND countSecondMin>1 THEN
	      update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		  sresult=i.sresult,sdistance=i.sdistance where serialNo=1 and i.sdistance=minDistance;
		 
		  update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		  sresult=i.sresult,sdistance=i.sdistance where serialNo=2 and i.sdistance=secondMinDistance;
		  A:=1;
          	   
       END IF;	   
	   
	 
	 END LOOP;
	 IF A=2 THEN
	     select sid into storeid from newstudentList where serialNo=1;
		 --DBMS_OUTPUT.PUT_LINE('STORE ID' ||' '||storeid);
		 For i in (select * from studentList)
		 LOOP 
		   update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		   sresult=i.sresult,sdistance=i.sdistance where serialNo=2 and i.sdistance=minDistance and i.sid!=storeid;
		 END LOOP;
	 END IF;
	 
	 IF A=3 THEN
	     select sid into storeid from newstudentList where serialNo=1;
		 --DBMS_OUTPUT.PUT_LINE('STORE ID' ||' '||storeid);
		 For i in (select * from studentList)
		 LOOP 
		   update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		   sresult=i.sresult,sdistance=i.sdistance where serialNo=2 and i.sdistance=minDistance and i.sid!=storeid;
		 END LOOP;
		A:=4;
	 END IF;
	 
     IF A=4 THEN
	     select sid into storeidAgain from newstudentList where serialNo=2;
		 --DBMS_OUTPUT.PUT_LINE('STORE ID' ||' '||storeidAgain);
		 For i in (select * from studentList)
		 LOOP 
		   update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		   sresult=i.sresult,sdistance=i.sdistance where serialNo=3 and i.sdistance=minDistance and i.sid!=storeid and i.sid!=storeidAgain;
		 END LOOP;
	 END IF;
	 
	  IF A=1 THEN
	     select sid into storeid from newstudentList where serialNo=2;
		 --DBMS_OUTPUT.PUT_LINE('STORE ID' ||' '||storeid);
		 For i in (select * from studentList)
		 LOOP 
		   update newstudentList set sid=i.sid,sname=i.sname,math_marks=i.math_marks,english_marks=i.english_marks,
		   sresult=i.sresult,sdistance=i.sdistance where serialNo=3 and i.sdistance=secondMinDistance and i.sid!=storeid;
		 END LOOP;
	 END IF;

END nearestNeighbourFinding;


PROCEDURE ResultCount

IS

countPass number :=0;
countFail number :=0;

BEGIN
   For i in (select * from newstudentList)
   LOOP
      IF i.sresult='pass' THEN
	      countPass :=countPass+1;
	  ELSE
          countFail :=countFail+1;	  
	  END IF;
	  
   END LOOP;

   IF countPass>countFail THEN
      DBMS_OUTPUT.PUT_LINE('Passed !!!');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Failed !!!');
   END IF;	  
	
END ResultCount;

END knnImplementation;
/

