use blockbuster

-- Insertar valores de ejemplo en la tabla Formatos
INSERT INTO Formatos (form_nombre) VALUES
('DVD'),
('Blu-ray'),
('CD');

-- Insertar valores de ejemplo en la tabla Stock
INSERT INTO Stock (stock_cant, stock_min) VALUES
(100, 20),
(150, 30),
(80, 15);

-- Insertar valores de ejemplo en la tabla Categorias
INSERT INTO Categorias (cat_nombre) VALUES
('Acción'),
('Drama'),
('Comedia');

-- Insertar valores de ejemplo en la tabla Paises
INSERT INTO Paises (pais_nombre) VALUES
('Estados Unidos'),
('Reino Unido'),
('España');

-- Insertar valores de ejemplo en la tabla Provincias
INSERT INTO Provincias (prov_nombre, id_pais) VALUES
('California', 1),
('Londres', 2),
('Madrid', 3);

-- Insertar valores de ejemplo en la tabla Localidades
INSERT INTO Localidades (loc_nombre, id_prov) VALUES
('Los Angeles', 1),
('Manchester', 2),
('Barcelona', 3);

-- Insertar valores de ejemplo en la tabla Productos
INSERT INTO Productos (prod_nombre, prod_autor, prod_tipo, prod_fecLanz, prod_precCompra, prod_precAlquiler, id_form, id_stock, id_pais, id_cat) VALUES
('Pelicula 1', 'Director 1', 'Pelicula', '2022-01-01', 10.99, 3.99, 1, 1, 1, 1),
('Serie 1', 'Creador 1', 'Serie', '2022-02-01', 19.99, 5.99, 2, 2, 2, 2),
('Musica 1', 'Artista 1', 'Musica', '2022-03-01', 8.99, 2.99, 3, 3, 3, 3);

-- Insertar valores de ejemplo en la tabla Clientes
INSERT INTO Clientes (cli_dni, cli_nombre, cli_apellido, cli_mail, cli_tel, cli_direc, cli_fecNac, cli_esSocio, id_loc) VALUES
(12345678, 'Cliente1', 'Apellido1', 'cliente1@example.com', '123-456-7890', 'Dirección1', '1990-01-15', 1, 1),
(87654321, 'Cliente2', 'Apellido2', 'cliente2@example.com', '987-654-3210', 'Dirección2', '1985-05-20', 0, 2),
(55555555, 'Cliente3', 'Apellido3', 'cliente3@example.com', '555-555-5555', 'Dirección3', '1998-11-10', 1, 3);

-- Insertar valores de ejemplo en la tabla Pedidos
INSERT INTO Pedidos (ped_fec, ped_estado, ped_tipo, ped_desc, id_cliente) VALUES
('2022-01-10', 'Pendiente', 'Venta', 0, 1),
('2022-02-15', 'En Proceso', 'Alquiler', 2.5, 2),
('2022-03-20', 'Entregado', 'Venta', 0, 3);

-- Insertar valores de ejemplo en la tabla Detalle_Pedidos
INSERT INTO Detalle_Pedidos (det_cant, det_precio, id_prod, id_ped) VALUES
(2, 21.98, 1, 1),
(1, 5.99, 2, 2),
(3, 26.97, 3, 3);

-- Insertar valores de ejemplo en la tabla Sucursales
INSERT INTO Sucursales (suc_nombre, suc_tel, suc_direc, id_loc) VALUES
('Sucursal1', '123-456-7890', 'DirecciónSuc1', 1),
('Sucursal2', '987-654-3210', 'DirecciónSuc2', 2),
('Sucursal3', '555-555-5555', 'DirecciónSuc3', 3);

-- Insertar valores de ejemplo en la tabla Productos_Sucursal
INSERT INTO Productos_Sucursal (id_suc, id_prod) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Insertar valores de ejemplo en la tabla Empleados
INSERT INTO Empleados (emp_dni, emp_nombre, emp_apellido, emp_mail, emp_tel, emp_direc, id_loc, id_suc) VALUES
(11111111, 'Empleado1', 'ApellidoEmp1', 'empleado1@example.com', '111-111-1111', 'DirecciónEmp1', 1, 1),
(22222222, 'Empleado2', 'ApellidoEmp2', 'empleado2@example.com', '222-222-2222', 'DirecciónEmp2', 2, 2),
(33333333, 'Empleado3', 'ApellidoEmp3', 'empleado3@example.com', '333-333-3333', 'DirecciónEmp3', 3, 3);

-- Insertar valores de ejemplo en la tabla Pagos
INSERT INTO Pagos (pago_monto, pago_fec, id_cliente, id_ped, id_suc, id_emp) VALUES
(21.98, '2022-01-11', 1, 1, 1, 1),
(5.99, '2022-02-16', 2, 2, 2, 2),
(26.97, '2022-03-21', 3, 3, 3, 3);

-- Insertar valores de ejemplo en la tabla Tipo_metodos
INSERT INTO Tipo_metodos (met_tipo) VALUES
('Tarjeta'),
('Efectivo'),
('Transferencia');

-- Insertar valores de ejemplo en la tabla Tipo_metodos_Pagos
INSERT INTO Tipo_metodos_Pagos (tmp_monto, id_tipo, id_pago) VALUES
(21.98, 1, 1),
(5.99, 2, 2),
(26.97, 3, 3);
