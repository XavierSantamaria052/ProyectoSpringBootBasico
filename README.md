# Proyecto Spring Boot Básico — Aplicación Backend Java

Proyecto básico desarrollado con Java y Spring Boot para practicar la creación de aplicaciones backend utilizando arquitectura en capas y servicios REST.

---

# Tabla de contenidos

- Arquitectura del proyecto
- Tecnologías utilizadas
- Características
- Estructura del proyecto
- Configuración
- Ejecución
- Endpoints REST
- Flujo de la aplicación
- Pruebas

---

# Arquitectura del proyecto

La aplicación sigue una arquitectura backend basada en capas:

```text
┌──────────────────────────────┐
│         Controllers          │ ← Endpoints REST
├──────────────────────────────┤
│          Services            │ ← Lógica de negocio
├──────────────────────────────┤
│        Repositories          │ ← Acceso a datos
├──────────────────────────────┤
│          Entities            │ ← Modelo de dominio
├──────────────────────────────┤
│         Spring Boot          │ ← Framework backend
└──────────────────────────────┘
```

---

# Tecnologías utilizadas

| Tecnología | Uso |
|------------|-----|
| Java 17 | Lenguaje principal |
| Spring Boot | Framework backend |
| Maven | Gestión de dependencias |
| Spring Web | API REST |
| Jackson | Serialización JSON |
| Git | Control de versiones |

---

# Características

- API REST básica
- Arquitectura en capas
- Endpoints HTTP
- Serialización JSON
- Integración con Spring Boot
- Configuración centralizada

---

# Estructura del proyecto

```text
ProyectoSpringBootBasico/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/com/example/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── model/
│   │   │   └── ProyectoSpringBootBasicoApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   └── test/
│       └── java/
└── target/
```

---

# Configuración

Editar:

```text
src/main/resources/application.properties
```

Ejemplo:

```properties
server.port=8080
spring.application.name=ProyectoSpringBootBasico
```

---

# Ejecución

## Compilar proyecto

```bash
mvn clean install
```

## Ejecutar aplicación

```bash
mvn spring-boot:run
```

---

# Endpoints REST

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | / | Página principal |
| GET | /api | Obtener recursos |
| POST | /api | Crear recurso |
| PUT | /api/{id} | Actualizar recurso |
| DELETE | /api/{id} | Eliminar recurso |

---

# Flujo de la aplicación

```text
Cliente HTTP
      ↓
Controller REST
      ↓
Service Layer
      ↓
Repository Layer
      ↓
Modelo / Entidades
```

---

# Ejemplo JSON

```json
{
  "id": 1,
  "name": "Spring Boot",
  "status": "active"
}
```

---

# Pruebas

## Ejecutar pruebas

```bash
mvn test
```

---

# Mejoras futuras

- Integración con MySQL
- Seguridad con Spring Security
- JWT Authentication
- Dockerización
- Swagger/OpenAPI
- Testing avanzado

---

# Autor

Xavier Santamaria
