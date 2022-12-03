package tddworkshop.antesrefatoracao;


public class VeiculoService {

	public void acelerar(Veiculo veiculo) {
		if (veiculo.isLigado()) {
			 veiculo.setVel(veiculo.getVel() + 20);
		} else {
			throw new RuntimeException("Veículo está desligado.");
		}
	}
	
	public void ligar(Veiculo veiculo) {
		if (!veiculo.isLigado()) {
			veiculo.setLigado(true);
		} else
			throw new RuntimeException("Veículo já está ligado.");
	}

	public void desligar(Veiculo veiculo) {
		if(veiculo.isLigado()) {
			if(veiculo.getVel()==0) {
				veiculo.setLigado(false);
			}else {
				throw new RuntimeException("Não é possível desligar o veículo com velocidade acima de zero.");
			}
		}else {
			throw new RuntimeException("Veículo já está desligado.");
		}
		
	}
}
