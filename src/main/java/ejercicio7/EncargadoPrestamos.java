package ejercicio7;

public class EncargadoPrestamos implements IAgentePago{

    private IAgentePago next;

    @Override
    public void setNext(IAgentePago agentePago) {

        next = agentePago;

    }

    @Override
    public void criteriaHandler(int cantidad) {

        if(ManejadorPrestamo.getInstance().getCantidadPagada() >= ManejadorPrestamo.getInstance().getCantidadOriginal()*50/100) {

            System.out.println("ENCARGADO> GRACIAS! TOME SUS DOCUMENTOS...");

        } else {

            next.criteriaHandler(cantidad);

        }

    }

    @Override
    public IAgentePago next() {
        return null;
    }
}
