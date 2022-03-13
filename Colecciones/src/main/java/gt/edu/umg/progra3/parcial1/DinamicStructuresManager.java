package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.*;

public class DinamicStructuresManager<T>{

    List<T> values ;


    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        //inserte codigo aqui
       values.sort(null);
       return values;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        values.sort(null);
        Collections.reverse(values);

        return values;
    }

}
