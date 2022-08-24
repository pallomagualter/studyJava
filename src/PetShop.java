public class PetShop {
    public static void main(String[] args) {
        Cachorro meuBebe = new Cachorro();
        meuBebe.nome = "Slinky";
        meuBebe.idade= 9;
        meuBebe.raca = "Shih tzu";
        meuBebe.sexo = 'M';

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Kiô";
        cachorro.idade = 3;
        cachorro.raca = "Amor";
        cachorro.sexo = 'F';

        System.out.println("Ficha do Meu Bebê:");
        System.out.println("Nome: " + meuBebe.nome);
        System.out.println("Idade: " + meuBebe.idade + " anos");
        System.out.println("Raça: " + meuBebe.raca);
        System.out.println("Sexo: " + (meuBebe.sexo == 'M' ? "macho" : "fêmea") );
        System.out.println("_____________________________________");

        System.out.println("Ficha do Cachorro:");
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade + " anos");
        System.out.println("Raça: " + cachorro.raca);
        System.out.println("Sexo: " + (cachorro.sexo == 'M' ? "macho" : "fêmea") );
        System.out.println("_____________________________________");
    }
}
