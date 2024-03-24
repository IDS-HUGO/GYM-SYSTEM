import java.util.Scanner;

public class Usuario {

    protected String user;
    protected String pass;

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    public void iniciarSesion(){
        Scanner leer = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Administrador admin = new Administrador();

        do{

            
        System.out.println("--- Bienvenido ---");
        System.out.print("Ingrese su usuario: ");
        this.user = leer.nextLine();
        System.out.print("Ingrese su contraseña: ");
        this.pass = leer.nextLine();

        

        }while(count != 3);
        

    }


}