package TesteSorvete;

import controller.sorveteImpl;
import entidade.RetornoSorvete;
import entidade.Sorvete;

public class Teste extends RetornoSorvete {

	public static void main(String[] args) {
		
		sorveteImpl siml = new sorveteImpl();
		
		Sorvete svt = new Sorvete();
		
		svt.setCodigo("001");
		svt.setSabor("Chocolate");
		svt.setTipo("Bola");
		svt.setValor(1.5);
		
		
		siml.inserir(svt);
		Sorvete svt2 = new Sorvete();
		
		svt2.setCodigo("002");
		svt2.setSabor("Morango");
		svt2.setTipo("Bola");
		svt2.setValor(1.7);
		
		siml.inserir(svt2);
		//siml.deletar(svt);
		//siml.listarTodos();
		
		//siml.pesquisar(svt);
		siml.listarTodos();
		
	}

}
