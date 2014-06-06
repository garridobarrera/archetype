archetype
=========
+ SCRIPT PARA POSTGRESQL

INSERT INTO bb_usuario(
            id, apellidos, emailpersonal, emailprofesional, nombre, "password", 
            username)
    VALUES ('1', 'admin', 'admin@everis.com', 'admin@everis.com', 'Administrador', '21232f297a57a5a743894ae4a801fc3', 'admin@everis.com');

INSERT INTO BB_USUARIO_ROL (usuario, rol)
VALUES
    ('1','ROLE_USER');
INSERT INTO BB_USUARIO_ROL (usuario, rol)
VALUES
    ('1','ROLE_ADMIN');
	
	
+ El usuario administrador de acceso es (admin@everis.com / admin)
