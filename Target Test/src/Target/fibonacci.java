package Target;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("informe um número e direi se ele pertence a sequência de Fibonacci ou não");
		int numeroInformado= s.nextInt();
		int fibo=2;
		int aux=1;
		int aux1=0;
		
		for (int i=0; i<999999; i++) {
			aux1=fibo;
			fibo+=aux;
			aux=aux1;
			if (fibo==numeroInformado) {
				System.out.println("PERTENCE");
				break;
			}else if (fibo>numeroInformado) {
				System.out.println("NÃO PERTENCE");
				break;
			}
			if(numeroInformado==fibo || numeroInformado == aux ||numeroInformado==0) {
				System.out.println("PERTENCE");
				break;
		}
		}
	}
}


