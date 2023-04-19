package Target;

public class faturamento_diario {

	public static void main(String[] args) {
	double vet[] = new double[30];
	vet[0]=22174.1664;
	vet[1]=24537.6698;
	vet[2]=26139.6134;
	vet[3]=0.0;
	vet[4]=0.0;
	vet[5]=26742.6612;
	vet[6]=0.0;
	vet[7]=42889.2258;
	vet[8]= 46251.174;
	vet[9]=11191.4722;
	vet[10]=0.0;
	vet[11]=0.0;
	vet[12]=3847.4823;
	vet[13]=373.7838;
	vet[14]=2659.7563;
	vet[15]=48924.2448;
	vet[16]=18419.2614;
	vet[17]=0.0;
	vet[18]=0.0;
	vet[19]=35240.1826;
	vet[20]=43829.1667;
	vet[21]=18235.6852;
	vet[22]=4355.0662;
	vet[23]=13327.1025;
	vet[24]=0.0;
	vet[25]=0.0;
	vet[26]=25681.8318;
	vet[27]=1718.1221;
	vet[28]=13220.495;
	vet[29]=8414.61;
	double maior=0;
	double menor =vet[0];
	int dias_ignorados=0;
	double soma=0;
	int superior_media=0;
	for (int i=0; i<30; i++) {
		soma+=vet[i];
		if (vet[i] > maior) {
			maior = vet[i];
		}
		if (vet[i]< menor && vet[i]!=0) {
			menor = vet[i];
		}
		if (vet[i]==0.0) {
			dias_ignorados+=1;
		}
	}double media = (30-dias_ignorados)/soma;
	for (int j=0; j<30; j++) {
		if (vet[j]>media) {
			superior_media+=1;
		}
	
	}
	
	System.out.println("Maior valor ocorrido em um mês é de: " + maior);
	System.out.println("Menor valor ocorrido em um mês (ignorando os fins de semana) é de: " + menor);
	System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + superior_media);
	}
}

