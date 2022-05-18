package com.calculadora;

import java.util.Scanner;

public class InterfaceInteracao {

    private static void InicializarInterfaceDeInteracao() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int operacao = 0;

        while (true) {

            System.out.println("Selecione a operação:");
            System.out.println("1- Soma    2- Subtração    3- Multiplicação    4- Divisão    0- Finalizar");
            operacao = entrada.nextInt();

            if (operacao == 0)
                break;

            LimparTela();
            ObterEntradaERealizaOperacao(entrada, operacao);
        }
    }

    private static void ObterEntradaERealizaOperacao(Scanner entrada, int operacao) throws InterruptedException {

        boolean primeiraIteracao = true;
        while (true) {

            String entradaUm;
            if (primeiraIteracao) {
                entradaUm = entrada.nextLine();
                primeiraIteracao = false;
            }

            System.out.println("Digite o primeiro valor (para finalizar digite 'sair'):");
            entradaUm = entrada.nextLine();

            if (entradaUm.toUpperCase().equals("SAIR")) {
                LimparTela();
                break;
            }

            String entradaDois;
            System.out.println("Digite o segundo valor (para finalizar digite 'sair'):");
            entradaDois = entrada.nextLine();

            if (entradaDois.toUpperCase().equals("SAIR")) {
                LimparTela();
                break;
            }

            float termoUm, termoDois;
            try {
                termoUm = Float.valueOf(entradaUm).floatValue();
                termoDois = Float.valueOf(entradaDois).floatValue();
            } catch (Exception e) {
                LimparTela();
                System.out.println("ATENÇÃO, valor invalido!");
                Thread.sleep(3000);
                continue;
            }

            CalculadoraBasica calBasica = new CalculadoraBasica(termoUm, termoDois);

            switch (operacao) {
                case 1:
                    calBasica.soma();
                    System.out
                            .println("A soma entre " + termoUm + " e " +
                                    termoDois + " é: " + calBasica.getResultado());
                    Thread.sleep(3000);
                    LimparTela();
                    break;

                case 2:
                    calBasica.subtracao();
                    System.out
                            .println("A subtração entre " + termoUm + " e " +
                                    termoDois + " é: " + calBasica.getResultado());
                    Thread.sleep(3000);
                    LimparTela();
                    break;

                case 3:
                    
                    System.out
                            .println("A multiplicação entre " + termoUm + " e " +
                                    termoDois + " é: " + calBasica.getResultado());
                    Thread.sleep(3000);
                    LimparTela();
                    break;

                case 4:
                    calBasica.divisao();
                    System.out
                            .println("A divisão entre " + termoUm + " e " +
                                    termoDois + " é: " + calBasica.getResultado());
                    Thread.sleep(3000);
                    LimparTela();
                    break;
            }

        }

    }

    public static void InicializarSistema() throws InterruptedException {
        LimparTela();

        System.out.println("  ############       #######             ####   ####             #######");
        System.out.println("##                  ##     ##           ##  ## ##  ##           ##     ##");
        System.out.println("##                 ##       ##         ##    ###    ##         ##       ##");
        System.out.println("##      ######    ##         ##       ##      #      ##       ##         ##");
        System.out.println("##          ##   ###############     ##               ##     ###############");
        System.out.println("##          ##  ##             ##   ##                 ##   ##             ##");
        System.out.println("  ############ ##               ## ##                   ## ##               ##");
        System.out.println("                                                                        Tecnologia");
        System.out.println("#################################################################################");
        System.out.println("                                  Gama Tecnologia");
        System.out.println("                               Calculadora - Ver. 2.0");
        System.out.println("#################################################################################");

        Thread.sleep(3000);

        InicializarInterfaceDeInteracao();
    }

    private static void LimparTela() {
        int index = 0;
        while (index != 10) {
            System.out.println("\n");
            index++;
        }
    }
}