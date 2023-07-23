package br.com.alura.banheiro;

public class TarefaNumero4 {
	
	private Banheiro banheiro;

	public TarefaNumero4(Banheiro banheiro) {
		this.banheiro = banheiro;
	}

	@Override
	public void run() {
		this.banheiro.fazNumero4();
	}

}
