USE datos;
CREATE TABLE intencion (
	id_intencion INT AUTO_INCREMENT PRIMARY KEY,
	alias_cliente VARCHAR(20) NOT NULL,
    fabricante VARCHAR(50) NOT NULL,
    datetime TIMESTAMP NOT NULL,
    FOREIGN KEY (fabricante) REFERENCES vehiculo(fabricante),
    FOREIGN KEY (alias_cliente) REFERENCES cliente(alias));
    
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("lucky","Cannondale", '2017-10-25 20:00:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("lucky", "Trek", '2019-03-15 18:30:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("lucky", "Starker", '2019-05-20 20:30:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("malopez", "Cannondale", '2018-05-20 20:30:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("malopez", "Starker", '2020-01-20 20:30:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("diva", "Yeti", '2019-05-20 20:30:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("diva",  "Fuji", '2018-06-22 21:30:00');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("diva", "Lucky Lion", '2020-03-17 15:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("dreamer", "Lucky Lion", '2020-03-17 15:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("dreamer", "Be Electric", '2020-04-10 18:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("ninja", "Aima", '2020-02-17 20:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("ninja", "Starker", '2020-02-20 16:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("ninja", "Mec de Colombia", '2020-03-27 18:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("rose", "Atom Electric", '2020-03-20 21:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("green", "Yeti", '2020-01-10 17:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("green", "Trek", '2020-02-15 20:30:20');
INSERT INTO intencion (alias_cliente, Fabricante, datetime) VALUES ("green", "Bmc", '2020-03-17 18:30:20');