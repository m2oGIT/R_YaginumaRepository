DELETE FROM moeiwast_eiwatest_DB01.test01_yaginuma WHERE STAFF_NO=10000000002;

INSERT INTO moeiwast_eiwatest_DB01.test01_yaginuma (STAFF_NO, OFFICE_CD, STAFF_NAME, WORK_TIME, CREATE_DATE)
VALUES (10000000004, 003, '���@��', 190, '2015/04/01');

SELECT * FROM moeiwast_eiwatest_DB01.test01_yaginuma;