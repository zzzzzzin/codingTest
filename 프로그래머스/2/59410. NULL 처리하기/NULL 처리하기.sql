select 
    ANIMAL_TYPE, 
    case
        when NAME is not null then NAME
        when NAME is null then 'No name'
    end as NAME,
    SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID;