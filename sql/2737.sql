WITH maior AS (
    SELECT name, customers_number
    FROM lawyers
    ORDER BY customers_number DESC, register
    LIMIT 1
    ),
    menor AS (
SELECT name, customers_number
FROM lawyers
ORDER BY customers_number ASC, register
    LIMIT 1
    ),
    resultado AS (
SELECT name, customers_number, 1 AS ordem FROM maior
UNION ALL
SELECT name, customers_number, 2 AS ordem FROM menor
UNION ALL
SELECT 'Average', ROUND(AVG(customers_number))::integer, 3
FROM lawyers
    )
SELECT name, customers_number
FROM resultado
ORDER BY ordem;