package mvpn;
import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

import excecoes.*;
public class Teste {

	public static void main(String[] args) throws HamburguerExistenteException, HamburguerInexistenteException {
		Scanner in = new Scanner(System.in);
		
		RepositorioHamburguersLista rep = new RepositorioHamburguersLista();
		NegociosHamburguers negocio = new NegociosHamburguers(rep);
		Hamburguer hamb = new Hamburguer("bigmac", 10);
		negocio.inserir(hamb);
		
		Hamburguer hamb2 = negocio.procurar("bigmac");
		
		negocio.atualizar("bigmac", "cheddar", 15);
		
		Hamburguer hamb3 = negocio.procurar("cheddar");
		System.out.println(hamb3.getNome());
		System.out.println(hamb3.getPreco());
		
		
		
		
		
		
		
		
		
		
	}
}
