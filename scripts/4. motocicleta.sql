USE datos;
CREATE TABLE moto_electrica (
	id_moto INT AUTO_INCREMENT PRIMARY KEY,
	fabricante VARCHAR(50) UNIQUE NOT NULL,
    precio INT UNIQUE NULL,
    proveedor_motor VARCHAR(50) NOT NULL,
    autonomia VARCHAR(50) NOT NULL,
    FOREIGN KEY (fabricante) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (precio) REFERENCES vehiculo(precio),
    FOREIGN KEY (proveedor_motor) REFERENCES proveedor_motor(nombre));
    
INSERT INTO moto_electrica (fabricante, Precio, Autonomia, proveedor_motor) VALUES ("Starker", 4200000, "18 horas", "Auteco");
INSERT INTO moto_electrica (fabricante, Precio, Autonomia, proveedor_motor) VALUES ("Lucky Lion", 5600000, "14 horas", "Hitachi");
INSERT INTO moto_electrica (fabricante, Precio, Autonomia, proveedor_motor) VALUES ("Be Electric", 4600000, "26 horas", "Auteco");
INSERT INTO moto_electrica (fabricante, Precio, Autonomia, proveedor_motor) VALUES ("Aima", 8000000, "36 horas", "Bosch");
INSERT INTO moto_electrica (fabricante, Precio, Autonomia, proveedor_motor) VALUES ("Mec de Colombia", 5900000, "20 horas", "Teco");
INSERT INTO moto_electrica (fabricante, Precio, Autonomia, proveedor_motor) VALUES ("Atom Electric", 4500000, "12 horas", "General Electric");