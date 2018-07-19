
public class Principal {

	static String[] arrayStrings = new String[10];

	public static void main(String[] args) {
		System.out.println(arrayStrings[0]); // out: null

		verificacoes();

		arrayStrings[5] = "item";

		verificacoes();

	}

	private static void verificacoes() {
		System.out.println("Completo 1 (order): " + arrayStringCompleto1());
		System.out.println("Completo 2: " + arrayStringCompleto2());
		System.out.println("Posicao disponivel: " + arrayStringPosicaoDisponivel());
		System.out.println("Vazio 1 (order) : " + arrayStringVazio1());
		System.out.println("Vazio 2 (order) : " + arrayStringVazio2());

	}

	// VERIFICA SE ARRAY ESTA COMPLETO - OPCAO 1 (preenchimento ORDER ASC)
	private static boolean arrayStringCompleto1() {
		if (arrayStrings[arrayStrings.length - 1] != null)
			return true;
		return false;
	}// ---------------------------------------------

	// VERIFICA SE ARRAY ESTA COMPLETO - OPCAO 2 (preenchimento RANDOM)
	private static boolean arrayStringCompleto2() {
		for (int i = 0; i < arrayStrings.length; i++)
			if (arrayStrings[i] == null)
				return false;
		return true;
	}// --------------------- ------------------------

	// RETORNA PRIMEIRA POSICAO LIVRE PARA CADASTRAR (AUTO RESTART)
	// (para evitar AUTO RESTART, usar metodo que verifica se esta COMPLETO)
	private static int arrayStringPosicaoDisponivel() {
		for (int i = 0; i < arrayStrings.length; i++)
			if (arrayStrings[i] == null)
				return i;
		return 0;
	}// --------------------- ------------------------

	// VERIFICA SE ARRAY VAZIO - OPCAO 1 - (preenchimento ORDER ASC)
	private static boolean arrayStringVazio1() {
		if (!arrayStringCompleto2() && arrayStringPosicaoDisponivel() == 0)
			return true;
		return false;
	}// --------------------- ------------------------

	// VERIFICA SE ARRAY VAZIO - OPCAO 2 - (preenchimento RANDOM)
	private static boolean arrayStringVazio2() {
		for (int i = 0; i < arrayStrings.length; i++)
			if (arrayStrings[i] != null)
				return false;
		return true;

	}// --------------------- ------------------------

}// end of class
