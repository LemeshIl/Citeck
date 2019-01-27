select NUMB+1,l-NUMB-1
from
(select NUMB,lead(NUMB) over(order by NUMB)l
from TABLE_CITECK)
where NUMB<l-1
ORDER BY NUMB+1;


На списке 1,2,4,7 получен результат
3-1
5-2
результат в виде скрина:
http://prntscr.com/mcuj1o
