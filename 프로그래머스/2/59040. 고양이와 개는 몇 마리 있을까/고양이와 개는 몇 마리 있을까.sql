select ANIMAL_TYPE,
    count(case
        when ANIMAL_TYPE = 'Cat' then 1
        when ANIMAL_TYPE = 'Dog' then 2
    end)
from ANIMAL_INS 
group by ANIMAL_TYPE
order by ANIMAL_TYPE;