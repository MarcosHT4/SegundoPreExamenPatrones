package ejercicio3;

public class Client {

    public static void main(String[] args) {

        TiendaDeCelulares tiendaDeCelulares = new TiendaDeCelulares();

        tiendaDeCelulares.addCelulares(new Celular("S10", "Samsung", "Alta", 230));
        tiendaDeCelulares.addCelulares(new Celular("S10", "Redmi", "Media", 769));
        tiendaDeCelulares.addCelulares(new Celular("S4", "Samsung", "Media", 230));
        tiendaDeCelulares.addCelulares(new Celular("X", "IPhone", "Baja", 230));
        tiendaDeCelulares.addCelulares(new Celular("S10", "Zamzung", "Baja", 454));
        tiendaDeCelulares.addCelulares(new Celular("S10", "Oppo", "Alta", 432));

        tiendaDeCelulares.buscarCelular(new Celular(null, "", "", 230));
        tiendaDeCelulares.buscarCelular(new Celular("S10", "", "", 0));
        tiendaDeCelulares.buscarCelular(new Celular("S4", "", "", 230));

        tiendaDeCelulares.addCelulares(new Celular("Note6", "LG", "Media", 769));
        tiendaDeCelulares.addCelulares(new Celular("Note6", "Samsung", "Alta", 963));
        tiendaDeCelulares.addCelulares(new Celular("FindY", "Xiaomi", "Media", 769));
        tiendaDeCelulares.addCelulares(new Celular("Note9", "Quipus", "Baja", 769));
        tiendaDeCelulares.addCelulares(new Celular("X", "HTC", "Baja", 212));
        tiendaDeCelulares.addCelulares(new Celular("FindY", "ROG", "Alta", 963));

        tiendaDeCelulares.buscarCelular(new Celular(null, "", "", 769));
        tiendaDeCelulares.buscarCelular(new Celular("Note6", "", "", 0));
        tiendaDeCelulares.buscarCelular(new Celular("FindY", "", "", 963));




    }

}
