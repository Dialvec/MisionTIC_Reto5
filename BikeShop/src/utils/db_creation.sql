/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Dialvec
 * Created: 7 sep. 2021
 */

DROP SCHEMA IF EXISTS BikeShop;
CREATE SCHEMA BikeShop;
USE BikeShop;


DROP TABLE IF EXISTS vehiculo;
CREATE TABLE vehiculo (
    fabricante VARCHAR(50) UNIQUE PRIMARY KEY
    );
INSERT INTO vehiculo (fabricante) VALUES ("Cannondale");
INSERT INTO vehiculo (fabricante) VALUES ("Trek");
INSERT INTO vehiculo (fabricante) VALUES ("Yeti");
INSERT INTO vehiculo (fabricante) VALUES ("Fuji");
INSERT INTO vehiculo (fabricante) VALUES ("Bmc");
INSERT INTO vehiculo (fabricante) VALUES ("Starker");
INSERT INTO vehiculo (fabricante) VALUES ("Lucky Lion");
INSERT INTO vehiculo (fabricante) VALUES ("Be Electric");
INSERT INTO vehiculo (fabricante) VALUES ("Aima");
INSERT INTO vehiculo (fabricante) VALUES ("Mec de Colombia");
INSERT INTO vehiculo (fabricante) VALUES ("Atom Electric");


DROP TABLE IF EXISTS bicicleta;
CREATE TABLE bicicleta (
    id_bicicleta INT AUTO_INCREMENT PRIMARY KEY,
    fabricante_fk VARCHAR(50) UNIQUE NULL,
    precio INT DEFAULT 0,
    anio_fabrica INT NOT NULL DEFAULT 0,
    FOREIGN KEY (fabricante_fk) REFERENCES vehiculo(fabricante)
    );
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Cannondale", 1200000, 2020);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Trek", 1450000, 2019);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Yeti", 2000000, 2020);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Fuji", 950000, 2021);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Bmc", 1950000, 2018);


DROP TABLE IF EXISTS proveedor_motor;
CREATE TABLE Proveedor_motor(
    nombre VARCHAR(50) NOT NULL PRIMARY KEY,
    direccion VARCHAR(100) DEFAULT '',
    telefono VARCHAR(30) DEFAULT ''
    );
INSERT INTO proveedor_motor(nombre, direccion, Telefono) VALUES ("Auteco", "calle 7 No. 45-17", "05713224459");
INSERT INTO proveedor_motor(nombre, direccion, telefono) VALUES ("Hitachi", "calle 19 No. 108-26", "05714223344");
INSERT INTO proveedor_motor(nombre, direccion, telefono) VALUES ("Bosch", "carrera 68 No. 26-45", "05715678798");
INSERT INTO proveedor_motor(nombre, direccion, telefono) VALUES ("Teco", "calle 77 No. 68-33", "05712213243");
INSERT INTO proveedor_motor(nombre, direccion, telefono) VALUES ("General Electric", "calle 29 No. 26-12", "05717239919");


DROP TABLE IF EXISTS moto_electrica;
CREATE TABLE moto_electrica (
    id_moto INT AUTO_INCREMENT PRIMARY KEY,
    fabricante_fk VARCHAR(50) UNIQUE NOT NULL,
    precio INT DEFAULT 0,
    proveedor_motor_fk VARCHAR(50) NOT NULL,
    autonomia INT DEFAULT 0,
    FOREIGN KEY (fabricante_fk) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (proveedor_motor_fk) REFERENCES proveedor_motor(nombre)
    );
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor_fk) VALUES ("Starker", 4200000, 18, "Auteco");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor_fk) VALUES ("Lucky Lion", 5600000, 14, "Hitachi");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor_fk) VALUES ("Be Electric",  4600000, 26, "Auteco");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor_fk) VALUES ("Aima", 8000000, 36, "Bosch");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor_fk) VALUES ("Mec de Colombia", 5900000, 20, "Teco");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor_fk) VALUES ("Atom Electric", 4500000, 12, "General Electric");


DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
	alias VARCHAR(20) NOT NULL PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    email VARCHAR(50) DEFAULT '',
	contrasena INT(8) DEFAULT 0,
    celular VARCHAR(20)DEFAULT '',
    dob DATE DEFAULT '00/00/0000'
    );
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("lucky", "Pedro", "Perez");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("malopez", "Maria", "Lopez");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("diva", "Ana", "Diaz");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("dreamer", "Luis", "Rojas");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("ninja", "Andres", "Cruz");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("neon", "Nelson", "Ruiz");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("rose", "Claudia", "Mendez");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("green", "Jorge", "Rodriguez");

DROP TABLE IF EXISTS intencion;
CREATE TABLE intencion (
    id_intencion INT AUTO_INCREMENT PRIMARY KEY,
    alias_cliente_fk VARCHAR(20) NOT NULL,
    fabricante_fk VARCHAR(50) NOT NULL,
    fechahora TIMESTAMP NOT NULL,
    FOREIGN KEY (fabricante_fk) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (alias_cliente_fk) REFERENCES cliente(alias)
    );
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("lucky","Cannondale", '2017-10-25 20:00:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("lucky", "Trek", '2019-03-15 18:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("lucky", "Starker", '2019-05-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("malopez", "Cannondale", '2018-05-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("malopez", "Starker", '2020-01-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("diva", "Yeti", '2019-05-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("diva",  "Fuji", '2018-06-22 21:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("diva", "Lucky Lion", '2020-03-17 15:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("dreamer", "Lucky Lion", '2020-03-17 15:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("dreamer", "Be Electric", '2020-04-10 18:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("ninja", "Aima", '2020-02-17 20:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("ninja", "Starker", '2020-02-20 16:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("ninja", "Mec de Colombia", '2020-03-27 18:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("rose", "Atom Electric", '2020-03-20 21:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("green", "Yeti", '2020-01-10 17:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("green", "Trek", '2020-02-15 20:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante_fk, fechahora) VALUES ("green", "Bmc", '2020-03-17 18:30:20');