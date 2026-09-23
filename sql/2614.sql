SELECT
    c.name,
    r.rentals_date
FROM
    customers c
INNER JOIN
    rentals r ON r.id_customers = c.id
WHERE
    r.rentals_date >= '2016-09-01' AND r.rentals_date <= '2016-09-30'