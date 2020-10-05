package ShareCar;

public class CheckFacade {
    private SearchCar carro;
    private Disponibilidad Disposicion;

    public CheckFacade(){
        carro=new SearchCar();
        Disposicion=new Disponibilidad();
    }
    public void search(String fechaIda, String fechaVuelta){
        carro.searchCar(fechaIda, fechaVuelta);
        Disposicion.searchDisponibilidad(fechaIda, fechaVuelta);
    }

}
