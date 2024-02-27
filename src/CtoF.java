import java.util.Scanner;
public class CtoF {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            double cel, fahrenheit;
            boolean validInput;

            do {
                System.out.println("Enter a temperature in celsius: ");

                if (in.hasNextDouble()) {
                    cel = in.nextDouble();
                    fahrenheit = celTofahrenheit(cel);
                    System.out.println("The equivalent temperature in Fahrenheit: " + fahrenheit);
                    validInput = true;
                } else {
                    System.out.println("Invalid input. PLease enter a valid numeric value for temperature.");
                    in.next();
                    validInput = false;
                }
            } while (!validInput);

            in.close();
        }

            public static double celTofahrenheit ( double cel){
                return (cel * 9 / 5) + 32;
            }
}