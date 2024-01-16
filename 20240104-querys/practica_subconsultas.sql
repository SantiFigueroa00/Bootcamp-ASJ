USE BASETOMI

--ordenes (numero, fecha, total) cuyo precio total sea mayor al precio promedio de los productos
SELECT o.number_order as 'Nro Orden', o.date as 'Fecha',o.total as 'Total',
(SELECT AVG(sale_price) from products) as Prom	
FROM orders o
WHERE o.total>(SELECT AVG(sale_price) from products);