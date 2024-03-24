import java.util.Scanner;
public class Administrador extends Usuario{

    private String rol = "Admin";

    public String getUser() {
        return super.getUser();
    }
    public String getPass() {
        return super.getPass();
    }

    public String getRol() {
        return rol;
    }

    public Administrador(){
        this.user = "Lizeth.egordillo";
        this.pass = "Estrada@2024";
    }

    public void verMenu(){
        System.out.println("BUEN DIA "+this.user+" QUE DESEA REALIZAR: ");
            System.out.println(
            "1.- Ver datos del Cliente\n"+
            "2.- Ver clientes\n"+
            "3.- Ver inventario");
    }
}
