select user_id, product_id
from ONLINE_SALE 
group by product_id, user_id
having count(product_id) >= 2
order by user_id, product_id desc;