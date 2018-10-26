package Cola;

public class Paciente {
    private String nombre;
    private String fechaNac;
    private String detallePadecimiento;
    private String tipoPadecimiento;
    private String valoracion;
    private String ficha;

    public Paciente(String nombre, String fechaNac, String detallePadecimiento, String tipoPadecimiento, String valoracion, String ficha) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.detallePadecimiento = detallePadecimiento;
        this.tipoPadecimiento = tipoPadecimiento;
        this.valoracion = valoracion;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getDetallePadecimiento() {
        return detallePadecimiento;
    }

    public String getTipoPadecimiento() {
        return tipoPadecimiento;
    }

    public String getValoracion() {
        return valoracion;
    }

    public String getFicha() {
        return ficha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setDetallePadecimiento(String detallePadecimiento) {
        this.detallePadecimiento = detallePadecimiento;
    }

    public void setTipoPadecimiento(String tipoPadecimiento) {
        this.tipoPadecimiento = tipoPadecimiento;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }
    
    
    
}
