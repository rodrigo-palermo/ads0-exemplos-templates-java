/*
 * https://www.dotnetperls.com/format-java
 * 
 * INTEGER TO STRING
 * There are multiple ways:

   * String.valueOf(number) (my preference)
   * "" + number (I don't know how the compiler handles it, perhaps it is as efficient as the above)
   * Integer.toString(number)

 */
public class Exemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo, codigoFormatado, nome, codigoNumFormatado;
		int codigoNum = 1234;
		double valor = 500.2356;
		
		codigo = "123A";
		nome = "Linux";
		codigoFormatado = String.format("Codigo (String nao aceita pad com caracteres): %1$10s - S.O.: %2$s - Valor: R$ %3$.2f", codigo, nome, valor);
		codigoNumFormatado = String.format("Codigo Numerico (somente pad com '0'): %1$010d", codigoNum);
		
		System.out.println(codigo);
		System.out.println(codigoFormatado);
		System.out.println(codigoNumFormatado);

	}

}
