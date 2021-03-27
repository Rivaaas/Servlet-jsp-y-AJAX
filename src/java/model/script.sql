CREATE DATABASE estudio;                



 USE estudio;

--drop database estudio;
CREATE TABLE persona(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    edad int,
    correo VARCHAR(100)
);


INSERT INTO persona VALUES (NULL,'Victor',22,'aaa');
INSERT INTO persona VALUES (NULL,'erik',22,'aaa');
INSERT INTO persona VALUES (NULL,'Laleshka',22,'aaa');
INSERT INTO persona VALUES (NULL,'Martin',22,'aaa');
INSERT INTO persona VALUES (NULL,'Ashley',0,'aaa');

SELECT * FROM persona;
