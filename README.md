# Beauty Store API

## Evidencia SENA

**GA7-220501096-AA3-EV01 – Codificación de módulos del software Stand alone, web y móvil de acuerdo al proyecto a desarrollar.**

## Descripción

Beauty Store es una aplicación web desarrollada con Java y Spring Boot para la gestión de productos de una tienda de belleza.

La aplicación integra un backend REST, una interfaz frontend y una base de datos MySQL. Permite consultar, crear, actualizar y eliminar productos, además de validar los datos ingresados.

## Tecnologías utilizadas

- Java 17
- Spring Boot 4.1.1
- Maven
- Spring Data JPA
- MySQL
- API REST
- HTML
- CSS
- JavaScript
- Bruno para pruebas

## Funcionalidades

- Listar productos.
- Consultar un producto por ID.
- Crear productos.
- Actualizar productos.
- Eliminar productos.
- Validar nombre obligatorio.
- Validar precio mayor que cero.
- Validar stock no negativo.
- Interfaz web para gestionar los productos.

## Estructura

```text
src/main/java/com/beautystore

├── DemoApplication.java
├── controller
│   └── ProductoController.java
├── model
│   └── Producto.java
├── repository
│   └── ProductoRepository.java
└── service
    └── ProductoService.java