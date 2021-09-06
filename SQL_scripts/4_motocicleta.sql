USE datos;
CREATE TABLE moto_electrica (
	id_moto INT AUTO_INCREMENT PRIMARY KEY,
	fabricante_fk VARCHAR(50) UNIQUE NOT NULL,
    precio INT,
    proveedor_motor VARCHAR(50) NOT NULL,
    autonomia INT,
    FOREIGN KEY (fabricante) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (proveedor_motor) REFERENCES proveedor_motor(nombre));
    
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor) VALUES ("Starker", 4200000, 18, "Auteco");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor) VALUES ("Lucky Lion", 5600000, 14, "Hitachi");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor) VALUES ("Be Electric",  4600000, 26, "Auteco");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor) VALUES ("Aima", 8000000, 36, "Bosch");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor) VALUES ("Mec de Colombia", 5900000, 20, "Teco");
INSERT INTO moto_electrica (fabricante_fk, precio, autonomia, proveedor_motor) VALUES ("Atom Electric", 4500000, 12, "General Electric");