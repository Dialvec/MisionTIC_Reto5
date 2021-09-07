CREATE TABLE bicicleta (
	id_bicicleta INT AUTO_INCREMENT PRIMARY KEY,
	fabricante_fk VARCHAR(50) UNIQUE NULL,
    precio INT UNIQUE NULL,
    anio_fabrica INT NOT NULL,
    FOREIGN KEY (fabricante_fk) REFERENCES vehiculo(fabricante));
    
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Cannondale", 1200000, 2020);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Trek", 1450000, 2019);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Yeti", 2000000, 2020);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Fuji", 950000, 2021);
INSERT INTO Bicicleta (fabricante_fk, precio, anio_fabrica) VALUES ("Bmc", 1950000, 2018);