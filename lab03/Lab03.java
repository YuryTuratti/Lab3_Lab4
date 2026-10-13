/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03;

/**
 *
 * @author yuryturatti
 */
public class Lab03 {

    public static void main(String[] args) {
        
//        Vetor2D V1 = new Vetor2D(2.2,5.5);
//        Vetor2D V2 = new Vetor2D(3.2,5.2);
//        
//        Double produtoEscalar = V1.CalPE(V2);
//        System.out.printf("Produto Escalar de V1 e V2: %.2f\n",produtoEscalar);
//        
//        Double mdV1 = V1.moduloVetor();
//        System.out.printf("Modulo de V1: %.2f\n",mdV1);
//        
//        Double mdV2 = V2.moduloVetor();
//        System.out.printf("Modulo de V2: %.2f\n",mdV2);
//        
//        V1.angulo2V(V2);
//        
//        Vetor2D projecao = V1.projecaoVetor(V2);
//        System.out.printf("Projeçao de V1 sobre V2: (%.2f,%.2f)\n",projecao.getX(),projecao.getY());
        
        Vetor3D V1 = new Vetor3D(2.2,3.5,2.1);
        Vetor3D V2 = new Vetor3D(2.2,1.3,3.1);
        
        System.out.println("Modulo de v1:"+V1.moduloVetor());
        System.out.println("Modulo de v2:"+V2.moduloVetor());
        
        Vetor3D V3 =  V1.produtoVetorial(V2);
        System.out.println("Produto vetorial de v1 e v2: x"+V3.getX()+" y:"+V3.getY()+" z:"+V3.getZ());
    }
}
