package ejercicio3;

import java.util.List;

public class BusquedaSimplePorPrecioYModelo implements IBusquedaCelular{


    @Override
    public void busqueda(List<Celular> listaDeCelulares, Celular celular) {

        System.out.println("*****Mostrando celulares por el precio y modelos especificados: ****".toUpperCase());

        for(Celular celularLista : listaDeCelulares) {

            if(celular.getPrecio() == celularLista.getPrecio() && celular.getModelo().equals(celularLista.getModelo())) {

                celularLista.showInfo();

            }

        }



    }
}
