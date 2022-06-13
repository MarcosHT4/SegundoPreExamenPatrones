package ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class TiendaDeCelulares {

    private List<Celular> celularesEnVenta = new ArrayList<>();
    private IBusquedaCelular busquedaCelular;

    public TiendaDeCelulares() {}

    public List<Celular> getCelularesEnVenta() {
        return celularesEnVenta;
    }

    public void setCelularesEnVenta(List<Celular> celularesEnVenta) {
        this.celularesEnVenta = celularesEnVenta;
    }

    public IBusquedaCelular getBusquedaCelular() {
        return busquedaCelular;
    }

    public void setBusquedaCelular(IBusquedaCelular busquedaCelular) {
        this.busquedaCelular = busquedaCelular;
    }

   public void addCelulares(Celular celular) {

        celularesEnVenta.add(celular);

   }


    public void buscarCelular(Celular celular) {

        if(celularesEnVenta.size() < 10) {

            if(celular.getPrecio() == 0) {

                setBusquedaCelular(new BusquedaSimplePorModelo());

            } else if(celular.getModelo() == null) {

                setBusquedaCelular(new BusquedaSimplePorPrecio());

            } else {

                setBusquedaCelular(new BusquedaSimplePorPrecioYModelo());

            }

        } else {

            if(celular.getPrecio() == 0) {

                setBusquedaCelular(new BusquedaComplejaPorModelo());

            } else if(celular.getModelo() == null) {

                setBusquedaCelular(new BusquedaComplejaPorPrecio());

            } else {

                setBusquedaCelular(new BusquedaComplejaPorPrecioYModelo());

            }

        }

        busquedaCelular.busqueda(celularesEnVenta, celular);


    }


}
