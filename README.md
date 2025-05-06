# 🪪 Generador de Credenciales de Evento

### Estudiante(s):  
- Vicente Rodriguez - Gonzalo Maturana – Patrones de Diseño (IGR-00158-A06)

---

## 🎯 Objetivo del Proyecto

Este sistema permite emitir credenciales personalizadas para un evento, a partir de una plantilla clonable. Se aplican los patrones de diseño **Prototype** (para clonar credenciales) y **Singleton**.

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:
```bash
git clone https://github.com/vicenterodriguez2002/evaluacionpatronesdediseno
cd evaluacionpatronesdediseno
cd src
```

2. Compilar y ejecutar:
```bash
javac app\Principal.java model\*.java
java app.Principal
```

---

## 🧬 Patrón Prototype – Aplicación

- La clase `Credencial` implementa la interfaz `Cloneable`.
---
- Se utiliza el método `clone()` para duplicar una plantilla de credencial.
- Luego, la credencial clonada es personalizada con datos ingresados por el usuario.

```java
Credencial nuevaCredencial = plantillaCredencial.clone();
System.out.print("Ingrese nombre: ");
String nombre = scanner.nextLine();
System.out.print("Ingrese cargo: ");
String cargo = scanner.nextLine();
System.out.print("Ingrese RUT: ");
String rut = scanner.nextLine();
nuevaCredencial.personalizacionCredencial(nombre, cargo, rut);
gestor.agregar(nuevaCredencial);
```

---

## 🔒 Patrón Singleton – Aplicación

- La clase `GestorCredenciales` implementa el patrón **Singleton**, lo que garantiza que exista **una única instancia global** durante la ejecución del programa.
- El patrón contiene:
  - Un **atributo estático privado** que almacena la única instancia.
  - Un **constructor privado** para evitar instanciación externa.
  - Un método público `getInstancia()` para obtener el único objeto existente.

- Se accede al gestor global de credenciales mediante:

```java
GestorCredenciales gestor = GestorCredenciales.getInstancia();
```

---

## 🖥️ Menú por consola

```
--- MENÚ ---
1. Agregar nueva credencial
2. Ver credenciales generadas
3. Salir
```

---

## 📊 Diagrama de Clases (UML)

![Diagrama de Clases UML](https://viroca.cl/patrones/06052025/diagramadeclase.jpg)

---

## 📊 Caso de uso

![Caso de uso](https://viroca.cl/patrones/06052025/casodeuso2.png)

---

## 📸 Captura del sistema funcionando

![Programa funcionando](https://viroca.cl/patrones/06052025/PROGRAMAFUNCIONAL.png)
