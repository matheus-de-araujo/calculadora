package com.calculadora;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        InicializarSistema();
        InicializarInterfaceDeInteracao();
    }

    private static void InicializarInterfaceDeInteracao() {
        Scanner entrada = new Scanner(System.in);
        int operacao = 0;
        
        while (true) {
            
            System.out.println("Gama Tecnologia");
            System.out.println("Calculadora - Ver. 2.0");

            System.out.println("Selecione a operação:");
            System.out.println("1- Soma    2- Subtração    3- Multiplicação    4- Divisão    0- Finalizar");
            operacao = entrada.nextInt();

            if (operacao == 0)
                break;

            Double somatorio = 0.0;
            while (true) {

                Double entradaDoUsuario = 0.01;
                System.out.println("Digite um valor (para finalizar digite 'sair'):");

                try {
                    entradaDoUsuario = entrada.nextDouble();
                } catch (Exception e) {
                    if (entradaDoUsuario.toString().toUpperCase().equals("SAIR")) {
                        entradaDoUsuario = 0.0;
                        break;
                    }
                    else {
                        System.out.println("ATENÇÃO, valor invalido!");
                        entradaDoUsuario = 0.0;
                        break;
                    }
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
