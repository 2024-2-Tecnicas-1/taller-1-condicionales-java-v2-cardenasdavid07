
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
LocalDate currentDate = LocalDate.now();
        int currentDia = currentDate.getDayOfMonth();
        int currentMes = currentDate.getMonthValue();
        int currentAnno = currentDate.getYear();
        int edad = currentAnno - anno;
        if (currentMes < mes || (currentMes == mes && currentDia < dia)) {
            edad--; 
        }
        
        return "Usted tiene " + edad + " años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
