package controller;

import entidade.RetornoSorvete;
import entidade.Sorvete;

public interface sorveteController {
	
	public RetornoSorvete inserir (Sorvete sorvete);
	
	public RetornoSorvete alterar (Sorvete sorvete);
		
	public RetornoSorvete deletar (Sorvete codigo);
	
	public RetornoSorvete pesquisar (Sorvete codigo);

	public RetornoSorvete listarTodos (Sorvete sorvete);

	
}
