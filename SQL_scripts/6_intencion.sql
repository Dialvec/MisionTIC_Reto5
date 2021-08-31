USE datos;
CREATE TABLE intencion (
	id_intencion INT AUTO_INCREMENT PRIMARY KEY,
	alias_cliente_fk VARCHAR(20) NOT NULL,
    fabricante_fk VARCHAR(50) NOT NULL,
    fechahora TIMESTAMP NOT NULL,
    FOREIGN KEY (fabricante_fk) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (alias_cliente_fk) REFERENCES cliente(alias));
    
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("lucky","Cannondale", '2017-10-25 20:00:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("lucky", "Trek", '2019-03-15 18:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("lucky", "Starker", '2019-05-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("malopez", "Cannondale", '2018-05-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("malopez", "Starker", '2020-01-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("diva", "Yeti", '2019-05-20 20:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("diva",  "Fuji", '2018-06-22 21:30:00');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("diva", "Lucky Lion", '2020-03-17 15:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("dreamer", "Lucky Lion", '2020-03-17 15:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("dreamer", "Be Electric", '2020-04-10 18:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("ninja", "Aima", '2020-02-17 20:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("ninja", "Starker", '2020-02-20 16:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("ninja", "Mec de Colombia", '2020-03-27 18:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("rose", "Atom Electric", '2020-03-20 21:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("green", "Yeti", '2020-01-10 17:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("green", "Trek", '2020-02-15 20:30:20');
INSERT INTO intencion (alias_cliente_fk, fabricante, fechahora) VALUES ("green", "Bmc", '2020-03-17 18:30:20');