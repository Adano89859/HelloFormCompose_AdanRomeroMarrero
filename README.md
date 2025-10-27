# HelloFormCompose

Una aplicación Android simple construida con Jetpack Compose que muestra un formulario de saludo interactivo.

## 📱 Descripción

Esta aplicación demuestra los conceptos básicos de Jetpack Compose mediante un formulario simple donde los usuarios pueden:
- Introducir su nombre en un campo de texto
- Visualizar un contador de caracteres en tiempo real
- Recibir un saludo personalizado al pulsar el botón
- Experimentar una interfaz reactiva y moderna

## ✨ Características

- **🖋️ Campo de texto** con etiqueta flotante
- **🔢 Contador de caracteres** (máximo 20 caracteres)
- **🎯 Botón inteligente** que se deshabilita cuando no hay texto
- **⌨️ Ocultamiento automático** del teclado al realizar el saludo
- **🔄 Persistencia de estado** que sobrevive a rotaciones de pantalla
- **👋 Saludo personalizado** con el nombre del usuario

## 🛠️ Tecnologías Utilizadas

- **Kotlin** - Lenguaje de programación
- **Jetpack Compose** - Framework de UI declarativa
- **Material Design 3** - Sistema de diseño
- **Android Studio** - IDE de desarrollo

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos
- Android Studio Arctic Fox o superior
- Android SDK API 21 o superior
- Dispositivo o emulador Android

### Pasos de Instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/tu-usuario/HelloFormCompose_AdanRomeroMarrero.git
Abrir en Android Studio

Abre Android Studio

Selecciona "Open an existing project"

Navega hasta la carpeta del proyecto clonado

Sincronizar el proyecto

Espera a que Android Studio sincronice las dependencias

Asegúrate de tener el SDK y herramientas necesarias

Ejecutar la aplicación

Conecta un dispositivo Android o inicia un emulador

Presiona el botón "Run" (▶️) o Shift + F10

##📸 Capturas de Pantalla
Pantalla Inicial	Con Texto Ingresado	Saludo Mostrado
<img width="3095" height="832" alt="image" src="https://github.com/user-attachments/assets/c7f663ce-70dd-49e8-9a27-bd75624e89cc" />
	<img width="3122" height="488" alt="image" src="https://github.com/user-attachments/assets/6592433d-36cd-4abc-9b8d-010ab52ef95c" />
	<img width="3115" height="598" alt="image" src="https://github.com/user-attachments/assets/e07bf7c1-d948-465c-a39b-18573119dda2" />

##🎯 Funcionamiento
Al abrir la aplicación: Verás un campo de texto vacío con la etiqueta "Introduce tu nombre"

Al empezar a escribir:

El botón "Saludar" se habilita cuando hay texto

El contador muestra "Caracteres actuales: X/20"

Al pulsar "Saludar":

El teclado se oculta automáticamente

Aparece el mensaje "Hola, [nombre]" debajo del botón

Si el campo está vacío, muestra "Introduce tu nombre"

Al rotar el dispositivo: El estado se mantiene gracias a rememberSaveable

##📋 Requisitos del Sistema
Android API: Nivel 21 (Android 5.0) o superior

Kotlin: Versión 1.9.0 o superior

Gradle: Versión 8.0 o superior

##👨‍💻 Autor
Adán Romero Marrero
