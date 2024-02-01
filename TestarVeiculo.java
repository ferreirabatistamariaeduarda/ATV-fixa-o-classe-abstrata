public class TestarVeiculo {

    public static void main(String[] args) {

        // Criação de um objeto Moto
        Moto moto = new Moto("ABC1234", 10, 0, false, 50.0, 150);

        // Criação de um objeto Carro
        Carro carro = new Carro("DEF5678", 20, 0, true, 100.0, 2.0);

        // Teste do método viajar() para Moto
        System.out.println("Viagem de moto (100km): " + moto.viajar(100));
        System.out.println("Moto após viagem: '\\'' + " + moto.toString());

        // Teste do método viajar() para Carro
        System.out.println("Viagem de carro (150km): " + carro.viajar(150));
        System.out.println("Carro após viagem: " + carro.toString());

        // Teste do método abastecer() para Moto
        moto.abastecer(5);
        System.out.println("Combustível na moto após abastecimento: " + moto.getCombustivelNoTanque());

        // Teste do método equals()
        System.out.println("Moto e carro possuem a mesma placa? " + moto.equals(carro));
    }
}

