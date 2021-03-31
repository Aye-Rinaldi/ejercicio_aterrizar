package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Transporte> transportes = new ArrayList<>();
        List<Hospedaje> hospedajes = new ArrayList<>();
        List<Excursion> excursiones = new ArrayList<>();

        transportes.add(new TransportePrivado("auto"));
        transportes.add(new Avion("avion"));
        transportes.add(new Colectivo("colectivo"));
        transportes.add(new Tren("tren"));

        hospedajes.add(new Casa());
        hospedajes.add(new Departamento());
        hospedajes.add(new Hotel());

        TransportePrivado auto = new TransportePrivado("auto");
        Hotel hotel = new Hotel();
        hotel.reservar();
        auto.reservar();

        //Regateo
        //opcion1
        hotel.bajarPrecio();
        Avion avion = new Avion("comercial");
        avion.bajarPrecio();

        //opcion2
        /*
        Usuario usuario = new Usuario();
        usuario.regatear(hotel);
         */

        System.out.print("Precio del auto: ");
        auto.informarPrecio();
        System.out.print("Precio del hotel: ");
        hotel.informarPrecio();







    }


}
