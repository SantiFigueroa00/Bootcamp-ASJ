CREATE TABLE Formatos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    form_nombre VARCHAR(50)
);

CREATE TABLE Stock (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    stock_cant INT,
    stock_min INT
);

CREATE TABLE Categorias (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    cat_nombre VARCHAR(50)
);

CREATE TABLE Paises (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    pais_nombre VARCHAR(50)
);

CREATE TABLE Provincias (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    prov_nombre VARCHAR(50),
    id_pais INT,
    FOREIGN KEY (id_pais) REFERENCES Paises(id)
);

CREATE TABLE Localidades (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    loc_nombre VARCHAR(50),
    id_prov INT,
    FOREIGN KEY (id_prov) REFERENCES Provincias(id)
);

CREATE TABLE Productos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    prod_nombre VARCHAR(50),
    prod_autor VARCHAR(50),
    prod_tipo VARCHAR(50),
    prod_fecLanz DATE,
    prod_precCompra FLOAT,
    prod_precAlquiler FLOAT,
    id_form INT,
    id_stock INT,
    id_pais INT,
    id_cat INT,
    FOREIGN KEY (id_form) REFERENCES Formatos(id),
    FOREIGN KEY (id_stock) REFERENCES Stock(id),
    FOREIGN KEY (id_pais) REFERENCES Paises(id),
    FOREIGN KEY (id_cat) REFERENCES Categorias(id)
);

CREATE TABLE Clientes (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    cli_dni INT,
    cli_nombre VARCHAR(50),
    cli_apellido VARCHAR(50),
    cli_mail VARCHAR(50),
    cli_tel VARCHAR(50),
    cli_direc VARCHAR(50),
    cli_fecNac DATE,
    cli_esSocio BIT,
    id_loc INT,
    FOREIGN KEY (id_loc) REFERENCES Localidades(id)
);

CREATE TABLE Pedidos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    ped_fec DATE,
    ped_estado VARCHAR(50),
    ped_tipo VARCHAR(50),
    ped_desc FLOAT,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id)
);

CREATE TABLE Detalle_Pedidos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    det_cant INT,
    det_precio FLOAT,
    id_prod INT,
    id_ped INT,
    FOREIGN KEY (id_prod) REFERENCES Productos(id),
    FOREIGN KEY (id_ped) REFERENCES Pedidos(id)
);

CREATE TABLE Sucursales (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    suc_nombre VARCHAR(50),
    suc_tel VARCHAR(50),
    suc_direc VARCHAR(50),
    id_loc INT,
    FOREIGN KEY (id_loc) REFERENCES Localidades(id)
);

CREATE TABLE Productos_Sucursal (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    id_suc INT,
    id_prod INT,
    FOREIGN KEY (id_suc) REFERENCES Sucursales(id),
    FOREIGN KEY (id_prod) REFERENCES Productos(id)
);

CREATE TABLE Empleados (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    emp_dni INT,
    emp_nombre VARCHAR(50),
    emp_apellido VARCHAR(50),
    emp_mail VARCHAR(50),
    emp_tel VARCHAR(50),
    emp_direc VARCHAR(50),
    id_loc INT,
    id_suc INT,
    FOREIGN KEY (id_loc) REFERENCES Localidades(id),
    FOREIGN KEY (id_suc) REFERENCES Sucursales(id)
);

CREATE TABLE Pagos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    pago_monto FLOAT,
    pago_fec DATE,
    id_cliente INT,
    id_ped INT,
    id_suc INT,
    id_emp INT,
    FOREIGN KEY (id_cliente) REFERENCES Clientes(id),
    FOREIGN KEY (id_ped) REFERENCES Pedidos(id),
    FOREIGN KEY (id_suc) REFERENCES Sucursales(id),
    FOREIGN KEY (id_emp) REFERENCES Empleados(id)
);

CREATE TABLE Tipo_metodos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    met_tipo VARCHAR(50)
);

CREATE TABLE Tipo_metodos_Pagos (
    id INT NOT NULL PRIMARY KEY IDENTITY(1,1),
    tmp_monto FLOAT,
    id_tipo INT,
    id_pago INT,
    FOREIGN KEY (id_tipo) REFERENCES Tipo_metodos(id),
    FOREIGN KEY (id_pago) REFERENCES Pagos(id)
);
