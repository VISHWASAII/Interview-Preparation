- creating table with primary and foreign table
```
create table Employee(
  emp_id int PRIMARY KEY UNIQUE,
  name varchar(255),
  job_title varchar(255),
  salary int,
  dep_id int
);

create table Department_table(
  dep_id int PRIMARY KEY,
  dep_name varchar(255)
);

create table order_table(
  order_id int PRIMARY KEY UNIQUE,
  emp_id int,
  amount int,
  order_date DATE,
 FOREIGN KEY (emp_id) REFERENCES Employee(emp_id)
);
```

- Problems of Select to slove

```
### 🔹 Mixed SQL Questions (without JOIN)

1. **SELECT + WHERE + ORDER BY**  
    Write a query to display the `name` and `salary` of employees who earn more than `60,000`, ordered by salary in descending order.
    

---

2. **DISTINCT + WHERE**  
    Write a query to list all unique job titles of employees who earn less than `50,000`.
    

---

3. **TOP + ORDER BY**  
    Write a query to get the top `3` employees with the lowest salary.
    

---

4. **GROUP BY + HAVING**  
    Write a query to find job titles that have more than `3` employees.
    

---

5. **SELECT + GROUP BY + ORDER BY**  
    Write a query to display each job title and the average salary for that title, ordered by average salary in descending order.
    

---

6. **WHERE + GROUP BY + HAVING**  
    Write a query to count how many employees earn more than `40,000`, grouped by `job_title`, and only show job titles with more than `2` employees.
    

---

7. **DISTINCT + ORDER BY**  
    Write a query to display unique salaries of employees, ordered in ascending order.
    

---

8. **TOP + WHERE + ORDER BY**  
    Write a query to get the top 5 highest-paid employees who have a salary greater than `70,000`.
    

---

9. **SELECT + GROUP BY + HAVING + ORDER BY**  
    Write a query to display `job_title` and total salary spent on that job title, only for job titles where the total salary is above `200,000`, ordered by total salary descending.
```

## Joins

## Left Join

- It will display all values in left and right but the right NA will be blank

```
select e.name, o.order_date
from Employee e
LEFT JOIN Order_table o on e.emp_id = o.emp_id;

```

## Right join

- vice versa to left join

## Inner join
- It will provide inner join btw them
```
select e.name, o.order_date
from Employee e
INNER JOIN Order_table o on e.emp_id = o.emp_id;
```

## Full join
- It will join both side with non values
```
select e.name, o.order_date
from Employee e
INNER JOIN Order_table o on e.emp_id = o.emp_id;
```