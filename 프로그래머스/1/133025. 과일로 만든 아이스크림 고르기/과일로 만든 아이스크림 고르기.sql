select a.FLAVOR
from ICECREAM_INFO a
    inner join FIRST_HALF b
        on a.FLAVOR = b.FLAVOR
where a.INGREDIENT_TYPE = 'fruit_based' and b.TOTAL_ORDER > 3000
