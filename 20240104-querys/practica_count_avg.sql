--SELECT *
--FROM Pedidos
--WHERE ped_fec BETWEEN '2022-02-15' AND '2022-04-10'


-- MOSTRAR LOS PRIMEROS 2% DE LOS PEDIDOS REALIZADOS POR SOCIOS
--SELECT TOP 2 PERCENT ped.id as Nro_Ped, ped_fec as Fecha, ped_tipo as TIPO, cli_nombre as NOMBRE_CLIENTE
--FROM Pedidos ped
--INNER JOIN Clientes cli ON ped.id = cli.id AND cli_esSocio=1;


-- CUANTOS SOCIOS VIVEN EN UNA PROVINCIA
--SELECT COUNT(cli.id) AS 'CANTIDAD DE SOCIOS'
--FROM Clientes cli
--INNER JOIN Localidades loc ON cli.id_loc = loc.id
--JOIN Provincias prov ON loc.id_prov = prov.id
--WHERE prov.prov_nombre = 'Madrid' AND cli.cli_esSocio=1;


----CUANTAS PELICULAS TENGO EN MIS PRODUCTOS
--SELECT COUNT(prod.id) AS 'CANTIDAD DE Peliculas'
--FROM Productos prod
--WHERE prod_tipo = 'Pelicula';


-- calculo de subtotal
--SELECT (det_cant*det_precio) as SUBTOTAL, id
--FROM Detalle_Pedidos 

-- 1- Calcular el promedio de venta de la sucursal 1
--SELECT AVG(pago_monto) AS 'Promedio de venta de la sucursal 1'
--FROM Pagos pago
--INNER JOIN Sucursales suc ON pago.id_suc = suc.id
--WHERE suc.id = 1;


-- 2- Calcular el promedio de venta del empleado 2
--SELECT AVG(pago_monto) AS 'Promedio de venta del empleado 2'
--FROM Pagos pago
--INNER JOIN Empleados emp ON pago.id_emp = emp.id
--WHERE emp.id = 2;

-- 3- Promedio de alquiler de series FALTO LO DE SERIES JE
SELECT AVG(pago_monto) AS 'Promedio de alquiler de series'
FROM Pagos pago
INNER JOIN Pedidos ped ON pago.id_ped = ped.id
WHERE ped_tipo = 'Alquiler';