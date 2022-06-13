package ejercicio2;

public class Client {

    public static void main(String [] args) {

        CuerpoDelEjercito cuerpoDelEjercito = new CuerpoDelEjercito();

        cuerpoDelEjercito.criteriaHandler(new Entrevista());

        cuerpoDelEjercito.criteriaHandler(new Disciplina());

        cuerpoDelEjercito.criteriaHandler(new Desbloqueos());

        cuerpoDelEjercito.criteriaHandler(new Manifestaciones());

        cuerpoDelEjercito.criteriaHandler(new Limpieza());

    }

}
