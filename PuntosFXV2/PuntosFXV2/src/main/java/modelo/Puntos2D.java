/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kevin.aristizabal
 */
public class Puntos2D {
    
    private double puntoX;
    private double puntoY;

    public Puntos2D() {
    }

    public Puntos2D(double puntoX, double puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }
    

    /**
     * Get the value of puntoY
     *
     * @return the value of puntoY
     */
    public double getPuntoY() {
        return puntoY;
    }

    /**
     * Set the value of puntoY
     *
     * @param puntoY new value of puntoY
     */
    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }

   

    /**
     * Get the value of puntoX
     *
     * @return the value of puntoX
     */
    public double getPuntoX() {
        return puntoX;
    }

    /**
     * Set the value of puntoX
     *
     * @param puntoX new value of puntoX
     */
    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    @Override
    public String toString() {
        return  puntoX + "," + puntoY ;
    }
    
}
