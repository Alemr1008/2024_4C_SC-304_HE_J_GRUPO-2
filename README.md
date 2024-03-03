# 2024_4C_SC-304_HE_J_GRUPO-2
El siguiente Proyecto consiste en el desarrollo de una plataforma de red social para compartir comentarios  en texto entre amigos con una relación directa.

## Plan de Proyecto:

## José Manuel Porras Morera:
-Creacion del Diagrama de clase. (Completado)
-Desarrollo de la clase Main. (Completado)
-Desarrollo de la clase MenuPrincipal. (Completado)
-Desarrollo de la clase AdministracionUsuarios. (En proceso)
-Desarrollo de Nodos, Pilas y Arboles Binarios. (Sin iniciar)

## Alejandro Montero Rodriguez:
-Creacion del GitHub. (Completado)
-Desarrollo de la clase VisualizacionMensajes. (En proceso)
-Encargado del Github especificamente el agregado de codigo. (Avance 1 Completado.)

## Devin Josue Gonzalez Ovando:
-Desarrollo de la clase CreacionMensajesRespuestas. (En proceso)
-Desarrollo de la actualizacion del read.me. (Sin iniciar) 

## Tareas:
-Creacion del Diagrama de clase. (Completado)
-Desarrollo de la clase Main. (Completado)
-Desarrollo de la clase MenuPrincipal. (Completado)
-Desarrollo de la clase AdministracionUsuarios. (En proceso)
-Desarrollo de Nodos, Pilas y Arboles Binarios. (Sin iniciar)
-Desarrollo de la clase VisualizacionMensajes. (En proceso)
-Desarrollo de la clase CreacionMensajesRespuestas. (En proceso)

## 1.0 MainClass
  -1.1 MenuPrincipal.mostrar() Para llamar al menu principal encargado de las opciones que tendra disponibles la clase.

## 2.0 MenuPrincipal
  -2.1 Atributo de la clase: int  seleccion. Guardara la opcion que quiere utilizar el usuario en el menu.
  -2.2 Public static void mostrar() 
  -2.3 Pwitch(seleccion)
  -2.4 Public abrirAdministracionUsuarios()
  -2.5 Public abrirCreacionMensajes()
  -2.6 Public abrirVisualizacionMensajes()
  -2.7 Public salir()

## 3.0 AdministracionUsuario
-3.1 Private String name
-3.2 Private String email
-3.3 Private String date
-3.4 getName()
-3.5 setname()
-3.6 getemail()
-3.7 setemail()
-3.8 setDate()
-3.9 getDate()
-3.10 public agregarUsuario()
-3.11 public modificarUsuario()
-3.12 public eliminarUsuario()
-3.13 public validarUsuario()
-3.14 public existenciaUsuario()
-3.15 public staticvoid muestraBienvenida()

## 4.0 VisualizacionMensajes
-4.1 int elegir()
-4.2 public elegirusuario()
-4.3 public contruccionfeed()
-4.4 public eliminaCola()
-4.5 public static void muestraBienvenida()

## 5.0 CreacionMensajesRespuestas
-5.1 private String Message()
-5.2 getMessage()
-5.3 setMessage()
-5.4 public creaMensaje()
-5.5 public reciberRespuesta()
-5.6 public staticvoid muestraBivenvenida()
-5.7 public boolean validarcontenido(String Message)


## 6.0 ListaAdyacente
-6.1 private Nodo cabeza()
-6.2 Public static void darfollow(administracionUsuario p)

## 7.0 ListaDobleCircular
-7.1 private Nodo cabeza()
-7.2 private Nodo ultimo()
-7.3 insertar(administracionUsuario p)

## 8.0 Nodo
-8.1 private administracionUsuario dato()
-8.2 private Nodo siguiente()
-8.3 administracionusuario gatDato()
-8.4 setDato(administracionUsuario administracionUsuario)
-8.5 Nodo getSiguiente()
-8.6 setSiguente(Siguiente siguiente)
-8.7 Nodo(administracionUsuario administracionUsuario)
-8.8 String toString()

## 9.0 ListaSimple
-9.1 private Nodo cabeza()_
-9.2 insertar(administracionUsuario p)
## Diseno de la aplicacion (Beta)

![image](https://github.com/Alemr1008/2024_4C_SC-304_HE_J_GRUPO-2/assets/91296126/b6128cd4-ca60-47f9-b418-97cf2fdd7f51)

Librerías Utilizadas:
-javax.swing.JOptionPane

Posibles Librerías a Utilizar:
- Java.util.DATE
