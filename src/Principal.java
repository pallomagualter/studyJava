public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.anoDeFabricacao = 2011;
        carro1.cor = "prata";
        carro1.fabricante = "FIAT";
        carro1.modelo = "Palio";
        carro1.biCombustivel = false;
        carro1.dono = new Proprietario();
        carro1.dono.nome = "Zé da Silva";
        carro1.dono.bairro = "Centro";

        Carro carro2 = new Carro();
        carro2.anoDeFabricacao = 2022;
        carro2.cor = "vermelho";
        carro2.modelo = "CRETA";
        carro2.fabricante = "HYUNDAI";
        carro2.biCombustivel = true;
        carro2.dono = new Proprietario();
        carro2.dono.nome = "Palloma Gualter";
        carro2.dono.bairro = "Bela Vista";

        System.out.println("Informações do Carro 1:");
        System.out.println("Dono: " + carro1.dono.nome);
        System.out.println("Bairro: " + carro1.dono.bairro);
        System.out.println("Ano de fabricação: " + carro1.anoDeFabricacao);
        System.out.println("Cor: " + carro1.cor);
        System.out.println("Fabricante: " + carro1.fabricante);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("_____________________________________");

        System.out.println("Informações do Carro 2:");
        System.out.println("Dono: " + carro2.dono.nome);
        System.out.println("Bairro: " + carro2.dono.bairro);
        System.out.println("Ano de fabricação: " + carro2.anoDeFabricacao);
        System.out.println("Cor: " + carro2.cor);
        System.out.println("Fabricante: " + carro2.fabricante);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("_____________________________________");

        carro2.ligar();

    }
}
