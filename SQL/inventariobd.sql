CREATE DATABASE Inventario;

use Inventario;

CREATE TABLE Categoria (idCategoria int not null AUTO_INCREMENT,
nombre varchar (40) not null,
abreviatura varchar (4) not null,
descripcion varchar (200) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idCategoria)
);


CREATE TABLE Medida
(
idMedida int not null AUTO_INCREMENT,
descripcion varchar (200) not null,
abreviatura varchar (4) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idMedida)
);

CREATE TABLE Producto
(
idProducto int not null AUTO_INCREMENT,
codigo varchar (5) not null,
nombre varchar (40) not null,
descripcion varchar (200) not null,
idCategoria int not null,
idMedida int not null,
precio float (8,2) not null,
porcentajeIva int not null,
fechaCaducidad date not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idProducto),
Foreign Key(idCategoria) References Categoria(idCategoria),
Foreign Key(idMedida) References Medida(idMedida)
);

CREATE TABLE Proveedor
(
idProveedor int not null AUTO_INCREMENT,
ruc varchar (13) not null,
razonSocial varchar (200) not null,
primerNombre varchar (40) not null,
segundoNombre varchar (40) not null,
primerApellido varchar (40) not null,
segundoApellido varchar (40) not null,
correo varchar (200) not null,
direccion varchar (200) not null,
telefono varchar (10) not null,
celular varchar (10) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idProveedor)
);



CREATE TABLE Cliente
(
idCliente int not null AUTO_INCREMENT,
ruc varchar (13) not null,
razonSocial varchar (200) not null,
primerNombre varchar (40) not null,
segundoNombre varchar (40) not null,
primerApellido varchar (40) not null,
segundoApellido varchar (40) not null,
correo varchar (200) not null,
direccion varchar (200) not null,
telefono varchar (10) not null,
celular varchar (10) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idCliente)
);




CREATE TABLE EntradaProducto
(
idEntradaProducto int not null AUTO_INCREMENT,
codigo varchar (5) not null,
idProveedor int not null,
fechaEntrada datetime not null,
subtotal float (8,2) not null,
valorIva float (8,2) not null,
valorDescuento float (8,2) not null,
total float (8,2) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idEntradaProducto),
Foreign Key(idProveedor) References Proveedor(idProveedor)
);

CREATE TABLE SalidaProducto
(
idSalidaProducto int not null AUTO_INCREMENT,
Codigo varchar (5) not null,
idCliente int not null,
fechaSalida datetime not null,
subtotal float (8,2) not null,
valorIva float (8,2) not null,
valorDescuento float (8,2) not null,
total float (8,2) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idSalidaProducto),
Foreign Key(idCliente) References Cliente(idCliente)
);

CREATE TABLE DetalleEntradaProducto
(
idDetalleEntradaProducto int not null AUTO_INCREMENT,
idEntradaProducto int not null,
idProducto int not null,
subtotal float (8,2) not null,
valorIva float (8,2) not null,
valorDescuento float (8,2) not null,
total float (8,2) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idDetalleEntradaProducto),
Foreign Key(idEntradaProducto) References EntradaProducto(idEntradaProducto),
Foreign Key(idProducto) References Producto(idProducto)
);

CREATE TABLE DetalleSalidaProducto
(
idDetalleSalidaProducto int not null AUTO_INCREMENT,
idSalidaProducto int not null,
idProducto int not null,
subtotal float (8,2) not null,
valorIva float (8,2) not null,
valorDescuento float (8,2) not null,
total float (8,2) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idDetalleSalidaProducto),
Foreign Key(idSalidaProducto) References SalidaProducto(idSalidaProducto),
Foreign Key(idProducto) References Producto(idProducto)
);


CREATE TABLE ParametroGeneral
(
idParametroGeneral int not null AUTO_INCREMENT,
nombre varchar (40) not null,
valor varchar (200) not null,
abreviatura varchar (4) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idParametroGeneral)
);

CREATE TABLE Rol
(
idRol int not null AUTO_INCREMENT,
nombre varchar (40) not null,
descripcion varchar (200) not null,
abreviatura varchar (4) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idRol)
);

CREATE TABLE Usuario
(
idUsuario int not null AUTO_INCREMENT,
userName varchar (10) not null,
password varchar (200) not null,
codigoEmpleado varchar (5) not null,
cedula varchar (10) not null,
primerNombre varchar (40) not null,
segundoNombre varchar (40) not null,
primerApellido varchar (40) not null,
segundoApellido varchar (40) not null,
Cargo varchar (120) not null,
Departamento varchar (120) not null,
idRol int not null,
fechaNacimiento date not null,
direccion varchar (400) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idUsuario),
Foreign Key(idRol) References Rol(idRol)
);

CREATE TABLE Permiso
(
idPermiso int not null AUTO_INCREMENT,
nombre varchar (10) not null,
descripcion varchar (15) not null,
abreviatura varchar (3) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idPermiso)
);

CREATE TABLE Menu
(
idMenu int not null AUTO_INCREMENT,
idPermiso int not null,
nombre varchar (80) not null,
descripcion varchar (200) not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idMenu),
Foreign Key(idPermiso) References Permiso(idPermiso)
);

CREATE TABLE RolPermiso
(
idRolPermiso int not null AUTO_INCREMENT,
idRol int not null,
idPermiso int not null,
estado smallint not null,
fechaIngreso datetime null,
usuarioIngreso varchar(10) null,
fechaModifica datetime null,
usuarioModifica varchar(10) null,
fechaElimina datetime null,
usuarioElimina varchar(10) null,
Primary Key(idRolPermiso),
Foreign Key(idRol) References Rol(idRol),
Foreign Key(idPermiso) References Permiso(idPermiso)
);
