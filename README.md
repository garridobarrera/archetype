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
+ 

•	Paso 1. Descargar el archetype de GITHUB  (es necesario tener correctamente configurado el proxy de la Oficina en git, “git config --global http.proxy http://HOST:PORT”).

$ git clone https://github.com/garridobarrera/archetype.git                   

          


•	Paso 2. Instalar el archetype en nuestro repositorio local de maven.

$ mvn install

                              
                              

•	Paso 3. Construir nuestro nuevo proyecto a partir del archetype
                
                     $ mvn archetype:generate -DarchetypeGroupId=com.everis.arquitectura -DarchetypeArtifactId=esqueleto-archetype -DarchetypeVersion=1.0

                     
•	Paso 4. El proyecto ya está creado, ahora solo queda prepararlo para poder abrirlo con eclipse:

$ mvn eclipse:eclipse

 


•	Paso 5. LISTO ¡!, ya podemos importar el proyecto en eclipse, y arrancarlo en nuestro tomcat 7 o jboss 7 (funciona en ambos).

