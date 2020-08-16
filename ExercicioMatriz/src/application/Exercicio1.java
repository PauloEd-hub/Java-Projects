package application;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("System.in");
		
		int m = sc.nextInt();
		int n= sc.nextInt();
		
		int[][]  matriz = new int[m][n];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j] = sc.nextInt();		
				}
			
		}
		int x = sc.nextInt();
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz.length; j++) {
				if(matriz[i][j] == x) {
					System.out.print("Position" + i + "," + j + ":");
				}
				if(j>0) {
					System.out.print("Left:"  + matriz[i][j-1]);
				}
				if(i>0) {
					System.out.print("Up:" + matriz[i][j]);
				}
				if (j < matriz[i].length-1) {
					System.out.println("Right: " + matriz[i][j+1]);
				}
				if (i < matriz.length-1) {
					System.out.println("Down: " + matriz[i+1][j]);
			}
		}

	}
	
  }
}
