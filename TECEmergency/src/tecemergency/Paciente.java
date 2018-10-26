/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency;

/**
 *
 * @author Melina
 */
public class Paciente implements Comparable <Paciente>{
    private String nombre;
    private String fechaNacimiento;
    private String detallesPadecimiento;
    private String ficha;
    private Colores color;
    private Enfermedades enfermedad;
    private static int contador;
    private int posicion;
    
    public Paciente(String pNombre, String pFechaNacimiento, String pDetalles, Colores pColor, Enfermedades pEnfermedad){
        nombre = pNombre.toUpperCase();
        fechaNacimiento = pFechaNacimiento.toUpperCase();
        detallesPadecimiento = pDetalles.toUpperCase();
        posicion = contador;
        contador++;
        color = pColor;
        enfermedad = pEnfermedad;
        ficha = pColor.getCodigo() + "-" + enfermedad.getCodigo() + "-" + posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDetallesPadecimiento() {
        return detallesPadecimiento;
    }

    public void setDetallesPadecimiento(String detallesPadecimiento) {
        this.detallesPadecimiento = detallesPadecimiento;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Enfermedades getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedades enfermedad) {
        this.enfermedad = enfermedad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Paciente.contador = contador;
    }
    

    @Override
    public int compareTo(Paciente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
