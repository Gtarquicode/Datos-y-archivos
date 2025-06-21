# Datos-y-archivos

# 📚 Proyecto: Persistencia de Información con Java (POO)

Este proyecto demuestra el uso de **interfaces**, **herencia**, **serialización** y **persistencia de datos** en Java.



1) 📌 Contenido del proyecto

Se implementa una interfaz `Deberes` que define métodos para **guardar** y **cargar objetos** desde archivos. Esta interfaz es implementada por una clase base `Persona`, que luego es extendida por las clases `Estudiante` y `Profesor`.

---

2) 🔧 Estructura de clases

Archivos/
├── Deberes.java // Interfaz con métodos guardar y cargar
├── Persona.java // Clase abstracta que implementa Deberes y Serializable
├── Estudiante.java // Subclase con atributos como matrícula y carrera
├── Profesor.java // Subclase con atributos como departamento y salario
└── Main.java // Clase principal que permite registrar y cargar objetos


---

## 💾 ¿Qué hace el programa?

1. Solicita al usuario ingresar por teclado:
   - Datos de un **estudiante** (nombre, edad, matrícula, carrera)
   - Datos de un **profesor** (nombre, edad, departamento, salario)

2. Guarda cada uno en un archivo `.ser` mediante **serialización**.

3. Carga los objetos desde los archivos y los muestra en consola.
