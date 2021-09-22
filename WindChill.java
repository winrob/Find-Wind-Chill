import java.util.Scanner;

public class WindChill {
    public static void main(String[]args) {
    //create a scanner object to read data from the keyboard
    Scanner input = new Scanner(System.in);

    //displays prompts to receive inputs from user
    System.out.println("Enter the temperature in Celsius: ");
    double celsius = input.nextDouble();

    System.out.println("Enter the wind speed in kilometers per hour: ");
    double kilometersperhour = input.nextDouble();

    //calculations
    double milesperhour = kilometersperhour / 1.6;
    double fahrenheit = (9.0/5.0) * celsius + 32;
    double windChill = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(milesperhour, 0.16)) + (0.4275 * fahrenheit * Math.pow(milesperhour, 0.16));
    
    //display outputs for result
    System.out.printf("Temperature: %.2f degree F but feels like %.2f degree F", fahrenheit, windChill);
    }
}