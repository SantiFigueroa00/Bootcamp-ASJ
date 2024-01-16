SELECT COUNT(o.id) as Pedidos,  CONCAT(c.name, ' ', c.last_name) as 'NOMBRE COMPLETO'
FROM orders o, clients c
WHERE o.id_client=c.id
GROUP BY CONCAT(c.name, ' ', c.last_name)


-- cantidad de cada producto se compro o alquilo
SELECT COUNT(p.id) as Pedidos, p.title as NOMBRE_PROD
FROM order_details o, products p
WHERE o.id_product=p.id
GROUP BY p.title

SELECT SUM(o.cant) as Pedidos, p.title as NOMBRE_PROD
FROM order_details o, products p
WHERE o.id_product=p.id
GROUP BY p.title



--top 5 de los generos mas pedidos
SELECT SUM(o.cant) as Pedidos, g.gender as NOMBRE_GENERO
FROM order_details o, products p, genders g
WHERE o.id_product=p.id AND p.id_gender=g.id
GROUP BY g.gender
ORDER BY SUM(o.cant) DESC


--Empleados (legajo, nombre, apellido) que trabajaron entre el 12 y 15 de enero de 2024.
--Ordenado por fecha Z-A y legajo A-Z
SELECT e.legajo as legajo, e.name as nombre, e.last_name as apellido, o.date as fecha
FROM orders o
INNER JOIN employees e ON e.id = o.id_employee
WHERE o.date BETWEEN '2024-01-12' AND '2024-01-17'
ORDER BY o.date DESC, e.legajo ASC;


SELECT p.payment_method as metodo, count(o.id_payment_method) as cantidad
FROM orders o
INNER JOIN payment_methods p ON p.id = o.id_payment_method
JOIN clients c ON c.id=o.id_client
WHERE c.is_partner = 1
GROUP BY p.payment_method
HAVING count(o.id_payment_method)>=2;

