package practico;

import java.util.Arrays;
import java.util.Scanner;



public class EjerPractico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int menu=0, ncomensales;
	
	
		System.out.println("*--------------------------*");
		System.out.println("*        Restaurante       *");
		System.out.println("* 1. Crear orden           *");
		System.out.println("* 2. Modificar orden       *");
		System.out.println("* 3. Salir                 *");
		System.out.println("*--------------------------*");
		System.out.print("Eliga una opcion: ");
		menu=entrada.nextInt();
		switch (menu) {
		case 1->{
		System.out.println("1.Crear orden");
		System.out.println("Cuantos comensales hay: ");
		ncomensales=entrada.nextInt();	
		int orden[]= new int [ncomensales];
		for(int i=0;i<ncomensales;i++) {
			System.out.println("*-------------------------------------------*");
			System.out.println("              MENÚ                           ");
			System.out.println("  [1] Patatas fritas con albóndigas          ");
			System.out.println("  [2] Salmón ahumado con patatas horneadas   ");
			System.out.println("  [3] Lentejas con chorizo                   ");
			System.out.println();
			System.out.println("Indica el menú elegido ");
			orden[i]=entrada.nextInt();
			
		}
		System.out.println("La orden es: "+Arrays.toString(orden));
		
		
		}
		case 2->{
		System.out.println("2.Modificar orden");
		System.out.println("¿Quieres modificar la orden?\n 1.Si 2.No");
	
		}

		case 3->{
		System.out.println("3.Salir");
		System.out.println("Su orden sera llevada a la mesa pronto");
	
		}

		}
	
	}
}


	
			
			
		
				
				
				
			
			
	
		

	


		
		
		
		
		
		
	


