- Coalesce - if null put this value
```
select e.name, COALESCE(o.order_date, 'no values')
from Employee e
LEFT JOIN Order_table o on e.emp_id = o.emp_id;

```

- 