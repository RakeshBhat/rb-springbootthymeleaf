
CREATE SCHEMA JGD AUTHORIZATION SA;
SET SCHEMA JGD;

DROP TABLE JGD.USER IF EXISTS;
CREATE TABLE JGD.USER(
ID INT GENERATED BY DEFAULT AS IDENTITY (START WITH 100, INCREMENT BY 1),
ROLE_ID INT,
MESSAGE CLOB,
FIRST_NAME VARCHAR(30),
LAST_NAME VARCHAR(30),
DOB TIMESTAMP,
MOBILE VARCHAR(14),
EMAIL VARCHAR(15),
ADDRESS VARCHAR(30),
FEEDBACK VARCHAR(30)
);
