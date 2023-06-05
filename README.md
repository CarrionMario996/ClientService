# ClientService
Dependencia: Tener una base de datos mysql y ejecutar la siguiente setencia:

create database db_clients;

Tener arriba el siguiente servicio:

order-service
spring-gateway
Ejecutar comando para clonar repositorio desde consola git

git clone https://github.com/CarrionMario996/ClientService.git

Levantar programa desde su IDE de su preferencia

2.1 Si posee el IDE Intellij seguir siguientes pasos:

2.1.1 Seleccionar opcion file

2.1.2 Seleccionar opcion Open y buscar la ruta donde se clono el proyecto

2.1.3 Una vez encontrado seleccionar el pom.xml y esperar que el IDE termine de descargar las dependencias.

2.1.4 Buscar la clase main(ProductServiceApplication) y ejecutarla

3.Para ejecutar los servicios seguir los siguientes pasos:

3.1 Crear usuario localhost:9091/api/v1.0.0/auth/create

3.2 Hacer login para obtener token localhost:9091/api/v1.0.0/auth/login

Servicios desarrollados 4.1 localhost:9090/api/v1.0.0/client/all

4.1.2 En caso ocupar postman ingresar token en authorization y el tipo de token es Bearer Token

