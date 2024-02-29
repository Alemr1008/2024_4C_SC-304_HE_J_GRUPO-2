
package pkg2024_4c_sc.pkg304_he_j_grupo.pkg2;

import javax.swing.JOptionPane;

public class CreacionMensajesRespuestas {
    //Atributo de la clase.
    private String Message;//Aqui se guarda el dato de el mensaje

    //Constructor de la clase.
    public CreacionMensajesRespuestas(String Message) {
        this.Message = Message;
    }//Fin del constructor.
    
    //Metodos Set y Get de la clase
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    //Fin de los metodos Get y Set.
    
    //Breve bienvenida que muestra que modulo fue seleccionado.
    public static void muestraBienvenida() {
        JOptionPane.showMessageDialog(null, "Bienvenido al modulo de Creacion de Mensajes de Mementos");
    }//Fin del metodo muestraBienvenida.
    
}//Fin de la clase CreacionMensajesRespuestas.
