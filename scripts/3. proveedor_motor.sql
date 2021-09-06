USE datos;
CREATE TABLE Proveedor_motor (
	Nombre VARCHAR(50) NOT NULL PRIMARY KEY,
    Direccion VARCHAR(100) NOT NULL,
    Telefono VARCHAR(30) NOT NULL);
    
INSERT INTO proveedor_motor(Nombre, Direccion, Telefono) VALUES ("Auteco", "calle 7 No. 45-17", "05713224459");
INSERT INTO proveedor_motor(Nombre, Direccion, Telefono) VALUES ("Hitachi", "calle 19 No. 108-26", "05714223344");
INSERT INTO proveedor_motor(Nombre, Direccion, Telefono) VALUES ("Bosch", "carrera 68 No. 26-45", "05715678798");
INSERT INTO proveedor_motor(Nombre, Direccion, Telefono) VALUES ("Teco", "calle 77 No. 68-33", "05712213243");
INSERT INTO proveedor_motor(Nombre, Direccion, Telefono) VALUES ("General Electric", "calle 29 No. 26-12", "05717239919");