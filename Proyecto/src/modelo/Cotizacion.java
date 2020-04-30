
package modelo;

public class Cotizacion {
    
    private int IdCotizacion;
    private int IdEmpresa;
    private String Proyecto;
    private String FechaMontaje;
    private String FechaActividad;
    private String Ciudad;
    private String Pago;
    private String FechaElaboracion;
    private String Cedula;
    private String Observacion;
    
    public Cotizacion (int IdCotizacion, int IdEmpresa, String Proyecto, String FechaMontaje,
            String FechaActividad, String Ciudad, String Pago, String FechaElaboracion,
            String Cedula, String Observacion){
        this.IdCotizacion = IdCotizacion;
        this.IdEmpresa = IdEmpresa;
        this.Proyecto = Proyecto;
        this.FechaMontaje = FechaMontaje;
        this.FechaActividad = FechaActividad;
        this.Ciudad = Ciudad;
        this.Pago = Pago;
        this.FechaElaboracion = FechaElaboracion;
        this.Cedula = Cedula;
        this.Observacion = Observacion;
    }
    
    public Cotizacion(){
        
    }

    public int getIdCotizacion() {
        return IdCotizacion;
    }

    public void setIdCotizacion(int IdCotizacion) {
        this.IdCotizacion = IdCotizacion;
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getFechaMontaje() {
        return FechaMontaje;
    }

    public void setFechaMontaje(String FechaMontaje) {
        this.FechaMontaje = FechaMontaje;
    }

    public String getFechaActividad() {
        return FechaActividad;
    }

    public void setFechaActividad(String FechaActividad) {
        this.FechaActividad = FechaActividad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPago() {
        return Pago;
    }

    public void setPago(String Pago) {
        this.Pago = Pago;
    }

    public String getFechaElaboracion() {
        return FechaElaboracion;
    }

    public void setFechaElaboracion(String FechaElaboracion) {
        this.FechaElaboracion = FechaElaboracion;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    
    @Override
    public String toString(){
        return "Cotizacion{ "+",IdCotizacion = "+IdCotizacion+",IdEmpresa = "+IdEmpresa+
                ",Proyecto = "+Proyecto+",FechaMontaje = "+FechaMontaje+",FechaActividad"+FechaActividad+
                ",Ciudad = "+Ciudad+",Pago = "+Pago+",FechaElaboracion = "+FechaElaboracion+
                ",Cedula = "+Cedula+"Observacion = "+Observacion+"}";
    }
}
