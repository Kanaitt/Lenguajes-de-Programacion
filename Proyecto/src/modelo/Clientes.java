
package modelo;

public class Clientes {
    
    private int IdEmpresa;
    private String Empresa;
    private String Correo;
    private String Representante;
    private String Cargo;
    private String Celular;
    private String Direccion;
    
    
    public Clientes (int IdEmpresa,String Empresa, String Correo, String Representante,
            String Cargo, String Celular, String Direccion){
        
        this.IdEmpresa = IdEmpresa;
        this.Empresa = Empresa;
        this.Correo = Correo;
        this.Representante = Representante;
        this.Cargo = Cargo;
        this.Celular = Celular;
        this.Direccion = Direccion;
    }
    
    public Clientes(){
        
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    @Override
    public String toString(){
        return "Clientes{ "+",IdEmpresa = "+IdEmpresa+
                ", Empresa = "+Empresa+", Correo = "+Correo+", Representante = "+Representante+
                ",Cargo = "+Cargo+", Celular = "+Celular+", Direccion = "+Direccion+"}";
    }
}
