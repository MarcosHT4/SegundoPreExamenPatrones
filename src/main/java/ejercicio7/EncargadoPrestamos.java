package ejercicio7;

public class AgenteDeCredito implements IAgentePago{

    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {

        next = agentePago;

    }

    @Override
    public void criteriaHandler(int cantidad) {

        if(ManejadorPrestamo.getInstance().getCantidadPagada() < ManejadorPrestamo.getInstance().getCantidadOriginal()*50/100); {

            ManejadorPrestamo.getInstance().setCantidadPagada(ManejadorPrestamo.getInstance().getCantidadPagada() + cantidad);
            System.out.println("AGENTE> GRACIAS POR EL PAGO, DESEA REFINANCIAR SU PRESTAMO?");

        }

    }

    @Override
    public IAgentePago next() {
        return null;
    }
}
