package ar.com.xeven;
//se pueden comprar pasajes
//NO hay trenes lowcost
public abstract class TransportePublico extends Transporte{
    public TransportePublico(String nombre) {
        super(nombre);
    }

    public void regatera(){
        if (nombre.equals("tren"))
            System.out.println("No se pueden regatear los trenes.");
        else
            System.out.println("Aviones y Colectivos se pueden regatear.");
    }
}
