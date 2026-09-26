SELECT
    customers.name,
    orders.id
FROM
    customers
INNER JOIN
        orders on orders.id_customers = customers.id
WHERE
    orders.orders_date BETWEEN '2016-01-01' and '2016-06-30'