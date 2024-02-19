select MCDP_CD, count(PT_NO)
from APPOINTMENT
where to_char(APNT_YMD, 'yyyy-mm') like '2022-05'
group by MCDP_CD
order by count(PT_NO), MCDP_CD;