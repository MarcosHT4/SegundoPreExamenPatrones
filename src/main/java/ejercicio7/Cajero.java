package ejercicio7;

public class Cajero implements IAgentePago{

    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {

        next = agentePago;

    }

    @Override
    public void criteriaHandler(int cantidad) {


        if(ManejadorPrestamo.getInstance().getCantidadPagada() < (ManejadorPrestamo.getInstance().getCantidadOriginal()*25)/100) {

            ManejadorPrestamo.getInstance().setCantidadPagada(ManejadorPrestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("CAJERO> GRACIAS POR EL PAGO");

        } else {

            next.criteriaHandler(cantidad);

        }

    }

    @Override
    public IAgentePago next() {
        return null;
    }
}
