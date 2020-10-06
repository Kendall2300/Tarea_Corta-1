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

    /**
     * Adapter from facebook data to app data
     */
    public void getFacebookData() {
        String[] data = facebook.Login();
        RegistroCliente.firstName = data[1];
        RegistroCliente.lastName = data[2];
        String profileImageUrl = data[3];
        getProfilePic(profileImageUrl);

    }
	/**
     * get other data from user
     */
    public void getAppData(String dirrecion, Image licenciaA, Image licenciaB){
        RegistroCliente.Dirrecion=dirrecion;
        RegistroCliente.licenciaA=licenciaA;
        RegistroCliente.licenciaB=licenciaB;
    }
	/**
     * Download facebook profile photo
     */
    public void getProfilePic(String url){
        // donwload profile pic and set it
    }
}
/**
* Abstract class for facebook login
*@return facebook data 
*/
class facebook{
    protected static String[] Login() {
        String[] data = new String[0];
        return data;

    }


}