package exercicios_vetores;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int a[],i,b=0;
	float media;
	
	a = new int [10];
	
	for(i=0;i<10;i++) {
		System.out.println("Entre com o "+ (i+1)+"º valor:");
		a[i]=ler.nextInt();
		b=b+a[i];
	}
	
	media=b/10;
	
	System.out.println("A medía dos valores é " +media);
	
	
	ler.close();

	}

}
