/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author yuryturatti
 */
public class Vetor3D extends Vetor2D{
    
    private Double z;
    
    public Vetor3D(){
        super();
        z = 0.0;
    }
    
    public Vetor3D(Double x, Double y, Double z){
        super(x,y);
        this.z = z;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }
    
    public Vetor3D produtoVetorial(Vetor3D v) {
        return new Vetor3D(
            this.getY() * v.z - this.z * v.getY(),
            this.z * v.getX() - this.getX() * v.z,
            this.getX() * v.getY() - this.getY() * v.getX()
        );
    }
    
    @Override
    public Double moduloVetor(){
        Double m2d = super.moduloVetor();
        return Math.sqrt(m2d * m2d + z * z);
    }
    
}