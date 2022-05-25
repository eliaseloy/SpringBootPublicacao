package springboot.publicacao;

import java.util.Arrays;

@RestController
public class PublicacaoController 
{
	@RequestMapping("/publicacao")
	public List<Publicacao> restPublicacao()
	{
		
		Publicacao publi0 = new Publicacao("Records","Demonstracao de records no Java 14+", "Java");
		Publicacao publi1 = new Publicacao("Optionals","Utilizando Optionals Java 8+","Java");
		Publicacao publi2 = new Publicacao("Generics","Demonstracao de Generics","Java");
		Publicacao publi3 = new Publicacao("JDBC","DConexÃ£o simples com JDBC","Java");
		Publicacao publi4 = new Publicacao("Consumo API","Consumindo API de campio com cliente HTTP e Json","Java");
		
		return Arrays.asList(publi0,publi1,publi2,publi3,publi4);
	}
}
