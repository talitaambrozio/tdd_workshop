package tddworkshop.refatorado;

public class VeiculoService {

	//exemplo sobre nomes intuitivos de funções
	// narrativa
	//pouco parâmetro
	//validações extraídas para outras funções
	//setar o valor só depois de fazer todo o tratamento
	//nome de booleano ser uma resposta 
	//indentação
	public void ligar(Veiculo veiculo) {

		if (estaLigado(veiculo))
			throw new RuntimeException("Veículo já está ligado.");

		veiculo.setLigado(true);
	}

	public void desligar(Veiculo veiculo) {
		if (!estaLigado(veiculo))
			throw new RuntimeException("Veículo já está desligado.");

		if (veiculo.getVelocidade() != 0) {
			throw new RuntimeException("Não é possível desligar o veículo com velocidade acima de zero.");
		}
		veiculo.setLigado(false);

	}

	public void acelerar(Veiculo veiculo) {
		if (!estaLigado(veiculo)) 
			throw new RuntimeException("Veículo está desligado.");

		veiculo.setVelocidade(veiculo.getVelocidade() + 20);
	}

	private boolean estaLigado(Veiculo veiculo) {
		if (veiculo.isLigado()) {
			return true;
		}
		return false;
	}

}
