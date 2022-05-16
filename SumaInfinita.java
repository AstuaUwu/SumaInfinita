import java.util.Scanner;

public class SumaInfinita {

   
    public static void main(String[] args) {
    int Numero1, Numero2,Total;
    
    Scanner captura= new Scanner(System.in);
    do{
        System.out.println("Digite el primer numero");
    Numero1= captura.nextInt();
        System.out.println("Digite el segundo numero");
    Numero2= captura.nextInt();
    
    Total= Numero1+Numero2;
        System.out.println("Su total: "+ Total);
        
    }while(Numero1!=Numero2);
    }
    
}
