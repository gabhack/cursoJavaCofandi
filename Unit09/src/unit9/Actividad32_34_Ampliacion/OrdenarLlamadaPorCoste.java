package unit9.Actividad32_34_Ampliacion;

public class OrdenarLlamadaPorCoste implements java.util.Comparator<Llamada>{
    @Override
    public int compare(Llamada o1, Llamada o2) {
        return Double.compare(o1.getCosteLlamada(), o2.getCosteLlamada());
    }
}
