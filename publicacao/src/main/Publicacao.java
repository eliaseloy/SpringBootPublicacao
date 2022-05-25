package springboot.publicacao;

public class Publicacao 
{
	private String nome;
	private String resumo;
	private String categoria;
	
	public Publicacao(String nome, String resumo, String categoria)
	{
		this.nome = nome;
		this.resumo = resumo;
		this.categoria = categoria;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getResumo()
	{
		return resumo;
	}

	public String getCategoria()
	{
		return categoria;
	}

}
