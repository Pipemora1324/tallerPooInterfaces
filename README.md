# 🚀 Taller POO - Herencia + Interfaces

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)
![POO](https://img.shields.io/badge/POO-Programación%20Orientada%20a%20Objetos-blue?style=for-the-badge)

---

## 📚 Descripción

Este proyecto implementa un modelo de **Programación Orientada a Objetos (POO)** en Java, aplicando:

* 🔹 Herencia
* 🔹 Interfaces
* 🔹 Encapsulamiento
* 🔹 Abstracción

Simula un sistema universitario donde diferentes tipos de usuarios interactúan con roles específicos.

---

## 🧠 Estructura del Proyecto

### 👤 Clase base

* **Persona**

  * nombre : String
  * correo : String

---

### 🎓 Clases derivadas

* **Estudiante**

  * codigo : String

* **Profesor**

  * especialidad : String

* **Administrativo**

  * area : String

---

## 🔌 Interfaces implementadas

* **Autenticable**

  * login(usuario, password)

* **Notificable**

  * enviarNotificacion(mensaje)

* **Evaluador**

  * evaluar(estudiante, nota)

* **Aprobador**

  * aprobarSolicitud(codigoSolicitud)

---

## ⚙️ Tecnologías utilizadas

* ☕ Java
* 💻 Programación Orientada a Objetos
* 🧩 UML (Diseño de clases)

---

## ▶️ Cómo ejecutar el proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/Pipemora1324/tallerPooInterfaces.git
```

2. Entrar a la carpeta:

```bash
cd TallerPoo
```

3. Compilar:

```bash
javac *.java
```

4. Ejecutar:

```bash
java Main
```

---

## 📌 Objetivo del proyecto

Aplicar los conceptos de herencia e interfaces para modelar un sistema modular, reutilizable y escalable.

---

## 👨‍💻 Autor

* **Juan Felipe Mora**
<img width="1847" height="901" alt="Captura de pantalla 2026-04-09 191555" src="https://github.com/user-attachments/assets/b8e85878-e593-47c6-aee1-943d57984007" />

