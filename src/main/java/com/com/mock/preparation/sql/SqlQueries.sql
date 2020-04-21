-- Query to create a table --
CREATE TABLE Book(ID INT PRIMARY KEY, NAME VARCHAR(255), AUTHOR VARCHAR(255) ,PRICE NUMBER);

-- Drop Table --
DROP TABLE IF EXISTS Book;

-- Select from table --
Select * from Book;

-- Insert the Query --
Insert into Book (ID,NAME, AUTHOR,PRICE) VALUES (121,'NIGHTINGLE','RAJ',1200);
Insert into Book (ID,NAME, AUTHOR,PRICE) VALUES (121,'rainy season','RAJ',120);
Insert into Book (ID,NAME, AUTHOR,PRICE) VALUES (122,'WINTER','RAJ',1242);
Insert into Book (ID,NAME, AUTHOR,PRICE) VALUES (123,'SUMMER','RAJ',1200);
Insert into Book (ID,NAME, AUTHOR,PRICE) VALUES (124,'SPRING','RAJ',1700);

-- h2 --
DAtabase name- esha
IP Address -->(http://192.168.43.11)-->Ip address:(8082)-->port

-- driver name for h2 --
driverClassName: org.h2.Driver
