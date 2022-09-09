package projetopoo.corretora_seguros;

public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros corretora = new CorretoraSeguros();

        Carro carro = new Carro(67000.00, 2022);
        Imovel imovel = new Imovel(377000.50, 350);

        corretora.fazerPropostaSeguro(carro);
        corretora.fazerPropostaSeguro(imovel);
    }
}
