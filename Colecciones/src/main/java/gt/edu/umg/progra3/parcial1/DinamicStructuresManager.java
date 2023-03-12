package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        values.sort(null);


        //inserte codigo aqu

        return values;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        values.sort(null);
        Collections.reverse(values);
        System.out.println("inversa"+values);

        return values;
    }

}
