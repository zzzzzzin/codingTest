-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, to_char(HIRE_YMD, 'yyyy-mm-dd')
from DOCTOR
where MCDP_CD in ('CS', 'GS')
order by HIRE_YMD desc, DR_NAME;