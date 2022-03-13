package gt.edu.umg.progra3.parcial1;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticStructureManager<T>{

    T[] values ;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar(){
        //inserte codigo aqui
        Arrays.sort(values);
        return values;
    }

    public T[] ordenarInversa(){
        //inserte codigo aqui
        Arrays.sort(values);
        List<T> array = Arrays.asList(values);
        Collections.reverse(array);
        return values;


    }


}