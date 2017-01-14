INSERT INTO moeiwast_eiwatest_DB1.test_table (INT_NUM, NAME_STR, DBL_NUM, CREATE_DATE)
 VALUES ( 98765, 'ñˆè¿Å@ó»', 987.654, '2087/12/31');
 
UPDATE moeiwast_eiwatest_DB1.test_table SET NAME_STR='Ç†Ç¢Ç§Ç¶Ç®' WHERE INT_NUM=98765;

SELECT * FROM moeiwast_eiwatest_DB1.test_table ORDER BY CREATE_DATE DESC ;
