import java.util.Scanner;
public class Administrador extends Usuario{

    public String getUser() {
        return super.getUser();
    }
    public String getPass() {
        return super.getPass();
    }

    public Administrador(){
        this.user = "Lizeth.egordillo";
        this.pass = "Estrada@2024";
    }

    public void verMenu(){}
}
