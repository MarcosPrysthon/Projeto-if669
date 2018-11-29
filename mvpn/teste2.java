package mvpn;
import excecoes.*;
public class teste2 {

	public static void main(String[] args) throws HamburguerExistenteException, HamburguerInexistenteException{
		
		RepositorioHamburguersArray rep = new RepositorioHamburguersArray();
		NegociosHamburguers neg = new NegociosHamburguers(rep);
		Hamburguer hamb = new Hamburguer ("bigmac", 10);
		
		neg.inserir(hamb);
		System.out.println(neg.procurar("bigmac").getNome());
		System.out.println(neg.procurar("bigmac").getPreco() + "\n");
		
		neg.atualizar("bigmac", "Robson", 1000);
		System.out.println(neg.procurar("Robson").getNome());
		System.out.println(neg.procurar("Robson").getPreco() + "\n");
		
		neg.remover("Robson");
		neg.procurar("Robson");
	}

}
