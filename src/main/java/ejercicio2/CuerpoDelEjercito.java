package ejercicio2;

public class CuerpoDelEjercito implements IEjercito {


    private IEjercito next;

    @Override
    public void setNext(IEjercito next) {

        this.next = next;

    }

    @Override
    public void criteriaHandler(IOrden orden) {

        General general = new General();
        this.setNext(general);
        Teniente teniente = new Teniente();
        general.setNext(teniente);
        Coronel coronel = new Coronel();
        teniente.setNext(coronel);
        Cabo cabo = new Cabo();
        coronel.setNext(cabo);

        this.next.criteriaHandler(orden);

    }

    @Override
    public IEjercito next() {
        return null;
    }
}
