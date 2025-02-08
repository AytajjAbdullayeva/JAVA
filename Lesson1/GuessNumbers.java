import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessNumbers {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        Random random =new Random();

        //Generate a random number
        int randomNumber= random.nextInt(101);
        System.out.println("Let the game begin!");
        System.out.println("Enter your name: ");
        String name =scanner.nextLine();
        int[] userGuesses = new int[100];
        int guessCount=0;

        while (true){
            System.out.println("Enter your guess: ");
            String input = scanner.nextLine();

            try {
                int guess = Integer.parseInt(input);
                userGuesses[guessCount++]=guess;

                if (guess<randomNumber){
                    System.out.println("Your number is too small. Please, try again.");
                }
                else if (guess>randomNumber){
                    System.out.println("Your number is too big. Please, try again. ");
                }
                else {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a valid number!");
            }

        }


        System.out.println("Your numbers: ");
        int[] Guesses = new int[guessCount];
        System.arraycopy(userGuesses, 0, Guesses, 0, guessCount);
        sortDescending(Guesses);
        for (int num: Guesses){
            System.out.println(num + " ");
        }
        scanner.close();


    }
    public static void sortDescending(int[] array){
        for (int i=0; i< array.length-1; i++){
            for (int j=i+1; j< array.length; j++){
                if (array[i]<array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
}
