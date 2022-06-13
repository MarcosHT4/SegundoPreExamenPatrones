package ejercicio7;

public class Client {

    public static void main(String[] args) {

        ManejadorPrestamo.getInstance().setCantidadOriginal(100);

        EquipoDePrestamos equipoDePrestamos = new EquipoDePrestamos();

        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);
        equipoDePrestamos.criteriaHandler(25);


    }

}
