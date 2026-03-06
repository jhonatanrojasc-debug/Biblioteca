
public class Operaciones {


    public void sumar(int n1, int n2){

        int resultado = n1 + n2;
        System.out.println("- La suma es: " + resultado);

    }

  
    public void restar(int n1, int n2) {
        int resultado = n1 - n2;
        System.out.println("- La resta es: " + resultado);
    }

 public void multiplicar(int n1, int n2) {
        int resultado = n1 * n2;
        System.out.println("- La multiplicacion es: " + resultado);
    }


    public void dividir(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("- No se puede dividir entre cero");
        } else {
            double resultado = n1 / n2;
            System.out.println("- La division es: " + resultado);
        }
    }
    
    public static void main(String[] args) {

        Operaciones obj01 = new Operaciones();

        obj01.sumar(5, 9);
        obj01.restar(10, 3);
        obj01.multiplicar(7, 2);
        obj01.dividir(9, 3);
     }
     }