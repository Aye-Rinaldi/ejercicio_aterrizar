package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public abstract class Transporte {
    protected String nombre;
    protected Double precio = 0.0;
    protected List<String> destinos;

    public Transporte(String nombre) {
        this.nombre = nombre;
        destinos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
