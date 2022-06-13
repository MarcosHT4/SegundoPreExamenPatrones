package ejercicio7;

public class Supervisor implements IAgentePago{

    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {

        next = agentePago;

    }

    @Override
    public void criteriaHandler(int cantidad) {

        if(ManejadorPrestamo.getInstance().getCantidadPagada() < ManejadorPrestamo.getInstance().getCantidadOriginal()) {

            ManejadorPrestamo.getInstance().setCantidadPagada(ManejadorPrestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("SUPERVISOR> GRACIAS POR EL PAGO, DESEA ALGUN OTRO PRESTAMO?");

            if(ManejadorPrestamo.getInstance().getCantidadPagada() >= ManejadorPrestamo.getInstance().getCantidadOriginal()) {

                System.out.println("SUPERVISOR> Ha completado su pago! Le enviaremos con el Encargado de Prestamos");

                next.criteriaHandler(cantidad);

            }

        } else {

            next.criteriaHandler(cantidad);

        }

    }

    @Override
    public IAgentePago next() {
        return null;
    }
}
