package mesuracargol;

import java.util.Scanner;

public class MesurarCargol {

	public static void main(String[] args) {
		 Scanner ller = new Scanner(System.in);
	        
	        System.out.println("Introdueix la mesura del cargol: ");
	        int mesura = ller.nextInt(); 
	        
	        switch (mesura) {
	        case 1:
            case 2:
            	 System.out.println("petit");
                 break;
            case 3:
            case 4:
            	System.out.println("mitjà");
                break;
            case 5:
            case 6:
            case 7:
            	System.out.println("gran");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("molt gran");
                break;
            default:
                System.out.println("mida incorrecta");
	        }
	        ller.close();
	}
}