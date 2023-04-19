package Target;
import java.util.Scanner;
public class faturamento_distruibuidora {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	double Sao_Paulo = 67.83643;
	double Rio_Janeiro = 36.67866;
	double Minas_Gerais= 29.22988;
	double Esp_Santo = 27.16548;
	double Outros =19.84953;
	double percent=0;
	double soma = Sao_Paulo + Rio_Janeiro + Minas_Gerais + Esp_Santo + Outros;
	System.out.println("Deseja checar qual a percentual de representação de qual estado? (digite de acordo com o número)");
	System.out.println("1 -SP  2-RJ 3-MG 4-ES 5-Outros");
	int resp=s.nextInt();
	switch(resp) {
	case 1:
		percent = ((Sao_Paulo *100)/soma);
		System.out.println("O PERCENTUAL É DE:" + percent);
		System.out.println("DESEJA CONSULTAR MAIS ALGUM?");
		System.out.println("1 -SP  2-RJ 3-MG 4-ES 5-Outros");
		percent=0;
		resp=s.nextInt();
	case 2:
		percent = ((Rio_Janeiro *100)/soma);
		System.out.println("O PERCENTUAL É DE:" + percent);
		System.out.println("DESEJA CONSULTAR MAIS ALGUM?");
		System.out.println("1 -SP  2-RJ 3-MG 4-ES 5-Outros");
		percent=0;
		resp=s.nextInt();
	
	case 3:
		percent = ((Minas_Gerais *100)/soma);
		System.out.println("O PERCENTUAL É DE:" + percent);
		System.out.println("DESEJA CONSULTAR MAIS ALGUM?");
		System.out.println("1 -SP  2-RJ 3-MG 4-ES 5-Outros");
		percent=0;
		resp=s.nextInt();
	case 4:
		percent = ((Esp_Santo *100)/soma);
		System.out.println("O PERCENTUAL É DE:" + percent);
		System.out.println("DESEJA CONSULTAR MAIS ALGUM?");
		System.out.println("1 -SP  2-RJ 3-MG 4-ES 5-Outros");
		percent=0;
		resp=s.nextInt();
	case 5:
		percent = ((Outros *100)/soma);
		System.out.println("O PERCENTUAL É DE:" + percent);
		System.out.println("DESEJA CONSULTAR MAIS ALGUM?");
		System.out.println("1 -SP  2-RJ 3-MG 4-ES 5-Outros");
		percent=0;
		resp=s.nextInt();
	
	}
	}

}
