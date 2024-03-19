import java.util.Scanner;

class Menu {
Scanner sc = new Scanner(System.in);
static Calculadora prueba = new Calculadora();
public static int opcion = 1000;

 public void menu(){
 while (opcion!= 5){
    System.out.println("Seleccione lo que quiere hacer. 1 suma 2 resta 3 multiplicacion 4 division 5 salir");
    opcion = sc.nextInt();
   
        switch(opcion){
      case 1: 
       System.out.println("Ingrese el primer numero");
       prueba.num1 = sc.nextFloat();
       System.out.println("Ingrese el segundo numero");
       prueba.num2 = sc.nextFloat();
      System.out.println("Resultado:" + prueba.suma(prueba.num1,prueba.num2));
      break;
       case 2: 
        System.out.println("Ingrese el primer numero");
        prueba.num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero");
        prueba.num2 = sc.nextFloat();
      System.out.println("Resultado:" + prueba.resta(prueba.num1,prueba.num2));
      break;
       case 3: 
        System.out.println("Ingrese el primer numero");
        prueba.num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero");
        prueba.num2 = sc.nextFloat();
      System.out.println("Resultado:" + prueba.multiplicacion(prueba.num1,prueba.num2));
      break;
       case 4: 
        System.out.println("Ingrese el primer numero");
        prueba.num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo numero");
        prueba.num2 = sc.nextFloat();
      System.out.println("Resultado:" + prueba.division(prueba.num1,prueba.num2));
      break;
      case 5:
      System.out.println("ADios");
      default :
     

    }
    }
 }
}


