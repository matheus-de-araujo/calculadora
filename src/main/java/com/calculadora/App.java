package com.calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        InicializarSistema();
        InicializarInterfaceDeInteracao();
    }

    private static void InicializarInterfaceDeInteracao() {
        Scanner entrada = new Scanner(System.in);
        
        while (true) {
            System.out.println("Gama Tecnologia");
            System.out.println("Calculadora - Ver. 2.0");

            System.out.println("Selecione a operação:");
            System.out.println("1- Soma    2- Subtração    3- Multiplicação    4- Divisão    0- Finalizar");
            int operacao = entrada.nextInt();

            if (operacao == 0) break;

            Double somatorio = 0.0;
            while (true) {

                System.out.println("Digite a operação (para finalizar digite 'sair'):");
                String entradaDoUsuario = entrada.nextLine();

                if (entradaDoUsuario.toUpperCase().equals("SAIR")) {
                    break;
                }
            }
        }
    }

    public static void InicializarSistema() {

        try {
            System.out.println("  ############       #######             ####   ####             #######");
            System.out.println("##                  ##     ##           ##  ## ##  ##           ##     ##");
            System.out.println("##                 ##       ##         ##    ##     ##         ##       ##");
            System.out.println("##      ######    ##         ##       ##             ##       ##         ##");
            System.out.println("##          ##   ###############     ##               ##     ###############");
            System.out.println("##          ##  ##             ##   ##                 ##   ##             ##");
            System.out.println("  ############ ##               ## ##                   ## ##               ##");
            System.out.println("                                                                        Tecnologia");

            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }
}
