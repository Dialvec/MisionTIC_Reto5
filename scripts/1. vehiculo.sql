CREATE SCHEMA datos;
USE datos;
CREATE TABLE vehiculo (
	fabricante VARCHAR(50) UNIQUE PRIMARY KEY,
    precio INT UNIQUE NOT NULL);
    
INSERT INTO vehiculo (fabricante, precio) VALUES ("Cannondale", 1200000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Trek", 1450000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Yeti", 2000000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Fuji", 950000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Bmc", 1950000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Starker", 4200000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Lucky Lion", 5600000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Be Electric", 4600000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Aima", 8000000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Mec de Colombia", 5900000);
INSERT INTO vehiculo (fabricante, precio) VALUES ("Atom Electric", 4500000);