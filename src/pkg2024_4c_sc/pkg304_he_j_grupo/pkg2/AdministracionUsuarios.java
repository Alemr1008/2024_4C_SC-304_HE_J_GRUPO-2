
package pkg2024_4c_sc.pkg304_he_j_grupo.pkg2;
import javax.swing.JOptionPane;

public class AdministracionUsuarios {
    private String name;//Aqui se almacena el nombre del usuario.
    private String email;//Aqui se almacena el correo electronico el cual se validara que sea unico más adelante.
    private String date;//Aqui se almacena la fecha de registro.

    //Constructor de la clase.
    public AdministracionUsuarios(String name, String email, String date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }//Fin del constructor.
    
    //Metodos Getter y Setter de la clase.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    //Fin de los metodos Getter y Setter.
    
    //Breve bienvenida que muestra que modulo fue seleccionado.
    public static void muestraBienvenida() {
        JOptionPane.showMessageDialog(null, "Bienvenido al modulo de Administracion de Usuarios de Mementos");
    }//Fin del metodo muestraBienvenida.
    
}//Fin de la classe AdministracionUsuarios.
