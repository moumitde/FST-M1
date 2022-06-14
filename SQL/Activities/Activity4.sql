REM   Script: Session 04
REM   Session 04

CREATE TABLE salesman(  
   salesman_id int ,  
   salesman_name varchar2(32),  
   salesman_city varchar2(32),  
   commission int  
   );

INSERT ALL  
    INTO salesman VALUES(5005, 'Pitt Alex', 'London', 11)  
    INTO salesman VALUES(5006, 'McLyoner', 'Paris', 14)  
    INTO salesman VALUES(5007, 'Pauler Adam', 'Rome', 13)  
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)  
SELECT 1 FROM DUAL;

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;



