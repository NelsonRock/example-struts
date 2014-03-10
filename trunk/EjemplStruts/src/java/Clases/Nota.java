/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author rcerrato
 */
public class Nota {
    private int id;
    private double nota;
    public Nota(){
    
    }
    public Nota(int i, double n){
        id=i;
        nota=n;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String toString(){
        return id +" " +nota;
    }
    
}
