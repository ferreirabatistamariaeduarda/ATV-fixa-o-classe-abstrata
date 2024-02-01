public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria, int cilindradas) {
        super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
        this.cilindradas = cilindradas;
    }

    @Override
    public boolean viajar(int distancia) {
        if (getCombustivelNoTanque() >= distancia / 30) {
            setCombustivelNoTanque(getCombustivelNoTanque() - distancia / 30);
            setQuilometragem(getQuilometragem() + distancia);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Moto:" +
                "placa='" + getPlaca() + '\'' +
                ", combustivelNoTanque=" + getCombustivelNoTanque() + '\'' +
                ", quilometragem=" + getQuilometragem() + '\'' +
                ", alugado=" + isAlugado() + '\'' +
                ", precoDiaria=" + getPrecoDiaria() + '\'' +
                ", cilindradas=" + cilindradas + '\'';
    }
}
