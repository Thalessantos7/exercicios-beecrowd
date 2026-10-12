SELECT p.year, us.name AS sender, ur.name AS receiver
FROM packages p
JOIN users us ON p.id_user_sender = us.id
JOIN users ur ON p.id_user_receiver = ur.id
WHERE (p.color = 'blue' OR p.year = 2015)
AND us.address != 'Taiwan'
AND ur.address != 'Taiwan'
ORDER BY p.year DESC;