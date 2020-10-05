package ShareCar;
import java.awt.*;
import java.util.Date;

public class RegistroCliente {
    private static String firstName;
    private static String lastName;
    private static Image profileImage;
    private static Date vencimientoLicencia;
    private static Image licenciaA;
    private static Image licenciaB;
    private static String Dirrecion;


    public void getFacebookData() {
        String[] data = facebook.Login();
        RegistroCliente.firstName = data[1];
        RegistroCliente.lastName = data[2];
        String profileImageUrl = data[3];
        getProfilePic(profileImageUrl);

    }

    public void getAppData(String dirrecion, Image licenciaA, Image licenciaB){
        RegistroCliente.Dirrecion=dirrecion;
        RegistroCliente.licenciaA=licenciaA;
        RegistroCliente.licenciaB=licenciaB;
    }

    public void getProfilePic(String url){
        // donwload profile pic and set it
    }
}
// Abstract class for facebook login

class facebook{
    protected static String[] Login() {
        String[] data = new String[0];
        return data;

    }


}