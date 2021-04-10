package entidade;

import java.util.List;

public class RetornoSorvete {
	
	private Sorvete retornoSorvete;
	private String retornoMensagem;
	private List<Sorvete> retornoLista;
	


	public Sorvete getRetornoSorvete() {
		return retornoSorvete;
	}
	public void setRetornoSorvete(Sorvete retornoSorvete) {
		this.retornoSorvete = retornoSorvete;
	}
	public String getRetornoMensagem() {
		return retornoMensagem;
	}
	public void setRetornoMensagem(String retornoMensagem) {
		this.retornoMensagem = retornoMensagem;
	}
	public List<Sorvete> getRetornoLista() {
		return retornoLista;
	}
	public void setRetornoLista(List<Sorvete> retornoLista) {
		this.retornoLista = retornoLista;
	}
	
	

}
