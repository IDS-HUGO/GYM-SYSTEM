import java.util.Scanner;
public class Usuario {
    
    protected static String usuarioGerente = "gerenteGym";
    protected static String usuarioAdministrador = "administradorGym";
    protected static String contraseñaGerente = "gerente123";
    protected static String contraseñaAdministrador = "administrador123";
    static Scanner leer =new Scanner(System.in);

    public static void main(String[] args) {
        iniciarSesion();
    }
    public static void iniciarSesion() {

        String usuario;
        String contraseña;

        do {
            System.out.println("Ingrese su usuario");
            usuario = leer.nextLine();

            System.out.println("Ingrese su contraseña");
            contraseña = leer.nextLine();

            if (usuario.equals(usuarioGerente) && contraseña.equals(contraseñaGerente)) {
                Gerente ob1 = new Gerente();
                ob1.agregarCliente();
            } else if (usuario.equals(usuarioAdministrador) && contraseña.equals(contraseñaAdministrador)) {
                Administrador ob1 = new Administrador();
                ob1.verCliente();
            } else {
                System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
            }

        } while (!(usuario.equals(usuarioGerente) && contraseña.equals(contraseñaGerente)) &&
                 !(usuario.equals(usuarioAdministrador) && contraseña.equals(contraseñaAdministrador)));
    }

}