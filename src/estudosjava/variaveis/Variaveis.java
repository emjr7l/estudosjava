package estudosjava.variaveis;

public class Variaveis {

	public static void main(String[] args) {
		
		//Em Java temos 8 tipos primitivos de variáveis
		
		//tipos primitivos de verdade sao os boolean, com valores true ou false
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("Legítimos Primitivos, são os boolean!");
		System.out.println("Seus valores podem ser: " +verdadeiro +" ou " +falso);
		System.out.println(" ");
		
		byte maxnegativobyte = -128;
		byte maxpositivobyte = 127;
		
		System.out.println("Variáveis byte como o nome diz, ocupam 01 byte, ou 08 bits de memória");
		System.out.println("Aceitam valores inteiros entre " +maxnegativobyte +" e " +maxpositivobyte);
		System.out.println(" ");
		
		short maxnegativoshort = -32768;
		short maxpositivoshort = 32767;
		
		System.out.println("Variáveis short ocupam 02 bytes, ou 16 bits de memória");
		System.out.println("Aceitam valores inteiros entre " +maxnegativoshort +" e " +maxpositivoshort);
		System.out.println(" ");
		
		int maxnegativoint = -2147483648;
		int maxpositivoint = 2147483647;
		
		System.out.println("Variáveis int ocupam 04 bytes, ou 32 bits de memória");
		System.out.println("Aceitam valores inteiros entre " +maxnegativoint +" e " +maxpositivoint);
		System.out.println(" ");
		
		long maxnegativolong = -9223372036854775808l;
		long maxpositivolong = 9223372036854775807l;
		
		System.out.println("Variáveis long ocupam 08 bytes, ou 64 bits de memória");
		System.out.println("Aceitam valores inteiros entre " +maxnegativolong +" e " +maxpositivolong);
		System.out.println(" ");
	}

}
