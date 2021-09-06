USE datos;
CREATE TABLE bicicleta (
	id_bicicleta INT AUTO_INCREMENT PRIMARY KEY,
	fabricante VARCHAR(50) UNIQUE NULL,
    precio INT UNIQUE NULL,
    Anio_fabrica INT NOT NULL,
    FOREIGN KEY (precio) REFERENCES vehiculo(precio),
    FOREIGN KEY (fabricante) REFERENCES vehiculo(fabricante));
    
INSERT INTO Bicicleta (Fabricante, Precio, Anio_fabrica) VALUES ("Cannondale", 1200000, 2020);
INSERT INTO Bicicleta (Fabricante, Precio, Anio_fabrica) VALUES ("Trek", 1450000, 2019);
INSERT INTO Bicicleta (Fabricante, Precio, Anio_fabrica) VALUES ("Yeti", 2000000, 2020);
INSERT INTO Bicicleta (Fabricante, Precio, Anio_fabrica) VALUES ("Fuji", 950000, 2021);
INSERT INTO Bicicleta (Fabricante, Precio, Anio_fabrica) VALUES ("Bmc", 1950000, 2018);