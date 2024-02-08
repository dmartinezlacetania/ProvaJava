package horaridetreball;
import java.util.Scanner;

public class HorariDeTreball {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introdueix una hora (0-23): ");
        int hora = scanner.nextInt(); 
        
        if (hora>=0 && hora<=23) {
        	if (hora>9 && hora<17) {
            	System.out.println("Treball");
            }else {
            	System.out.println("Temps lliure");
            }
        } else {
        	System.out.println("Error: Hora fora del rang.");
        }   
        scanner.close();
	}
}
