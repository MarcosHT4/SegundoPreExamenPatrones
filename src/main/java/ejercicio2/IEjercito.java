package ejercicio2;

public interface IEjercito {

    void setNext(IEjercito next);

    void criteriaHandler(IOrden orden);

    IEjercito next();


}
