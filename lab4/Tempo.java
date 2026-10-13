/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author yuryturatti
 */
public class Tempo {
        private int hora;
    private int minuto;
 
    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
    }
 
    public Tempo(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }
 
    public int getHora() {
        return hora;
    }
 
    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora invalida (0 a 23).");
        }
        this.hora = hora;
    }
 
    public int getMinuto() {
        return minuto;
    }
 
    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto invalido (0 a 59).");
        }
        this.minuto = minuto;
    }
 
    public int emMinutos() {
        return hora * 60 + minuto;
    }
 
    // Retorna a duracao entre this (hora final) e outro (hora inicial).
    // Se a saida for "antes" da entrada, considera que passou da meia-noite.
    public Tempo subtrai(Tempo outro) {
        int diff = this.emMinutos() - outro.emMinutos();
        if (diff < 0) {
            diff += 24 * 60;
        }
        Tempo resultado = new Tempo();
        resultado.hora = diff / 60;
        resultado.minuto = diff % 60;
        return resultado;
    }
 
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }

}
