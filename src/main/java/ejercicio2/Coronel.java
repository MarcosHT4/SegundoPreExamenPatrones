package ejercicio2;

public class Coronel implements IEjercito{

    private IEjercito next;


    @Override
    public void setNext(IEjercito next) {

        this.next = next;

    }

    @Override
    public void criteriaHandler(IOrden orden) {

        if(orden.getType().equals("desbloqueos") || orden.getType().equals("manifestaciones")) {

            System.out.println("El coronel está atendiendo la orden");

        } else {

            next.criteriaHandler(orden);

        }

    }

    @Override
    public IEjercito next() {
        return next;
    }
}
