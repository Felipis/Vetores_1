package exercicios_vetores;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int a[],i,b=0;
	float media;
	
	a = new int [10];
	
	for(i=0;i<10;i++) {
		System.out.println("Entre com o "+ (i+1)+"� valor:");
		a[i]=ler.nextInt();
		b=b+a[i];
	}
	
	media=b/10;
	
	System.out.println("A med�a dos valores � " +media);
	
	
	ler.close();

	}

}
