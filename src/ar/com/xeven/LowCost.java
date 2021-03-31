package ar.com.xeven;

import com.sun.org.apache.xerces.internal.xinclude.XIncludeMessageFormatter;

public interface LowCost {

    default void bajarPrecio(){
        System.out.println("Ok, te bajamos el precio.");
    }

    default void informarPrecio(){
        System.out.println("No soy tan caro, pero puedo bajar aun mas.");
    }
}
