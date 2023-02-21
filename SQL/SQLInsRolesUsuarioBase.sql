INSERT INTO `rol`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`)  
VALUES ('Administrador','Rol administrador del sistema.','ADMN',1,NOW(),'SERVER',null,null,null,null);

INSERT INTO `rol`(`nombre`, `descripcion`, `abreviatura`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('Bodeguero','Rol usuario generico del sistema.','BODG',1,NOW(),'SERVER',null,null,null,null);


INSERT INTO `usuario`(`userName`, `password`, `codigoEmpleado`, `cedula`, `primerNombre`, `segundoNombre`, `primerApellido`, `segundoApellido`, `Cargo`, `Departamento`, `idRol`, `fechaNacimiento`, `direccion`, `estado`, `fechaIngreso`, `usuarioIngreso`, `fechaModifica`, `usuarioModifica`, `fechaElimina`, `usuarioElimina`) 
VALUES ('0200338877','628612b803c647a7de70f0306c6bbc489d8b75e6ffef150b70a1553a5a7abbeb',
'28','0200338877','Jonathan','Ulises','Cevallos','Guambuguete','Bodeguero','Administracion',2,'1994-02-24','Daule',1,NOW(),'SERVER',null,null,null,null);
