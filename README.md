🇺🇸
# Project Title: ToDo Backend API with Spring Boot 3

![Spring Boot Logo](https://www.vectorlogo.zone/logos/springio/springio-ar21.svg)

## Project Description

This project is a backend developed with Spring Boot 3 that provides an API to manage ToDo tasks. The application integrates with Eureka for service management, Spring Cloud Gateway for API gateway, Spring Cloud Config for centralized configuration, RabbitMQ for asynchronous communication, MongoDB as the database, and Vault for secret management. Additionally, Keycloak is used for identity and access management.

## Key Features

- Task management (create, read, update, delete).
- Asynchronous communication using RabbitMQ.
- Centralized configuration with Spring Cloud Config.
- Service registration and discovery with Eureka.
- Secret management with Vault.
- Identity and access management with Keycloak.

## Keycloak Integration

The gateway can receive a JWT token for authentication. If an unauthenticated request is received, it redirects the request to the Keycloak login page. Token relay is used to transmit the authentication token to the microservices, ensuring secure communication and access control.

## Prerequisites

- Java Development Kit (JDK) 17 or higher.
- Spring Boot 3.
- Eureka Server for service management.
- Spring Cloud Gateway for API gateway.
- Spring Cloud Config for centralized configuration.
- RabbitMQ for asynchronous communication.
- MongoDB as the database.
- Vault for secret management.
- Keycloak for identity and access management.

## Installation

1. Clone the repository: `git clone git@github.com:EnriqueRS/todo-spring.git`
2. Navigate to the project directory: `cd todo-spring`
3. Start the Spring Boot application.

## Usage

- Run in this order:
  - Spring Cloud Config Server
  - Eureka Server
  - Gateway
  - ToDo Service
  - Main Service

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
🇪🇸
# Título del Proyecto: API Backend de Tareas (ToDo) con Spring Boot 3

![Logo de Spring Boot](https://www.vectorlogo.zone/logos/springio/springio-ar21.svg)

## Descripción del Proyecto

Este proyecto es un backend desarrollado con Spring Boot 3 que proporciona una API para gestionar tareas pendientes (ToDo). La aplicación se integra con Eureka para la gestión de servicios, Spring Cloud Gateway para la puerta de enlace de la API, Spring Cloud Config para la configuración centralizada, RabbitMQ para la comunicación asincrónica, MongoDB como la base de datos, y Vault para la gestión de secretos. Adicionalmente, se utiliza Keycloak para la gestión de identidad y acceso.

## Características Clave

- Gestión de tareas (crear, leer, actualizar, eliminar).
- Comunicación asincrónica utilizando RabbitMQ.
- Configuración centralizada con Spring Cloud Config.
- Registro y descubrimiento de servicios con Eureka.
- Gestión de secretos con Vault.
- Gestión de identidad y acceso con Keycloak.

## Integración con Keycloak

El gateway puede recibir un token JWT para la autenticación. Si se recibe una solicitud no autenticada, redirige la solicitud a la página de inicio de sesión de Keycloak. Se utiliza token relay para transmitir el token de autenticación a los microservicios, garantizando una comunicación y control de acceso seguros.

## Requisitos Previos

- Kit de Desarrollo de Java (JDK) 17 o superior.
- Spring Boot 3.
- Eureka Server para la gestión de servicios.
- Spring Cloud Gateway para la puerta de enlace de la API.
- Spring Cloud Config para la configuración centralizada.
- RabbitMQ para la comunicación asincrónica.
- MongoDB como la base de datos.
- Vault para la gestión de secretos.
- Keycloak para la gestión de identidad y acceso.

## Instalación

1. Clona el repositorio: `git clone git@github.com:EnriqueRS/todo-spring.git`
2. Navega hasta el directorio del proyecto: `cd todo-spring`
3. Inicia la aplicación Spring Boot.

## Uso

- Ejecuta en este orden:
  - Spring Cloud Config Server
  - Eureka Server
  - Gateway
  - ToDo Service
  - Main Service

## Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.
