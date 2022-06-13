package ejercicio3;

import java.util.List;

public class BusquedaSimplePorPrecio implements IBusquedaCelular{


    @Override
    public void busqueda(List<Celular> listaDeCelulares, Celular celular) {

        System.out.println("*****Mostrando celulares por el precio especificado: ****".toUpperCase());

        for(Celular celularLista : listaDeCelulares) {

            if(celular.getPrecio() == celularLista.getPrecio()) {

                celularLista.showInfo();

            }

        }



    }
}
