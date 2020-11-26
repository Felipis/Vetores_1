package exercicios_vetores;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int a[], b[], c[], i,j=0;
	
	a = new int[10];
	b = new int[10];
	c = new int[10];
	
	for(i=0;i<10;i++) {
		System.out.println("Entre com o "+ (i+1)+ "º valor A");
		a[i] = ler.nextInt();
	}
	
	for(i=0;i<10;i++) {
		System.out.println("Entre com o "+ (i+1)+ "º valor B");
		b[i] = ler.nextInt();
		c[j] = a[i] + b[i];
		j++;
	}
	
	System.out.print("Vetor A = " );
	for(i=0;i<10;i++) {
		System.out.print(a[i]+" ");
	}
	
	System.out.println();
	
	System.out.print("Vetor B = " );
	for(i=0;i<10;i++) {
		System.out.print(b[i]+" ");
	}
	System.out.println();
	
	System.out.print("Vetor c = " );
	for(i=0;i<10;i++) {
		System.out.print(c[i]+" ");
	}
	

	
	ler.close();

	}

}
