package exercicios_vetores;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b=0, i;
		
		a = new int[10];
		
		
		for(i=0;i<10;i++) {
			System.out.println("Entre com o "+ (i+1)+"º valor:");
			a[i]=ler.nextInt();
			}
		
		System.out.print("Vetor A = " );
		for(i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Vetor B = " );
		for(i=0;9<10;i++) {
			b = a[9-i];
			System.out.print(b+" ");
		}

	}

}
