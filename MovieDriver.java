import java.util.Scanner;
/**
 * 
 * @author vanessa （Xiaozi Wang)
 */
public class MovieDriver {
	public static void main(String[] args) {
		
		String title, rating;
		int soldTickets;
		char answer = 0;     //prepare answer "yes" or "no"
		
		do {
			Scanner input = new Scanner(System.in);
			//prompt the user to enter the informations
			System.out.println("Enter the name of a movie");
			title = input.nextLine();
			
			System.out.println("Enter the rating of the movie");
			rating =  input.nextLine();
			
			System.out.println("Enter the number of tickets sold for this movie");
			soldTickets = input.nextInt();
		
			Movie m = new Movie(title, rating, soldTickets);
		
			m.toString();
			System.out.println(m.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			answer = input.next(".").charAt(0);
			
		} while (answer != 'n');
		
		System.out.println("Goodbye");
	}

}
