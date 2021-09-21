package br.com.ChronosAcademy.LogicaProgramacao;

public class MilhasMaritimas {
    public static void main(String[] args) {
        /*
        Sabendo que uma milha marítima equivale a um mil,
        oitocentos e cinqüenta e dois metros e que um quilômetro possui mil metros,
        fazer um programa para converter milhas marítimas em quilômetros.

        Dica: 1milha = 1852m
        1milha = 1.852km
        */

        int qtdMilhas = 4;
        float milha = 1852f/1000;

        float km = qtdMilhas * milha;

        System.out.println("Resultado: " +km+"km");

    }
}
