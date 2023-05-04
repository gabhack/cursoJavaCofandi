package unit08.Actividad06_Aplicacion;

import unit08.Actividad04.Instrumento;
import unit08.Actividad04.Notas;

public class Campana extends Instrumento {

    public Campana(){
        super();
    }

    @Override
    protected void interpretar() {
        for (Notas nota : super.melodia) {
            System.out.println("Ding!" + nota);
        }
    }


}
