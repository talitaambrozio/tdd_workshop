package tddworkshop;

import tddworkshop.refatorado.Veiculo;
import tddworkshop.refatorado.VeiculoService;

public class Main {
	
	
	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		VeiculoService veiculoService = new VeiculoService();
		
		
		try {
			veiculo = new Veiculo("Fiat", "Uno");
			veiculoService = new VeiculoService();
			
		} catch (NullPointerException e) {
			System.out.println("Campo não pode ser nulo.");
		}
		
		veiculoService.ligar(veiculo);
		
		
		
	}

}
