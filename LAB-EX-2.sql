show databases;
use lms_db;

Create table LMS_MEMBERS(MEMBER_ID Varchar(10), MEMBER_NAME Varchar(30) NOT NULL, CITY Varchar(20), 
DATE_REGISTER Date NOT NULL, DATE_EXPIRE Date , MEMBERSHIP_STATUS Varchar(15)NOT NULL, Constraint LMS_cts1 PRIMARY KEY(MEMBER_ID));
desc LMS_MEMBERS;

Create table LMS_SUPPLIERS_DETAILS(SUPPLIER_ID Varchar(3), SUPPLIER_NAME Varchar(30) NOT NULL, ADDRESS Varchar(50),
CONTACT bigint(10) NOT NULL, EMAIL Varchar(15) NOT NULL, Constraint LMS_cts2 PRIMARY KEY(SUPPLIER_ID));
desc LMS_SUPPLIERS_DETAILS;

Create table LMS_FINE_DETAILS(FINE_RANGE Varchar(3), FINE_AMOUNT decimal(10,2) NOT NULL,
Constraint LMS_cts3 PRIMARY KEY(FINE_RANGE));
desc LMS_FINE_DETAILS;

Create table LMS_BOOK_DETAILS(BOOK_CODE Varchar(10), BOOK_TITLE Varchar(50) NOT NULL, CATEGORY Varchar(15) NOT NULL, AUTHOR Varchar(30) NOT NULL,PUBLICATION Varchar(30),
PUBLISH_DATE Date, BOOK_EDITION int(2), PRICE decimal(8,2) NOT NULL, RACK_NUM Varchar(3),DATE_ARRIVAL Date NOT NULL, SUPPLIER_ID Varchar(3) NOT NULL,
Constraint LMS_cts4 PRIMARY KEY(BOOK_CODE), Constraint LMS_cts41 FOREIGN KEY(SUPPLIER_ID) References LMS_SUPPLIERS_DETAILS(SUPPLIER_ID));
desc LMS_BOOK_DETAILS;

Create table LMS_BOOK_ISSUE(BOOK_ISSUE_NO int, MEMBER_ID Varchar(10) NOT NULL, BOOK_CODE Varchar(10) NOT NULL, DATE_ISSUE Date NOT NULL, DATE_RETURN Date NOT NULL, 
DATE_RETURNED Date NULL, FINE_RANGE Varchar(3), Constraint LMS_cts5 PRIMARY KEY(BOOK_ISSUE_NO),Constraint LMS_Mem FOREIGN KEY(MEMBER_ID) References LMS_MEMBERS(MEMBER_ID),
Constraint LMS_BookDetail FOREIGN KEY(BOOK_CODE) References LMS_BOOK_DETAILS(BOOK_CODE),
Constraint LMS_FineDetail FOREIGN KEY(FINE_RANGE) References LMS_FINE_DETAILS(FINE_RANGE));
desc LMS_BOOK_ISSUE;

Insert into LMS_MEMBERS
Values('LM001', 'AMIT', 'CHENNAI', '2012-02-12', '2013-02-11','Temporary');
Insert into LMS_MEMBERS
Values('LM002', 'ABDHUL', 'DELHI', '2012-04-10', '2013-04-09','Temporary');
Insert into LMS_MEMBERS
Values('LM003', 'GAYAN', 'CHENNAI', '2012-05-13','2013-05-12', 'Permanent');
Insert into LMS_MEMBERS
Values('LM004', 'RADHA', 'CHENNAI', '2012-04-22', '2013-04-21', 'Temporary');
Insert into LMS_MEMBERS
Values('LM005', 'GURU', 'BANGALORE', '2012-03-30', '2013-05-16','Temporary');
Insert into LMS_MEMBERS
Values('LM006', 'MOHAN', 'CHENNAI', '2012-04-12', '2013-05-16','Temporary');
select * from LMS_MEMBERS;

Insert into LMS_SUPPLIERS_DETAILS 
Values ('S01','SINGAPORE SHOPPEE', 'CHENNAI', 9894123555,'sing@gmail.com');
Insert into LMS_SUPPLIERS_DETAILS 
Values ('S02','JK Stores', 'MUMBAI', 9940123450 ,'jks@yahoo.com');
Insert into LMS_SUPPLIERS_DETAILS 
Values ('S03','ROSE BOOK STORE', 'TRIVANDRUM', 9444411222,'rose@gmail.com');
Insert into LMS_SUPPLIERS_DETAILS 
Values ('S04','KAVARI STORE', 'DELHI', 8630001452,'kavi@redif.com');
Insert into LMS_SUPPLIERS_DETAILS 
Values ('S05','EINSTEN BOOK GALLARY', 'US', 9542000001,'eingal@aol.com');
Insert into LMS_SUPPLIERS_DETAILS 
Values ('S06','AKBAR STORE', 'MUMBAI',7855623100 ,'akbakst@aol.com');
select * from LMS_SUPPLIERS_DETAILS; 

Insert into LMS_FINE_DETAILS Values('R0', 0);
Insert into LMS_FINE_DETAILS Values('R1', 20);
insert into LMS_FINE_DETAILS Values('R2', 50);
Insert into LMS_FINE_DETAILS Values('R3', 75);
Insert into LMS_FINE_DETAILS Values('R4', 100);
Insert into LMS_FINE_DETAILS Values('R5', 150);
Insert into LMS_FINE_DETAILS Values('R6', 200);
select * from LMS_FINE_DETAILS;

Insert into LMS_BOOK_DETAILS
Values('BL000010', 'Java ForvDummies', 'JAVA', 'Paul J. Deitel', 'Prentice Hall', '1999-12-10', 6, 575.00, 'A1', '2011-05-10', 'S01');
Insert into LMS_BOOK_DETAILS
Values('BL000002', 'Java: The Complete Reference ', 'JAVA', 'Herbert Schildt', 'Tata Mcgraw Hill ', '2011-10-10', 5, 750.00, 'A1', '2011-05-10', 'S03');
Insert into LMS_BOOK_DETAILS 
Values('BL000003', 'Java How To Do Program', 'JAVA', 'Paul J. Deitel', 'Prentice Hall', '1999-05-10', 6, 600.00, 'A1', '2012-05-10', 'S01');
Insert into LMS_BOOK_DETAILS
Values('BL000004', 'Java: The Complete Reference ', 'JAVA', 'Herbert Schildt', 'Tata Mcgraw Hill ', '2011-10-10', 5, 750.00, 'A1', '2012-05-11', 'S01');
Insert into LMS_BOOK_DETAILS 
Values('BL000005', 'Java How To Do Program', 'JAVA', 'Paul J. Deitel', 'Prentice Hall', '1999-12-10', 6, 600.00, 'A1', '2012-05-11', 'S01');
Insert into LMS_BOOK_DETAILS
Values('BL000006', 'Java: The Complete Reference ', 'JAVA', 'Herbert Schildt', 'Tata Mcgraw Hill ', '2011-10-10', 5, 750.00, 'A1', '2012-05-12', 'S03');
Insert into LMS_BOOK_DETAILS 
Values('BL000007', 'Let Us C', 'C', 'Yashavant Kanetkar ', 'BPB Publications', '2010-12-11', 9, 500.00 , 'A3', '2010-11-03', 'S03');
Insert into LMS_BOOK_DETAILS 
Values('BL000008', 'Let Us C', 'C', 'Yashavant Kanetkar ','BPB Publications', '2010-05-12', 9, 500.00 , 'A3', '2011-08-09', 'S04');
Insert into LMS_BOOK_DETAILS 
Values('BL000009', 'Let Us C#', 'C', 'Yashavant Kanetkar ','BPB Publications', '2010-05-12', 9, 550.00 , 'A3', '2011-08-09', 'S04');
Insert into LMS_BOOK_DETAILS 
Values('BL000011', 'Let Us C++', 'C', 'Yashavant Kanetkar ','BPB Publications', '2010-05-12', 9, 650.00 , 'A3', '2011-08-09', 'S04');
select * from LMS_BOOK_DETAILS;

Insert into LMS_BOOK_ISSUE 
Values (001, 'LM001', 'BL000010', '2012-05-01', '2012-05-16', '2012-05-16', 'R0');
Insert into LMS_BOOK_ISSUE 
Values (002, 'LM002', 'BL000002', '2012-05-01', '2012-05-06','2012-05-16', 'R2');
Insert into LMS_BOOK_ISSUE
Values (003, 'LM003', 'BL000007', '2012-04-01', '2012-04-16', '2012-04-20','R1');
Insert into LMS_BOOK_ISSUE 
Values (004, 'LM004', 'BL000005', '2012-04-01', '2012-04-16','2012-04-20', 'R1');
Insert into LMS_BOOK_ISSUE 
Values (005, 'LM005', 'BL000008', '2012-03-30', '2012-04-15','2012-04-20' , 'R1');
Insert into LMS_BOOK_ISSUE 
Values (006, 'LM005', 'BL000008', '2012-04-20', '2012-05-05','2012-05-05' , 'R0');
Insert into LMS_BOOK_ISSUE 
Values (007, 'LM003', 'BL000007', '2012-04-22', '2012-05-07','2012-05-25' , 'R4');
select * from LMS_BOOK_ISSUE;

ALTER TABLE LMS_BOOK_ISSUE ADD(BOOK_ISSUE_STATUS VARCHAR(10));
UPDATE LMS_BOOK_ISSUE SET BOOK_ISSUE_STATUS = 'Y' WHERE BOOK_ISSUE_NO = 7; /*IN BOOK_ISSUE_NO WE CAN ADD 1 TO 7 ANY NUMBER*/

/*1) Write a query to display the member id, member name, city and membership status who are all having life time membership. Hint: Life time membership status is “Permanent”.*/
select MEMBER_ID, MEMBER_NAME, CITY, MEMBERSHIP_STATUS from LMS_MEMBERS where MEMBERSHIP_STATUS='Permanent';

/*2) Write a query to display the member id, member name who have not returned the books. Hint: Book return status is book_issue_status ='Y' or 'N'.*/
select MEMBER_ID, MEMBER_NAME from LMS_MEMBERS where MEMBER_ID in(select MEMBER_ID from LMS_BOOK_ISSUE where DATE_RETURN=NULL); 

/*3) Write a query to display the member id, member name who have taken the book with book code 'BL000002'.*/
select MEMBER_ID, MEMBER_NAME from LMS_MEMBERS where MEMBER_ID in(select MEMBER_ID from LMS_BOOK_ISSUE where BOOK_CODE='BL000002');

/*4) Write a query to display the book code, book title and author of the books whose author name begins with 'P'.*/
select BOOK_CODE, BOOK_TITLE, AUTHOR from LMS_BOOK_DETAILS where AUTHOR like 'P%';

/*5) Write a query to display the total number of Java books available in library with alias name ‘NO_OF_BOOKS’.*/
select count(CATEGORY) as NO_OF_BOOKS from LMS_BOOK_DETAILS where CATEGORY='JAVA';

/*6) Write a query to list the category and number of books in each category with alias name ‘NO_OF_BOOKS’.*/
select CATEGORY, count(CATEGORY) as NO_OF_BOOKS from LMS_BOOK_DETAILS group by CATEGORY;

/*7) Write a query to display the number of books published by "Prentice Hall” with the alias name “NO_OF_BOOKS”.*/
select count(PUBLICATION) as NO_OF_BOOKS from LMS_BOOK_DETAILS group by PUBLICATION having PUBLICATION='Prentice Hall';

/*8) Write a query to display the book code, book title of the books which are issued on the date "1st April 2012".*/
select BOOK_CODE, BOOK_TITLE from LMS_BOOK_DETAILS where BOOK_CODE in(select BOOK_CODE from LMS_BOOK_ISSUE where DATE_ISSUE='2012-04-01');

/*9) Write a query to display the member id, member name, date of registration and expiry date of the members whose membership expiry date is before APR 2013.*/
select MEMBER_ID, MEMBER_NAME, DATE_REGISTER, DATE_EXPIRE from LMS_MEMBERS where DATE_EXPIRE<'2013-04-09';

/*10) write a query to display the member id, member name, date of registration, membership status of the members who registered before "March 2012" and membership status is "Temporary"*/
SELECT MEMBER_ID, MEMBER_NAME, DATE_REGISTER, DATE_EXPIRE FROM LMS_MEMBERS WHERE DATE_REGISTER<'2012-03-30' AND MEMBERSHIP_STATUS = 'Temporary';

/*11) Write a query to display the member id, member name who’s City is CHENNAI or DELHI. Hint: Display the member name in title case with alias name 'Name'.*/
SELECT MEMBER_ID, MEMBER_NAME AS NAME FROM LMS_MEMBERS WHERE CITY = 'CHENNAI' OR 'DELHI';

/*12) Write a query to concatenate book title, author and display in the following format.
Book_Title_is_written_by_Author
Example: Let Us C_is_written_by_Yashavant Kanetkar  
Hint: display unique books. Use “BOOK_WRITTEN_BY” as alias name.*/
SELECT CONCAT_WS('_', BOOK_TITLE, 'IS', 'WRITTEN', 'BY', AUTHOR) AS BOOK_WRITTEN_BY FROM LMS_BOOK_DETAILS;

/*13) Write a query to display the average price of books which is belonging to ‘JAVA’ category with alias name “AVERAGEPRICE”.*/
SELECT AVG(PRICE) AS AVERAGEPRICE FROM LMS_BOOK_DETAILS WHERE CATEGORY='JAVA';

/*14) Write a query to display the supplier id, supplier name and email of the suppliers who are all having gmail account.*/
SELECT SUPPLIER_ID, SUPPLIER_NAME, EMAIL FROM LMS_SUPPLIERS_DETAILS WHERE EMAIL LIKE '%@gmail.com';

/*15) Write a query to display the supplier id, supplier name and contact details.
Contact details can be either phone number or email or address with alias name “CONTACTDETAILS”. 
If phone number is null then display email, even if email also null then display the address of the supplier. Hint: Use Coalesce function.*/
SELECT SUPPLIER_ID, SUPPLIER_NAME, COALESCE(CONTACT, EMAIL, ADDRESS) AS CONTACTDETAILS FROM LMS_SUPPLIERS_DETAILS;

/*16) Write a query to display the supplier id, supplier name and contact. 
If phone number is null then display ‘No’ else display ‘Yes’ with alias name “PHONENUMAVAILABLE”. Hint: Use NVL2.*/
SELECT SUPPLIER_ID, SUPPLIER_NAME, CASE WHEN CONTACT IS NOT NULL THEN 'YES' ELSE 'NO' END AS PHONENUMAVAILABLE FROM LMS_SUPPLIERS_DETAILS;


/*EXERCISE PROBLEMS*/
/*1) Write a query to display the member id, member name of the members, book code and book title of the books taken by them.*/
SELECT M.MEMBER_ID, M.MEMBER_NAME,B.BOOK_CODE, B.BOOK_TITLE FROM LMS_MEMBERS M JOIN LMS_BOOK_ISSUE I ON M.MEMBER_ID = I.MEMBER_ID JOIN LMS_BOOK_DETAILS B ON I.BOOK_CODE = B.BOOK_CODE;

/*2) Write a query to display the total number of books available in the library with alias name “NO_OF_BOOKS_AVAILABLE” (Which is not issued). 
Hint: The issued books details are available in the LMS_BOOK_ISSUE table.*/
SELECT COUNT(BOOK_CODE) AS NO_OF_BOOKS_AVAILABLE FROM LMS_BOOK_DETAILS WHERE BOOK_CODE NOT IN(SELECT BOOK_CODE FROM LMS_BOOK_ISSUE);

/*3) Write a query to display the member id, member name, fine range and fine amount of the members whose fine amount is less than 100.*/
SELECT M.MEMBER_ID, M.MEMBER_NAME, F.FINE_RANGE, F.FINE_AMOUNT FROM LMS_MEMBERS M JOIN LMS_BOOK_ISSUE I ON M.MEMBER_ID = I.MEMBER_ID JOIN LMS_FINE_DETAILS F ON I.FINE_RANGE = F.FINE_RANGE WHERE F.FINE_AMOUNT<100;

/*4) Write a query to display the book code, book title and availability status of the ‘JAVA’ books whose edition is "6”. 
Show the availability status with alias name “AVAILABILITYSTATUS”. Hint: Book availability status can be fetched from “BOOK_ISSUE_STATUS” column of LMS_BOOK_ISSUE table.*/
SELECT B.BOOK_CODE, B.BOOK_TITLE, I.BOOK_ISSUE_NO AS AVAILABILITYSTATUS FROM LMS_BOOK_DETAILS B JOIN LMS_BOOK_ISSUE I ON B.BOOK_CODE = I.BOOK_CODE WHERE B.CATEGORY = 'JAVA' AND B.BOOK_EDITION = '6';

/*5) Write a query to display the book code, book title and rack number of the books which are placed in rack 'A1' and sort by book title in ascending order.*/
SELECT BOOK_CODE, BOOK_TITLE, RACK_NUM FROM LMS_BOOK_DETAILS WHERE RACK_NUM = 'A1' ORDER BY BOOK_TITLE;

/*6) Write a query to display the member id, member name, due date and date returned of the members who has returned the books after the due date. 
Hint: Date_return is due date and Date_returned is actual book return date.*/
SELECT M.MEMBER_ID, M.MEMBER_NAME, I.DATE_RETURN AS DUE_DATE, I.DATE_RETURNED FROM LMS_MEMBERS M JOIN LMS_BOOK_ISSUE I ON M.MEMBER_ID = I.MEMBER_ID WHERE I.DATE_RETURNED > I.DATE_RETURN;

/*7) Write a query to display the member id, member name and date of registration who have not taken any book.*/
SELECT MEMBER_ID, MEMBER_NAME, DATE_REGISTER FROM LMS_MEMBERS WHERE MEMBER_ID NOT IN(SELECT MEMBER_ID FROM LMS_BOOK_ISSUE);

/*8) Write a Query to display the member id and member name of the members who has not paid any fine in the year 2012.*/
SELECT M.MEMBER_ID, M.MEMBER_NAME FROM LMS_MEMBERS M WHERE M.MEMBER_ID NOT IN (SELECT DISTINCT L.MEMBER_ID FROM LMS_BOOK_ISSUE L WHERE L.FINE_RANGE IN (SELECT F.FINE_RANGE FROM LMS_FINE_DETAILS F WHERE EXTRACT(YEAR FROM L.DATE_ISSUE) = 2012 AND F.FINE_AMOUNT > 0));

/*9) Write a query to display the date on which the maximum numbers of books were issued and the number of books issued with alias name “NOOFBOOKS”.*/
SELECT DATE_ISSUE, MAX(BOOK_ISSUE_NO) AS NOOFBOOKS FROM LMS_BOOK_ISSUE GROUP BY DATE_ISSUE ORDER BY NOOFBOOKS DESC;

/*10) Write a query to list the book title and supplier id for the books authored by “Herbert Schildt" and the book edition is 5 and supplied by supplier ‘S01’.*/
SELECT B.BOOK_TITLE, B.SUPPLIER_ID FROM LMS_BOOK_DETAILS B JOIN LMS_SUPPLIERS_DETAILS S ON B.SUPPLIER_ID = S.SUPPLIER_ID WHERE B.AUTHOR = 'Herbert Schildt' AND B.BOOK_EDITION = 5 AND S.SUPPLIER_ID = 'S01';
SELECT BOOK_TITLE, SUPPLIER_ID FROM LMS_BOOK_DETAILS WHERE AUTHOR LIKE 'h%' AND SUPPLIER_ID='S01' AND BOOK_EDITION=5;

/*11) Write a query to display the rack number and the number of books in each rack with alias name “NOOFBOOKS” and sort by rack number in ascending order.*/
SELECT COUNT(RACK_NUM) AS NOOFBOOKS, RACK_NUM FROM LMS_BOOK_DETAILS GROUP BY RACK_NUM ORDER BY COUNT(RACK_NUM);

/*12) Write a query to display book issue number, member name, date or registration, date of expiry, book title, category author, price, date of issue, date of return, actual returned date, issue status, fine amount.*/
SELECT  MEMBER_NAME, BOOK_TITLE, CATEGORY, AUTHOR, PRICE, DATE_ISSUE, DATE_RETURN, DATE_RETURNED, BOOK_ISSUE_NO, FINE_AMOUNT FROM LMS_BOOK_DETAILS JOIN LMS_MEMBERS JOIN LMS_SUPPLIERS_DETAILS JOIN LMS_BOOK_ISSUE JOIN LMS_FINE_DETAILS;

/*13) Write a query to display the book code, title, publish date of the books which is been published in the month of December.*/
SELECT BOOK_CODE, BOOK_TITLE, PUBLISH_DATE FROM LMS_BOOK_DETAILS WHERE MONTH(PUBLISH_DATE) = 12;

/*14) Write a query to display the book code, book title and availability status of the ‘JAVA’ books whose edition is "5”. 
Show the availability status with alias name “AVAILABILITYSTATUS”. Hint: Book availability status can be fetched from 
“BOOK_ISSUE_STATUS” column of LMS_BOOK_ISSUE table.*/
SELECT B.BOOK_CODE, B.BOOK_TITLE, I.BOOK_ISSUE_STATUS AS AVAILABILITY_STATUS FROM LMS_BOOK_DETAILS B, LMS_BOOK_ISSUE I WHERE B.CATEGORY = 'JAVA' AND B.BOOK_CODE = I.BOOK_CODE;
SELECT DISTINCT D.BOOK_CODE, D.BOOK_TITLE, B.BOOK_ISSUE_STATUS AS AVAILABILITYSTATUS FROM LMS_BOOK_ISSUE B, LMS_BOOK_DETAILS D WHERE D.CATEGORY = 'JAVA' AND BOOK_EDITION = 5;




/*STRING FUNCTIONS*/
SELECT ASCII(MEMBER_NAME) FROM LMS_MEMBERS;
SELECT CHAR(70) AS CODETOCHAR;
SELECT CONCAT('NILESH', ' ', 'ENUGANDHULA') AS CONCAT;
SELECT CONCAT_WS(' ','E','NILESH') AS CONCATWS;
SELECT CONCAT_WS('*','E','NILESH') AS CONCATWS;
SELECT LENGTH('ENUGANDHULA') AS LENGTH;
SELECT REVERSE('NILESH') AS REVERSE;
SELECT SUBSTRING(MEMBER_NAME, 1, 3) AS STRING FROM LMS_MEMBERS;
SELECT ABS(20);
SELECT AVG(CONTACT) FROM LMS_SUPPLIERS_DETAILS;
SELECT CEILING(209.42345) AS CEIL;
SELECT COUNT(CONTACT) FROM LMS_SUPPLIERS_DETAILS;
SELECT DEGREES(1.80) AS DEG;
SELECT FLOOR(1.80) AS FLOOR;
SELECT MAX(CONTACT) FROM LMS_SUPPLIERS_DETAILS;
SELECT MIN(CONTACT) FROM LMS_SUPPLIERS_DETAILS;
SELECT RAND()*(10-5)+5 AS RANDOM;
SELECT ROUND(223.2324) AS ROUND;
SELECT SIGN(223.2324) AS SIGN;
SELECT SIGN(000.0) AS SIGN;
SELECT SIGN(-9000.0) AS SIGN;
SELECT SQRT(25) AS SQRT;
SELECT ADDDATE('2017/08/23', INTERVAL 1 YEAR) AS DATEADD;
SELECT DATEDIFF('2078/08/23', CURDATE()) AS DATEDIFF;
SELECT DAY('2045/05/14 09:09') AS DATE;
SELECT SYSDATE();
SELECT YEAR('1998/05/14') AS YEAR;