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

        Boolean succes = false;
        String rol = null;
        int count = 3;

        String userG = gerente.getUser(), userA = admin.getUser();
        String passG = gerente.getPass(), passA = admin.getPass();
        String rolG = gerente.getRol(), rolA = admin.getRol();

        
        do{

            System.out.println("--- Bienvenido ---");
            System.out.println("Intentos: "+count);
            System.out.println("escriba su Rol: \nGerente / Admin");
            rol = leer.nextLine();
            System.out.print("Ingrese su usuario: ");
            this.user = leer.nextLine();
            System.out.print("Ingrese su contraseña: ");
            this.pass = leer.nextLine();
    
            if (rol.equals(rolG)) {
                if(!userG.equals(this.user) && !passG.equals(this.pass)){
                    System.out.println("Usuario incorrecto y contraseña incorrectos");
                    count-=1;
                }else if(!userG.equals(this.user)){
                    System.out.println("Usuario incorrecto");
                    count-=1;
                }else if(!passG.equals(this.pass)){
                    System.out.println("Contraseña incorrecta");
                    count-=1;
                }else if (this.user.equals(userG) && this.pass.equals(passG)) {
                    succes = true;
                }
            }else if (rol.equals(rolA)) {
                if(!userA.equals(this.user) && !passA.equals(this.pass)){
                    System.out.println("Usuario incorrecto y contraseña incorrectos");
                    count-=1;
                }else if(!userA.equals(this.user)){
                    System.out.println("Usuario incorrecto");
                    count-=1;
                }else if(!passA.equals(this.pass)){
                    System.out.println("Contraseña incorrecta");
                    count-=1;
                }else if (this.user.equals(userA) && this.pass.equals(passA)) {
                    succes = true;
                }
            }
        }while(count!=0 && succes == false);


        if (rol.equals(rolG) && succes == true) {
            gerente.verMenu();
        }else if (rol.equals(rolA) && succes == true) {
            admin.verMenu();
        }

    }


}