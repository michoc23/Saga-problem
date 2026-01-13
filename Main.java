import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les films (tapez 'fin' pour terminer) :");
        ArrayList<String> films = new ArrayList<>();
        while (true) {
            String film = scanner.nextLine();
            if (film.equalsIgnoreCase("fin")) {
                break;
            }
            
            if(film.trim().isEmpty()){
                continue;
            }
            films.add(film);
        }   
        scanner.close();

        Calcul calcul = new Calcul();
        double total = calcul.calculerTotal(films);
        System.out.printf("Le total à payer est : %.2f euros%n", total);
       
    }   
    
}