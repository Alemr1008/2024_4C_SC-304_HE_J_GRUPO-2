
package pkg2024_4c_sc.pkg304_he_j_grupo.pkg2;
import javax.swing.JOptionPane;

public class MenuPrincipal {
    //Este metodo guradara un en si un switch que permitira entrar al modulo que
    //sea seleccionado con el numero que esta asociado cada uno y uno para salir.
    public static void mostar() {
        //Aqui por una ventana emergente se muestran las opociones disponibles para el menu
        JOptionPane.showMessageDialog(null,"0. Administracion de Usuarios. "
                + "\n1. Creacion de Mensajes y Respuestas.\n2. Visualizacion de Mensajes. "
                + "\n3. Salir.");
        
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Digite el numero que corresponde su opcion"));//
        
        //Ya aqui con el switch con el numero de los que se muestran en una 
        //ventana emergente anteriormente llama al modulo correspondiente.
        switch (seleccion) {
            case 0:
                AdministracionUsuarios.muestraBienvenida();
                break;
            case 1: 
                VisualizacionMensajes.muestraBienvenida();
                break;
            case 2: 
                CreacionMensajesRespuestas.muestraBienvenida();
                break;
            case 3: 
                System.exit(0);//Seleccion para salir y terminar el programa.
                break;
            default:
                //Esto es para una seleccion que sea invalida o incorrecta.
                JOptionPane.showMessageDialog(null, "Seleccion invalida, error en el sistema");
        }//Fin del switch.
    }//Fin del metodo mostrar
    
}//Fin de la clase MenuPrincipal.
