package ejercicio2;

public class Teniente implements IEjercito{

    private IEjercito next;


    @Override
    public void setNext(IEjercito next) {

        this.next = next;

    }

    @Override
    public void criteriaHandler(IOrden orden) {

        if(orden.getType().equals("disciplina")) {

            System.out.println("El teniente está atendiendo la orden");

        } else {

            next.criteriaHandler(orden);

        }

    }

    @Override
    public IEjercito next() {
        return next;
    }
}
