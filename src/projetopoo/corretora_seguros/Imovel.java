package projetopoo.corretora_seguros;

public class Imovel implements Seguravel {
    private double valorMercado;
    private int areaConstruida;

    public  Imovel (double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }
    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.03;
        valorApolice = valorApolice + (areaConstruida * 0.05);
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Imóvel com área construída de " + this.areaConstruida + "m² e valor de mercado " + this.valorMercado;
    }
}
