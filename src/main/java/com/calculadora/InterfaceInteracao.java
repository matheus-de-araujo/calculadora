package com.calculadora;

import java.util.Scanner;

public class InterfaceInteracao {

    private static void InicializarInterfaceDeInteracao() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int operacao = 0;

        while (true) {

            System.out.println("\nSelecione a operação:");
            System.out.println("1- Soma            5- Raiz quadrada\n2- Subtração       6- Seno\n3- Multiplicação   7- Cosseno\n4- Divisão         8- Tangente \n\n0- Finalizar");
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
            String entradaDois;

            if (primeiraIteracao) {
                entradaUm = entrada.nextLine();
                primeiraIteracao = false;
            }

            entradaUm = ObterValor(entrada, "primeiro");
            if (entradaUm.toUpperCase().equals("SAIR")) {
                LimparTela();
                break;
            }

            entradaDois = ObterValor(entrada, "segundo");
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
                System.out.println("ATENÇÃO, valor inválido!");
                Thread.sleep(3000);
                continue;
            }

            CalculadoraCientifica calCientifica = new CalculadoraCientifica(termoUm, termoDois);

            switch (operacao) {
                case 1:
                    calCientifica.soma();
                    ApresenteResultado("soma", termoUm, termoDois, calCientifica);
                    break;

                case 2:
                    calCientifica.subtracao();
                    ApresenteResultado("subtração", termoUm, termoDois, calCientifica);
                    break;

                case 3:
                    calCientifica.multiplicacao();
                    ApresenteResultado("multiplicação", termoUm, termoDois, calCientifica);
                    break;

                case 4:
                    calCientifica.divisao();
                    ApresenteResultado("divisão", termoUm, termoDois, calCientifica);
                    break;

                case 5:
                    calCientifica.raizQuadrada();
                    ApresenteResultado("raiz quadrada", termoUm, termoDois, calCientifica);
                    break;

                case 6:
                    calCientifica.seno();
                    ApresenteResultado("operação seno", termoUm, termoDois, calCientifica);
                    break;

                case 7:
                    calCientifica.cosseno();
                    ApresenteResultado("operação cosseno", termoUm, termoDois, calCientifica);
                    break;
                
                case 8:
                    calCientifica.tangente();
                    ApresenteResultado("operação tangente", termoUm, termoDois, calCientifica);
                    break;
            }

        }

    }

    private static void ApresenteResultado(String operacao, Float termoUm, Float termoDois,
            CalculadoraCientifica calCientifica) throws InterruptedException {
        System.out
                .println("A " + operacao + " entre " + termoUm + " e " +
                        termoDois + " é: " + calCientifica.getResultado());
        Thread.sleep(3000);
        LimparTela();
    }

    private static String ObterValor(Scanner entrada, String termo) {
        System.out.println("Digite o " + termo + " valor (para finalizar digite 'sair'):");
        return entrada.nextLine();
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