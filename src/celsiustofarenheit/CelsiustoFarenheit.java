/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celsiustofarenheit;

/**
 *
 * @author lemue
 */
import java.util.Scanner;
public class CelsiustoFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sen = new Scanner(System.in);
        
        float celsius, fahrenheit;
        
        System.out.print("Temperature in Fahrenheit: ");
        fahrenheit = sen.nextFloat();
        
        celsius = (fahrenheit-32)*5/9;
        
        System.out.printf("Temperature of Fahrenheit in Celsius: %.2f%n",celsius);
        
        sen.close();
    }
}//end of the main method
