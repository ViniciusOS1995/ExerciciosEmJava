package br.alura;

import br.alura.operacoesAri.ExceciciosDois;
import br.alura.operacoesAri.OperacaoAritimetica;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        var opAritimetica = new OperacaoAritimetica();
        var exercicio2 = new ExceciciosDois();
        Scanner digite = new Scanner(System.in);

        System.out.println("Qual é o seu nome?\n");
        String nome = digite.next();

        System.out.println("Olá! " + nome);
        System.out.println("Tudo nem com você?");

        System.out.println("Agora vamos realizar alguma operação aritimética");
        System.out.println("Você deseja realizar uma soma ou uma subtração ?\n");
        System.out.println("Digite '1' para soma e '2' para subtração: ");
        int opc = digite.nextInt();
        if (opc == 1){
            opAritimetica.soma();
        }if (opc == 2){
            opAritimetica.subtracao();
        }else {
            System.out.println("Você digitou um caracter errado, finalizando programa!\n");
        }

        System.out.println("Media de Notas:"+exercicio2.calculaMedia()+"\n");

        System.out.println("Valor de 4 Caixas de chocolate: "+ exercicio2.calculaValor()+"\n");

        System.out.println("Valor da Caixa de chocolate em dolares: " + exercicio2.valorEmDolar()+"\n");

        System.out.println("Valor da Caixa de chocolate com desconto: " + exercicio2.desconto()+"\n");

    }
}