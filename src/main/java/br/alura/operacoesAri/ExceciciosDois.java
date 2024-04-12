package br.alura.operacoesAri;

public class ExceciciosDois {
    private int nota1 = 10;
    private double nota2 = 8.54;
    private int media;

    private int quant = 4;
    private double valor = 11.68;
    private double valorTotal;

    private double cotacaoDolar = 4.95;
    private double conversaoDolar;

    private double valorDesconto;

    public int calculaMedia(){

        media = (int) ((nota1 + nota2)/2);
        return media;
    }

    public double calculaValor(){
        valorTotal = quant * valor;
        return valorTotal;
    }

    public double valorEmDolar(){
        conversaoDolar = valor / cotacaoDolar;
        return conversaoDolar;
    }

    public double desconto(){
        valorDesconto = valor * .9;
        return valorDesconto;
    }
}
