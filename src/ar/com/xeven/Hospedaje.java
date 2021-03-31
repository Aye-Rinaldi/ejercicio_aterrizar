package ar.com.xeven;

public abstract class Hospedaje implements Reservable, LowCost{

    @Override
    public void informarPrecio() {
        System.out.println("Soy un hospedaje e informo mi precio");
        //LowCost.super.informarPrecio(); aca el hotel me informa el precio segun como lo hacen las LowCost
        //se pueden llamar a los metodos de una interface dentro de los metodos que implementen esa interface
    }
}
