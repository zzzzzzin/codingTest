select MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH, 'yyyy-mm-dd') as DATE_OF_BIRTH
from member_profile
where extract(month from DATE_OF_BIRTH) = 03
    and TLNO is not null
    and GENDER = 'W'
order by MEMBER_ID;