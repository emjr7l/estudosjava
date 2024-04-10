package estudosjava.variaveis;

public class Variaveis {

	public static void main(String[] args) {
		
		//Em Java temos 8 tipos primitivos de variáveis
		
		//tipos primitivos de verdade sao os boolean, com valores true ou false
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println("Legítimos Primitivos, são os boolean!");
		System.out.println("Seus valores podem ser: " +verdadeiro +" ou " +falso);
		
		byte maxnegativobyte = -128;
		byte maxpositivobyte = 127;
		
		System.out.println("Variáveis byte como o nome diz, ocupam 01 byte de memórria");
		System.out.println("Aceitam valores inteiros entre " +maxnegativobyte +" e " +maxpositivobyte);
		
		short maxnegativoshort = -32768;
		short maxpositivoshort = 32767;
		
		System.out.println("Variáveis short ocupam 02 bytes de memórria");
		System.out.println("Aceitam valores inteiros entre " +maxnegativoshort +" e " +maxpositivoshort);
	}

}
