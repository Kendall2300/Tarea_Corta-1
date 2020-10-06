package ShareCar;

public class Main {
    public static void main(String[] args) {
        CheckFacade client1=new CheckFacade();
        client1.search("02/08/2020","08/07/2020");

        CheckFacade client2=new CheckFacade();
        client2.search("02/09/2020","08/07/2020");
    }
}
