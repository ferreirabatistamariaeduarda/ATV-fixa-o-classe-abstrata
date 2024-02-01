public class Carro extends Veiculo {

    private double potenciaDoMotor;

    public Carro(String placa, int combustivelNoTanque, int quilometragem, boolean alugado, double precoDiaria, double potenciaDoMotor) {
        super(placa, combustivelNoTanque, quilometragem, alugado, precoDiaria);
        this.potenciaDoMotor = potenciaDoMotor;
    }

    @Override
    public String toString() {
    return "Carro{" +
            "placa='" + getPlaca() + '\'' +
            ", combustivelNoTanque=" + getCombustivelNoTanque() +
            ", quilometragem=" + getQuilometragem() +
            ", alugado=" + isAlugado() +
            ", precoDiaria=" + getPrecoDiaria() +
            ", potenciaDoMotor=" + potenciaDoMotor +
            '}';
}

    @Override
    public boolean viajar(int distancia) {
        if (getCombustivelNoTanque() >= distancia / 10) {
            setCombustivelNoTanque(getCombustivelNoTanque() - distancia / 10);
            setQuilometragem(getQuilometragem() + distancia);
            return true;
        }
        return false;
    }
}



