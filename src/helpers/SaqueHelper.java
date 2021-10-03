package helpers;

import javax.swing.JOptionPane;

import models.Nota;

public class SaqueHelper {

	public String mensagemDeSaque;
	
	private Nota notaDeDez = new Nota(10.0, "R$10.00");
	private Nota notaDeVinte = new Nota(20.0, notaDeDez, "R$20.00");
	private Nota notaDeCinquenta = new Nota(50.0, notaDeVinte, "R$50.00");
	private Nota notaDeCem = new Nota(100.0, notaDeCinquenta, "R$100.00");

	//Helper auxiliar para execução do saque
	public String efetuaSaque(Double valorDoSaque){
		
		Double valorSaqueMutavel = valorDoSaque;
		
		while(valorSaqueMutavel > 0) {
			valorSaqueMutavel = notaDeCem.sacarValor(valorSaqueMutavel);			
		}
		
		Nota[] notas = new Nota[] {notaDeCem, notaDeCinquenta, notaDeVinte, notaDeDez};
		
		mensagemDeSaque = "Obrigado por utilizar nosso sitema.\n Você sacou: \n"; 
		
		for (Nota nota: notas) {
			if (nota.getQuantidade() > 0) mensagemDeSaque += nota.getMensagem() + "\n" ;
		}
		
		return mensagemDeSaque + "\nTotal do saque: R$" + valorDoSaque + "\n";
	}
	
	//Método executado caso o saque seja inválido, assim perguntado se deseja um valor válido
	public String verificaValor(Double valorDoSaque) {
		
		Double valorValido;
		if (valorDoSaque > 10) valorValido = valorDoSaque + (10 - (valorDoSaque % 10));
		else valorValido = 10.0;
		
		int confirmaSaqueComValorValido = JOptionPane.showConfirmDialog(null, 
				"Não há notas disponíveis para sacar R$" + valorDoSaque + "."+ "\nDeseja sacar R$" + valorValido  
				+ "?", "Valor de saque inválido",JOptionPane.YES_NO_OPTION);
		
		if (confirmaSaqueComValorValido == 0) mensagemDeSaque = this.efetuaSaque(valorValido);
		else mensagemDeSaque = "Obrigado pela paciência. \nVolte sempre!";
	
		return mensagemDeSaque;
	}
	
	
}
