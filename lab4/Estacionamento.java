/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author yuryturatti
 */
public class Estacionamento {
    private static final double VALOR_HORA = 3.00;
 
    private String placa;
    private String marca;
    private Tempo entrada;
    private Tempo saida;
 
    public Estacionamento() {
        this.placa = "";
        this.marca = "";
        this.entrada = new Tempo();
        this.saida = new Tempo();
    }
 
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
 
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
 
    public Tempo getEntrada() { return entrada; }
    public Tempo getSaida() { return saida; }
 
    // a) Solicita os dados do carro ao usuario
    public void solicitarDados(Scanner sc) {
        System.out.print("Placa: ");
        setPlaca(sc.nextLine());
 
        System.out.print("Marca: ");
        setMarca(sc.nextLine());
 
        System.out.print("Hora de entrada: ");
        entrada.setHora(sc.nextInt());
        System.out.print("Minuto de entrada: ");
        entrada.setMinuto(sc.nextInt());
 
        System.out.print("Hora de saida: ");
        saida.setHora(sc.nextInt());
        System.out.print("Minuto de saida: ");
        saida.setMinuto(sc.nextInt());
 
        sc.nextLine(); // limpa o Enter que sobrou no buffer
    }
 
    // b) Imprime os dados do carro
    public void imprimirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Entrada: " + entrada);
        System.out.println("Saida: " + saida);
    }
 
    // c) Calcula e imprime o valor cobrado (R$ 3,00 por hora iniciada)
    public void imprimirValorCobrado() {
        Tempo permanencia = saida.subtrai(entrada);
        int minutos = permanencia.emMinutos();
        int horasCobradas = (int) Math.ceil(minutos / 60.0);
        double valor = horasCobradas * VALOR_HORA;
 
        System.out.println("Permanencia: " + permanencia);
        System.out.printf("Valor cobrado: R$ %.2f\n", valor);
    }

}
