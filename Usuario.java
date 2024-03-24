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

        String rol = null;

        String userG = gerente.getUser(), userA = admin.getUser();
        String passG = gerente.getPass(), passA = admin.getPass();
        String rolG = gerente.getRol(), rolA = admin.getRol();

        
            
        System.out.println("--- Bienvenido ---");
        System.out.println("escriba su Rol: \nGerente / Admin");
        rol = leer.nextLine();
        System.out.print("Ingrese su usuario: ");
        this.user = leer.nextLine();
        System.out.print("Ingrese su contraseña: ");
        this.pass = leer.nextLine();

        if (rol.equals(rolG)) {
            if(!userG.equals(this.user) && !passG.equals(this.pass)){
                System.out.println("Usuario incorrecto y contraseña incorrectos");
            }else if(!userG.equals(this.user)){
                System.out.println("Usuario incorrecto");
            }else if(!passG.equals(this.pass)){
                System.out.println("Contraseña incorrecta");
            }
        }else if (rol.equals(rolA)) {
            if(!userA.equals(this.user) && !passA.equals(this.pass)){
                System.out.println("Usuario incorrecto y contraseña incorrectos");
            }else if(!userA.equals(this.user)){
                System.out.println("Usuario incorrecto");
            }else if(!passA.equals(this.pass)){
                System.out.println("Contraseña incorrecta");
            }
        }

        if (rol.equals(rolG)) {
            gerente.verMenu();
        }else if (rol.equals(rolA)) {
            admin.verMenu();
        }

    }


}