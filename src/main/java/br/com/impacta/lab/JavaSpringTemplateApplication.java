package br.com.impacta.lab;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(10, 1, "CC");
		Conta cp = new ContaPoupanca(5, 12, "CP");
		
		System.out.println(cc.montarResumoDaConta());
		System.out.println(cp.montarResumoDaConta());
	}

}
