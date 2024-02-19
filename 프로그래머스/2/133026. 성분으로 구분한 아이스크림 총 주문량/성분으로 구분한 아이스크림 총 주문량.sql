select
    INGREDIENT_TYPE,
    sum(
        (select TOTAL_ORDER from FIRST_HALF where FLAVOR = a.FLAVOR) 
    ) as TOTAL_ORDER
from ICECREAM_INFO a
group by a.INGREDIENT_TYPE
order by TOTAL_ORDER
;