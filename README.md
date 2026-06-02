# 🎬 Proyecto Cine

## 📖 Descripción

Aplicación web para gestión de cine con backend desarrollado en Spring Boot y frontend desarrollado con HTML, CSS y JavaScript.

Los datos son consumidos desde una API REST desarrollada en Spring Boot.

---

## 🚀 Tecnologías utilizadas

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Gradle

### Frontend
- HTML5
- CSS3
- JavaScript

### Herramientas
- IntelliJ IDEA
- Visual Studio Code
- Postman

---

## 🗂️ Estructura del proyecto

```text
ProyectoCine/
├── frontend/            # Frontend HTML, CSS y JavaScript
├── ProyectoFinalCine/   # Backend Spring Boot
└── docs/                # Documentación JavaDoc
```

```text
ProyectoFinalCine/       # Backend Spring Boot
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/ProyectoFinalCine/
│       │       ├── config/
│       │       ├── controllers/
│       │       ├── entities/
│       │       ├── repositories/
│       │       ├── services/
│       │       └── ProyectoFinalCineApplication.java
│       └── resources/
│           └── application.properties
```
---

## 📄 Documentación (JavaDoc)

La documentación técnica del proyecto fue generada utilizando JavaDoc.

Se encuentra disponible dentro de la carpeta: `/docs`

https://davidcopa42.github.io/proyecto-cine/

---

## ⚙️ Cómo ejecutar el proyecto

### Backend

1. Abrir la carpeta `ProyectoFinalCine` en IntelliJ IDEA.
2. Ejecutar la clase: `ProyectoFinalCineApplication`

---

### Frontend

1. Abrir la carpeta `frontend` en Visual Studio Code.
2. Instalar la extensión **Live Server**.
3. Abrir el archivo: `index.html`
4. Seleccionar: `Open with Live Server`

> Importante: el backend debe estar ejecutándose previamente para que el frontend pueda consumir la API.

---

## 🔌 Endpoints de la API

Base URL: `http://localhost:9000/api/v1/` 

Endpoints implementados:
```text
/cines
/clientes
/empleados
/peliculas
/ventas
```

---
