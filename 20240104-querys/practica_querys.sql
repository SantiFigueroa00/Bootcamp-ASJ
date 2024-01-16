--SELECT cli_nombre as NOMBRE, cli_apellido as APELLIDO , cli_mail as MAIL
--  FROM Clientes, Pedidos
--  where Clientes.id = Pedidos.id;


SELECT ped_fec as Fecha, pago_monto as Total , cli_nombre as Nombre, cli_esSocio as Socio
  FROM Clientes, Pedidos, Pagos
  where Clientes.id = Pedidos.id_cliente
  AND Pagos.id_ped = Pedidos.id
  AND Pagos.id_cliente = Clientes.id
  AND Clientes.cli_esSocio = 1
  AND Clientes.cli_mail LIKE '%gmail%'
  
  

