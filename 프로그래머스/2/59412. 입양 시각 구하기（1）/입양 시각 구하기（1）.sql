SELECT 
    case
        when to_char(datetime, 'hh24') = '09' then '9'
        when to_char(datetime, 'hh24') = '10' then '10'
        when to_char(datetime, 'hh24') = '11' then '11'
        when to_char(datetime, 'hh24') = '12' then '12'
        when to_char(datetime, 'hh24') = '13' then '13'
        when to_char(datetime, 'hh24') = '14' then '14'
        when to_char(datetime, 'hh24') = '15' then '15'
        when to_char(datetime, 'hh24') = '16' then '16'
        when to_char(datetime, 'hh24') = '17' then '17'
        when to_char(datetime, 'hh24') = '18' then '18'
        when to_char(datetime, 'hh24') = '19' then '19'
    end as hour,
    count(
        case 
            when to_char(datetime, 'hh24') = '09' then 1
            when to_char(datetime, 'hh24') = '10' then 1
            when to_char(datetime, 'hh24') = '11' then 1
            when to_char(datetime, 'hh24') = '12' then 1
            when to_char(datetime, 'hh24') = '13' then 1
            when to_char(datetime, 'hh24') = '14' then 1
            when to_char(datetime, 'hh24') = '15' then 1
            when to_char(datetime, 'hh24') = '16' then 1
            when to_char(datetime, 'hh24') = '17' then 1
            when to_char(datetime, 'hh24') = '18' then 1
            when to_char(datetime, 'hh24') = '19' then 1
        end
    ) as count
FROM ANIMAL_OUTS
GROUP BY to_char(datetime, 'hh24')
having to_char(datetime, 'hh24') between '09' and '19'
order by to_char(datetime, 'hh24')
;
