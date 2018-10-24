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
    public String nombre;
    public String fechaNacimiento;
    public String detallesPadecimiento;
    public String ficha;
    Colores color;
    static int contador;
    public int posicion;
    
    public Paciente(String pNombre, String pFechaNacimiento, String pDetalles, Colores pColor){
        nombre = pNombre;
        fechaNacimiento = pFechaNacimiento;
        detallesPadecimiento = pDetalles;
        posicion = contador;
        color = pColor;
        ficha = pColor.getCodigo() + "-" /*+ tipo + "-"*/ + posicion;
        contador++;
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

    @Override
    public int compareTo(Paciente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
