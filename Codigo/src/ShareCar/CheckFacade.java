package ShareCar;

/**
*The class calls the classes SearchCar and Disponibilidad
*/
public class CheckFacade {
    private SearchCar carro;
    private Disponibilidad Disposicion;
    
    /**
    *The method creates the instance of the two classes
    */
    public CheckFacade(){
        carro=new SearchCar();
        Disposicion=new Disponibilidad();
    }
    
    /**
    *The method recieves the departure and return date data as parameter and calls out the other two clases.
    */
    public void search(String fechaIda, String fechaVuelta){
        carro.searchCar(fechaIda, fechaVuelta);
        Disposicion.searchDisponibilidad(fechaIda, fechaVuelta);
    }

}
