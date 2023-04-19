package Target;
import java.util.Scanner;
public class inverte_String {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.print("Digite uma string: ");
	String inverte = s.nextLine();
	String inverterString = inverterString(inverte);
	System.out.println("String invertida: " + inverterString);
		    }
	public static String inverterString(String input) {
		char[] caracteres = input.toCharArray();
		int inicio = 0;
		        int fim = caracteres.length - 1;

		        while (inicio < fim) {
		        
		            char temp = caracteres[inicio];
		            caracteres[inicio] = caracteres[fim];
		            caracteres[fim] = temp;
		            inicio++;
		            fim--;
		        }

		       
		        return new String(caracteres);
		    }
		

}


