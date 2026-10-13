/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab03;

/**
 *
 * @author yuryturatti
 */
public class Vetor2D {
    protected Double x;
    protected Double y;

    public Vetor2D(){
        x = 0.0;
        y = 0.0;
    }
    
    public Vetor2D(Double x, Double y){
        this.x = x;
        this.y = y;
    }
    
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    
    public Double CalPE(Vetor2D V2){
        Double produtoE;
        // (x1 * y1) + (x2 * y2)
        produtoE = (this.getX() * V2.getX()) + (V2.getY() * this.getY());
        return produtoE;
    }
    
    public Double moduloVetor(){
        Double md = Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
        return md;
    }
    
    public void angulo2V(Vetor2D V2){
        
        Double cosseno = this.CalPE(V2) / (this.moduloVetor() * V2.moduloVetor());
        Double anguloRadiano = Math.acos(cosseno);
        Double angulo = Math.toDegrees(anguloRadiano);
        
        System.out.printf("Angulo me graus: %.2f\n",angulo);
    }
    
    public Vetor2D projecaoVetor(Vetor2D B) {
        Double produtoEscalar = this.CalPE(B);
    
        Double moduloBQuadrado = Math.pow(B.moduloVetor(), 2);
    
        Double fator = produtoEscalar / moduloBQuadrado;
    
        Double novoX = B.getX() * fator;
        Double novoY = B.getY() * fator;
        
        return new Vetor2D(novoX, novoY);
    }
}