/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.*;

/**
 *
 * @author rcerrato
 */
public class Alumno {
    private String nombre, apellido, clave, direccion;
    private int edad;
    private Vector notas;
    private Nota nota;
    public Alumno(){
        
    }
    public Alumno(String n, String a, String c, int e, String d){
        nombre=n;
        apellido=a;
        clave=c;
        edad=e;
        direccion=d;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNotas(Nota n){
        notas.add(n);
    }
    public String verNotas(){
        String notasT="";
        for(int i=0;i<notas.size();i++)
            notasT+=((Nota)notas.get(i)).toString()+"\n";
        return notasT;
    }
}
