select NAME 
from (select NAME, DATETIME from ANIMAL_INS  order by DATETIME)
    where rownum = 1;