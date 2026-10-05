SELECT name, CAST(salary * 0.10 AS NUMERIC(10,2))
FROM people
WHERE salary > 3000;