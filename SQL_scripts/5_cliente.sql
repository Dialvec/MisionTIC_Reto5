CREATE TABLE cliente (
	alias VARCHAR(20) NOT NULL PRIMARY KEY,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    email VARCHAR(50) DEFAULT '',
	contrasena INT(8) DEFAULT 0,
    celular VARCHAR(20)DEFAULT NULL,
    dob DATE DEFAULT NULL
    );
    
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("lucky", "Pedro", "Perez");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("malopez", "Maria", "Lopez");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("diva", "Ana", "Diaz");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("dreamer", "Luis", "Rojas");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("ninja", "Andres", "Cruz");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("neon", "Nelson", "Ruiz");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("rose", "Claudia", "Mendez");
INSERT INTO cliente(alias, nombres, apellidos) VALUES ("green", "Jorge", "Rodriguez");

USE bikeshop;
SELECT * FROM moto_electrica;