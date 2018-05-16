/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojos;

/**
 *
 * @author Darkgrey93
 */
public class Sala {
    private double id;
    private int sillas;
    private int pelicula;

    /**
     * @return the id
     */
    public double getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(double id) {
        this.id = id;
    }

    /**
     * @return the sillas
     */
    public int getSillas() {
        return sillas;
    }

    /**
     * @param sillas the sillas to set
     */
    public void setSillas(int sillas) {
        this.sillas = sillas;
    }

    /**
     * @return the pelicula
     */
    public int getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(int pelicula) {
        this.pelicula = pelicula;
    }
}
