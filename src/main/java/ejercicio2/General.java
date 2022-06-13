package ejercicio2;

public class General implements IEjercito{

    private IEjercito next;


    @Override
    public void setNext(IEjercito next) {

        this.next = next;

    }

    @Override
    public void criteriaHandler(IOrden orden) {

        if(orden.getType().equals("entrevista")) {

            System.out.println("El general está atendiendo la orden");

        } else {

            next.criteriaHandler(orden);

        }

    }

    @Override
    public IEjercito next() {
        return next;
    }
}
