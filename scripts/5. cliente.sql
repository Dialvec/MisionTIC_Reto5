USE datos;
CREATE TABLE cliente (
	alias VARCHAR(20) NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    email VARCHAR(50) DEFAULT '',
	contraseña INT(8) NULL,
    celular VARCHAR(50) NULL,
    dob DATE NULL);
    
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("lucky", "Pedro", "Perez");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("malopez", "Maria", "Lopez");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("diva", "Ana", "Diaz");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("dreamer", "Luis", "Rojas");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("ninja", "Andres", "Cruz");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("neon", "Nelson", "Ruiz");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("rose", "Claudia", "Mendez");
INSERT INTO cliente(Alias, Nombre, apellidos) VALUES ("green", "Jorge", "Rodriguez");