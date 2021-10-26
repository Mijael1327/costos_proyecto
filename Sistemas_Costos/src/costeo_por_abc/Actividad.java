package costeo_por_abc;



import costeo_por_abc.Impulsador;

/**
 *
 * @author usuario
 */
public class Actividad {
    private String nombreActividad;
    private double CifTotalActividad;
    
    private Impulsador impulsador;
    
    private double costoUnidadImpulsador;

    public Actividad(String nombreActividad, double CifTotalActividad, Impulsador impulsador) {
        this.nombreActividad = nombreActividad;
        this.CifTotalActividad = CifTotalActividad;
        this.impulsador = impulsador;
        
    }

    public double costoUnidadImpulsador(){
        this.costoUnidadImpulsador=this.CifTotalActividad/this.impulsador.getCantidad();
        return this.CifTotalActividad/this.impulsador.getCantidad();
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public double getCifTotalActividad() {
        return CifTotalActividad;
    }

    public Impulsador getImpulsador() {
        return impulsador;
    }

    public double getCostoUnidadImpulsador() {
        return costoUnidadImpulsador;
    }

    @Override
    public String toString() {
        return "Actividad{" + "nombreActividad=" + nombreActividad + ", CifTotalActividad=" + CifTotalActividad + ", impulsador=" + impulsador + ", costoUnidadImpulsador=" + costoUnidadImpulsador + '}';
    }
  
    
    
}
