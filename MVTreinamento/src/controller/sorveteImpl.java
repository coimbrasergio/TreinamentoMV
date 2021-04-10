package controller;

import java.util.ArrayList;
import java.util.List;

import entidade.RetornoSorvete;
import entidade.Sorvete;

public class sorveteImpl implements sorveteController{
	
	private List<Sorvete> lista;


	public sorveteImpl() {
		this.lista = new ArrayList<Sorvete>();
	}



	@Override
	public RetornoSorvete inserir(Sorvete sorvete) {
			boolean existe = false;
			for (Sorvete s : lista) {
				if (s.equals(sorvete)) {
					existe = true;
				}
				
			}
			
			RetornoSorvete rs = new RetornoSorvete();
			 if (!existe) {
				 lista.add(sorvete);
				 rs.setRetornoMensagem("Sorvete Adicionado!");
				 rs.setRetornoSorvete(sorvete);
				 System.out.println(rs.getRetornoMensagem());
			}else {
				rs.setRetornoMensagem("Erro! Sorvete já Existe");
				System.out.println(rs.getRetornoMensagem());
			}
			 
			 	return rs;
	}

	@Override
	public RetornoSorvete alterar(Sorvete sorvete) {
		RetornoSorvete rs = new RetornoSorvete();
		
			for (Sorvete s : lista) {
				if (s.equals(sorvete)) {
					s.setCodigo(sorvete.getCodigo());
					s.setSabor(sorvete.getSabor());
					s.setTipo(sorvete.getTipo());
					s.setValor(sorvete.getValor());
					rs.setRetornoSorvete(s);
					rs.setRetornoMensagem("Sorvete Alterado com Sucesso!");
					System.out.println(rs.getRetornoMensagem());
					
					
				}
			}
				if (rs.getRetornoSorvete()==null) {
					rs.setRetornoMensagem("Sorvete n�o Encontrado");
					System.out.println(rs.getRetornoMensagem());
					
					
				}
		
					return rs;
	}

	@Override
	public RetornoSorvete deletar(Sorvete codigo) {
			Sorvete existe = null;
				for (Sorvete s : lista) {
					 if (s.equals(codigo)){
						 existe = s;
					}
				}
				 RetornoSorvete rs = new RetornoSorvete();
				 	if (existe != null) {
				 		lista.remove(existe);
				 		rs.setRetornoMensagem("Sorvete Exclu�do com Sucesso!");
				 		System.out.println(rs.getRetornoMensagem());
				 		
					}else {
						rs.setRetornoMensagem("Sorvete n�o Existe!");
						System.out.println(rs.getRetornoMensagem());
								
					}
				 
				 		return rs;
	}

	@Override
	public RetornoSorvete pesquisar(Sorvete sorvete) {
			Sorvete existe = null;
			for (Sorvete s : lista) {
				if (s.equals(sorvete)) {
					existe = s;
					
				}
			}
				RetornoSorvete rs = new RetornoSorvete();
	
				 if (existe !=null) {
					 rs.setRetornoSorvete(existe);
					 rs.setRetornoMensagem("Sorvete Encontrado");
					 System.out.println(rs.getRetornoMensagem());
					 System.out.println("Código: " + existe.getCodigo() + " - " + " Sabor: " + existe.getSabor() + " - " + "Tipo: " + existe.getTipo() + " - " + "Valor: "+ existe.getValor());
					
				}else {
					 rs.setRetornoMensagem("Sorvete n�o Encontrado");
					 System.out.println(rs.getRetornoMensagem());
				}
				
				 	return rs;
	}


	@Override
	public RetornoSorvete listarTodos() {
		for (Sorvete s : lista) {
			System.out.println("Código.....: " + s.getCodigo() + "\n");
			System.out.println("Sabor.....: " + s.getSabor() + "\n");
			System.out.println("Tipo.....: " + s.getTipo() + "\n");
			System.out.println("Valor.....: " + s.getValor() + "\n");
		
	}
		return null;
			
	}


	}

			
					
	
	
	


