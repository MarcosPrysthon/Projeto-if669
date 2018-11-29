package excecoes;

public class HamburguerExistenteException extends Exception{
	public HamburguerExistenteException() {
		super("Esse hamburguer ja existe.");
	}
}
