package ejercicio3;

import java.util.List;

public class BusquedaSimplePorModelo implements IBusquedaCelular{


    @Override
    public void busqueda(List<Celular> listaDeCelulares, Celular celular) {

        System.out.println("*****Mostrando celulares por el modelo especificado: ****".toUpperCase());

        for(Celular celularLista : listaDeCelulares) {

            if(celular.getModelo().equals(celularLista.getModelo())) {

                celularLista.showInfo();

            }

        }



    }
}
