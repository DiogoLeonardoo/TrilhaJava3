
package application; // This is the package name
import entities.retanguloEntities; // This is the import statement
import java.util.Scanner; // This is the import statement

public class retangulo {
    public static void main(String[] args) { // This is the main method
        Scanner sc = new Scanner(System.in); // This is the Scanner object

        retanguloEntities retangulo = new retanguloEntities(); //

        System.out.println("Enter rectangle width: "); 
        retangulo.width = sc.nextInt(); // This is the width input
        System.out.println("Enter rectangle height: ");
        retangulo.height = sc.nextInt(); // This is the height input

        System.out.println("AREA = " + retangulo.area()); //
        System.out.println("PERIMETER = " + retangulo.perimetro());
        System.out.println("DIAGONAL = " + retangulo.diagonal());
    }    
}
