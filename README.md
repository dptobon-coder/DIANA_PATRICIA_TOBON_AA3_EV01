# Beauty Store API

## Evidencia SENA

**GA7-220501096-AA3-EV01 – Codificación de módulos del software Stand alone, web y móvil de acuerdo al proyecto a desarrollar.**

## Descripción

Beauty Store API es una aplicación REST desarrollada con Java y Spring Boot para la gestión de productos de una tienda de belleza.

La aplicación permite realizar operaciones de consulta, creación, actualización y eliminación de productos, además de aplicar validaciones sobre los datos ingresados.

## Tecnologías utilizadas

* Java 17
* Spring Boot 4.1.1
* Maven
* Spring Data JPA
* MySQL
* API REST
* Bruno para pruebas

## Funcionalidades

* Listar productos.
* Consultar un producto por ID.
* Crear productos.
* Actualizar productos.
* Eliminar productos.
* Validar nombre obligatorio.
* Validar precio mayor que cero.
* Validar stock no negativo.

## Estructura

```text
src/main/java/com/beautystore
├── controller
│   └── ProductoController.java
├── model
│   └── Producto.java
├── repository
│   └── ProductoRepository.java
└── service
    └── ProductoService.java
```

## Base de datos

Base de datos utilizada:

```text
beauty_store
```

Tabla principal:

```text
productos
```

## Ejecución

Desde la carpeta del proyecto:

```text
.\mvnw.cmd spring-boot:run
```

La aplicación utiliza el puerto:

```text
8081
```

## Endpoints

```text
GET    /api/productos
GET    /api/productos/{id}
POST   /api/productos
PUT    /api/productos/{id}
DELETE /api/productos/{id}
```

## Validaciones

El sistema valida:

* El nombre del producto es obligatorio.
* El precio debe ser mayor que 0.
* El stock no puede ser negativo.

## Pruebas

Las pruebas realizadas mediante Bruno demostraron respuestas:

* **200 OK** para operaciones exitosas.
* **204 No Content** para eliminación exitosa.
* **404 Not Found** al consultar un producto eliminado.
* **400 Bad Request** para datos que no cumplen las validaciones.

## Resultado

El proyecto fue compilado correctamente mediante Maven obteniendo:

**BUILD SUCCESS**

La API REST fue ejecutada y probada correctamente con conexión a MySQL.
