package com.calculadora;

import java.util.Scanner;

public class InterfaceInteracao {

    private static void InicializarInterfaceDeInteracao() throws InterruptedException {
        
        while (true) {
            Scanner entrada = new Scanner(System.in);
            int operacao = 0;
            System.out.println("\nSelecione a operação:");
            System.out.println(
                    "1- Soma            6- Seno\n2- Subtração	   7- Cosseno\n3- Multiplicação   8- Tangente\n4- Divisão         9- Exponenciação\n5- Raiz quadrada   10- Logaritmo");
            System.out.println("0 - Sair");
            try {
                operacao = entrada.nextInt();

                if (operacao < 0 || operacao > 10) {
                    System.out.println("ATENÇÃO, valor inválido!");
                    Thread.sleep(3000);
                    continue;
                }

            } catch (Exception e) {
                System.out.println("ATENÇÃO, valor inválido!");
                Thread.sleep(3000);
                continue;
            }

            if (operacao == 0)
                break;

            LimparTela();
            ObterEntradaERealizaOperacao(entrada, operacao);
        }
    }

    private static void ObterEntradaERealizaOperacao(Scanner entrada, int operacao) throws InterruptedException {

        int soma = 1, divisao = 4, exponenciacao = 9;
        boolean primeiraIteracao = true;
        while (true) {

            String entradaUm = "";
            String entradaDois = "";

            if (primeiraIteracao) {
                entradaUm = entrada.nextLine();
                primeiraIteracao = false;
            }

            entradaUm = ObterValor(entrada, "primeiro");
            if (entradaUm.toUpperCase().equals("SAIR")) {
                LimparTela();
                break;
            }

            if ((operacao >= soma && operacao <= divisao) || operacao == exponenciacao) {
                entradaDois = ObterValor(entrada, "segundo");
                if (entradaDois.toUpperCase().equals("SAIR")) {
                    LimparTela();
                    break;
                }
            }

            float termoUm = 0, termoDois = 0;
            try {
                termoUm = Float.valueOf(entradaUm).floatValue();
                if ((operacao >= soma && operacao <= divisao) || operacao == exponenciacao) {
                    termoDois = Float.valueOf(entradaDois).floatValue();
                }
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
                    ApresenteResultadoDeDoisTermos("soma", termoUm, termoDois, calCientifica);
                    break;

                case 2:
                    calCientifica.subtracao();
                    ApresenteResultadoDeDoisTermos("subtração", termoUm, termoDois, calCientifica);
                    break;

                case 3:
                    calCientifica.multiplicacao();
                    ApresenteResultadoDeDoisTermos("multiplicação", termoUm, termoDois, calCientifica);
                    break;

                case 4:
                    calCientifica.divisao();
                    if (termoDois == 0) break;
                    ApresenteResultadoDeDoisTermos("divisão", termoUm, termoDois, calCientifica);
                    break;

                case 5:
                    calCientifica.raizQuadrada();
                    if (termoUm < 0) break;
                    ApresenteResultadoDeUmTermo("raiz quadrada", termoUm, calCientifica);
                    break;

                case 6:
                    calCientifica.seno();
                    ApresenteResultadoDeUmTermo("operação seno", termoUm, calCientifica);
                    break;

                case 7:
                    calCientifica.cosseno();
                    ApresenteResultadoDeUmTermo("operação cosseno", termoUm, calCientifica);
                    break;

                case 8:
                    calCientifica.tangente();
                    ApresenteResultadoDeUmTermo("operação tangente", termoUm, calCientifica);
                    break;

                case 9:
                    calCientifica.exponenciacao();
                    ApresenteResultadoDeDoisTermos("operação exponenciação", termoUm, termoDois, calCientifica);
                    break;

                case 10:
                    calCientifica.logaritmo();
                    if(termoUm <= 0) break;
                    ApresenteResultadoDeUmTermo("operação Logaritmo", termoUm, calCientifica);
                    break;
            }

        }

    }

    private static void ApresenteResultadoDeDoisTermos(String operacao, Float termoUm, Float termoDois,
            CalculadoraCientifica calCientifica) throws InterruptedException {
        System.out
                .println("A " + operacao + " entre " + termoUm + " e " +
                        termoDois + " é: " + calCientifica.getResultado());
        Thread.sleep(3000);
        LimparTela();
    }

    private static void ApresenteResultadoDeUmTermo(String operacao, Float termo,
            CalculadoraCientifica calCientifica) throws InterruptedException {
        System.out
                .println("A " + operacao + " de " + termo + " é: " + calCientifica.getResultado());
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