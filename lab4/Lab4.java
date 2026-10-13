/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author yuryturatti
 */
public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento[] carros = new Estacionamento[5];
 
        for (int i = 0; i < carros.length; i++) {
            System.out.println("\n--- Carro " + (i + 1) + " ---");
            carros[i] = new Estacionamento();
            carros[i].solicitarDados(sc);
        }
 
        System.out.println("\n===== RELATORIO =====");
        for (int i = 0; i < carros.length; i++) {
            System.out.println("\nCarro " + (i + 1));
            carros[i].imprimirDados();
            carros[i].imprimirValorCobrado();
        }
 
        sc.close();
    }
}
