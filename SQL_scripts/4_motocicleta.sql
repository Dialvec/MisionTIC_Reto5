USE datos;
CREATE TABLE moto_electrica (
	id_moto INT AUTO_INCREMENT PRIMARY KEY,
	fabricante_fk VARCHAR(50) UNIQUE NOT NULL,
    proveedor_motor VARCHAR(50) NOT NULL,
    autonomia INT NOT NULL,
    FOREIGN KEY (fabricante) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (proveedor_motor) REFERENCES proveedor_motor(nombre));
    
INSERT INTO moto_electrica (fabricante_fk, autonomia, proveedor_motor) VALUES ("Starker", 18, "Auteco");
INSERT INTO moto_electrica (fabricante_fk, autonomia, proveedor_motor) VALUES ("Lucky Lion", 14, "Hitachi");
INSERT INTO moto_electrica (fabricante_fk, autonomia, proveedor_motor) VALUES ("Be Electric", 26, "Auteco");
INSERT INTO moto_electrica (fabricante_fk, autonomia, proveedor_motor) VALUES ("Aima", 36, "Bosch");
INSERT INTO moto_electrica (fabricante_fk, autonomia, proveedor_motor) VALUES ("Mec de Colombia", 20, "Teco");
INSERT INTO moto_electrica (fabricante_fk, autonomia, proveedor_motor) VALUES ("Atom Electric", 12, "General Electric");