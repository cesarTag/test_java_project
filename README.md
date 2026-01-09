# Spring Boot Java 8 Demo

Proyecto de demostración con Spring Boot 2.7 y Java 8 para practicar migración a Java 21.

## Características

- Spring Boot 2.7.18
- Java 8
- REST API con CRUD de usuarios
- Base de datos H2 en memoria
- Código con patrones típicos de Java 8 para migrar

## Requisitos

- JDK 8
- Maven 3.6+

## Ejecutar el proyecto

```bash
mvn spring-boot:run
```

O compilar y ejecutar:

```bash
mvn clean package
java -jar target/spring-boot-java8-demo-1.0.0.jar
```

## Endpoints disponibles

- `GET /api/usuarios` - Obtener todos los usuarios
- `GET /api/usuarios/{id}` - Obtener usuario por ID
- `POST /api/usuarios` - Crear usuario
- `PUT /api/usuarios/{id}` - Actualizar usuario
- `DELETE /api/usuarios/{id}` - Eliminar usuario
- `GET /api/usuarios/mayores` - Obtener usuarios mayores de 18 años

## Ejemplo de petición

```bash
# Crear usuario
curl -X POST http://localhost:8080/api/usuarios \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Juan","email":"juan@example.com","edad":25}'

# Obtener todos
curl http://localhost:8080/api/usuarios
```

## Consola H2

Acceder a: http://localhost:8080/h2-console

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (dejar vacío)

## Migración a Java 21

Este proyecto contiene código típico de Java 8 que puede mejorarse:

- Uso de `Date` en lugar de `java.time`
- Uso de `@Autowired` en campos
- Manejo verboso de `Optional`
- Loops tradicionales en lugar de Streams

Usa OpenRewrite para migrar automáticamente.
