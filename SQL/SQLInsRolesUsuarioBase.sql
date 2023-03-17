-- Roles
INSERT INTO `rol`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)  
VALUES ('Administrador','Rol administrador del sistema.','ADMN',1,NOW(),'SERVER',null,null,null,null);

INSERT INTO `rol`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Bodeguero','Rol usuario generico del sistema.','BODG',1,NOW(),'SERVER',null,null,null,null);


-- Permisos

INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Clientes','Opción de clientes','CLIE',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Proveedores','Opción de proveedores','PROV',1, NOW(),'SERVER',null,null,null,null);


INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Productos','Opción de productos','PROD',1, NOW(),'SERVER',null,null,null,null);


INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Entradas','Opción de entradas de productos','EPRO',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Salidas','Opción de salidas de productos','SPRO',1, NOW(),'SERVER',null,null,null,null);


INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Inventario','Opción de inventario','INVE',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Categorias','Opción de categorias','CATE',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Medidas','Opción de medidas','MEDI',1, NOW(),'SERVER',null,null,null,null);


INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Usuarios','Opción de usuarios','USUA',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `permiso`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Roles','Opción de roles','ROLE',1, NOW(),'SERVER',null,null,null,null);



-- Menu


INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,'Clientes','menú clientes',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (2,'Proveedores','menú proveedores',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (3,'Productos','menú productos',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (4,'Entradas','menú entradas',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (5,'Salidas','menú salidas',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (6,'Inventario','menú inventario',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (7,'Categorias','menú categorias',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (8,'Medidas','menú medidas',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (9,'Usuarios','menú usuarios',1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `menu`(`idPermiso`, `nombre`, `descripcion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (10,'Roles','menú roles',1, NOW(),'SERVER',null,null,null,null);



-- RolPermiso
-- Permisos Administrador
INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,1,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,2,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,3,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,4,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,5,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,6,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,7,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,8,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,9,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,10,1, NOW(),'SERVER',null,null,null,null);

-- Permisos Bodeguero

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,1,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,2,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,3,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,4,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,5,1, NOW(),'SERVER',null,null,null,null);

INSERT INTO `rolpermiso`(`idRol`, `idPermiso`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES (1,6,1, NOW(),'SERVER',null,null,null,null);



-- Usuarios

INSERT INTO `usuario`(`userName`, `password`, `codigoEmpleado`, `cedula`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `Cargo`, `Departamento`, `idRol`, `fechaNacimiento`, `direccion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('0200338877','628612b803c647a7de70f0306c6bbc489d8b75e6ffef150b70a1553a5a7abbeb',
'28','0200338877','Jonathan','Ulises','Cevallos','Guambuguete','Bodeguero','Administracion',2,'1994-02-24','Daule',1,NOW(),'SERVER',null,null,null,null);
--jonathan

INSERT INTO `usuario`(`userName`, `password`, `codigoEmpleado`, `cedula`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `Cargo`, `Departamento`, `idRol`, `fechaNacimiento`, `direccion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('admin','41E5653FC7AEB894026D6BB7B2DB7F65902B454945FA8FD65A6327047B5277FB',
'28','0200338877','Jonathan','Ulises','Cevallos','Guambuguete','Bodeguero','Administracion',1,'1994-02-24','Daule',1,NOW(),'SERVER',null,null,null,null);

--admin12345

-- Parametro general

INSERT INTO `parametrogeneral`( `nombre`, `valor`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Empresa','Farmacia El SuperDescuento','EMPR',1,NOW(),'SERVER',null,null,null,null);



