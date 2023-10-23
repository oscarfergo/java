import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        e222();
    }
    public static void e201(){
        
        //variables

        int a = 1;
        int b = 1;
        int c = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime primer lado");
        a = sc.nextInt();
        System.out.println("Dime segundo lado");
        b = sc.nextInt();
        System.out.println("Dime tercer lado");
        c = sc.nextInt();
        sc.close();

        //programa

        if (a == b && b == c) {
            System.out.println("Es un triángulo equilátero");
        }
        else if ((a*a)+(b*b) == (c*c) || (a*a)+(c*c) == (b*b) || (c*c)+(b*b) == (a*a)) {
            System.out.println("Es un triángulo rectángulo");
        }
        else if (a == b && a != c || a == c && a != b || b == c && b != a) {
            System.out.println("Es un triángulo isósceles");
        }
        else {
            System.out.println("Es un triángulo escaleno");
        }
    }

    public static void e202(){
        
        //variables

        int a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos alumnos son?");
        a = sc.nextInt();
        sc.close();

        //programa

        if ( a >= 100) {
            int p = 65;
            System.out.println("Cada alumno paga " + p + " €");
        }
        else if ( a >= 50 && a <= 99 ) {
            int p = 70;
            System.out.println("Cada alumno paga " + p + " €");
        }
        else if ( a >= 30 && a <= 49 ) {
            int p = 95;
            System.out.println("Cada alumno paga " + p + " €");
        }
        else {
            int p = 4000 / a;
            System.out.println("Cada alumno paga " + p + " €");
        }
    }
    public static void e210(){
        
        //variables
        
        double a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto has pagado?");
        a = sc.nextInt();
        sc.close();
        
        //programa

        if (a >= 100) {
            double b = a*0.92;
            System.out.println("Tiene descuento tiene que pagar " + b + "€");
        }
        else {
            System.out.println("No tiene descuento tiene que pagar " + a + "€");
        }
    }
    public static void e211(){
        
        //variables

        int a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que nota has sacado del 1/10?");
        a = sc.nextInt();
        sc.close();

        //programa

        if (a >= 9 && a <= 10) {
            System.out.println("Sobresaliente");
        }
        else if (a >= 6.5 && a < 9) {
            System.out.println("Notable");
        }
        else if (a >= 5 && a < 6.5) {
            System.out.println("Suficiente");
        }
        else if (a < 5) {
            System.out.println("Insuficiente");
        }
        else {
            System.out.println("Su nota no es posible");
        }
    }
    public static void e212(){
        
        //variables
        
        int a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuanto has pagado?");
        a = sc.nextInt();
        sc.close();
        
        //programa

        if (a >= 100) {
            double b = a * 0.08;
            double c = b - a;
            if (b >= 200){
                double d = a - 200;
                System.out.println("Tiene descuento tiene que pagar " + d + "€");
            }
            else {
                System.out.println("Tiene descuento tiene que pagar " + c + "€");
            }
        }
        else if (a >= 0 && a < 100) {
            System.out.println("No tiene descuento tiene que pagar " + a + "€");
        }
        else {
            System.out.println("Su cantidad no es valida");
        }
    }
    public static void e213(){
        
        //variables

        int a = 1;
        int v1 = 1;
        int v2 = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opción");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        a = sc.nextInt();
        System.out.println("Inserte valor numero 1");
        v1 = sc.nextInt();
        System.out.println("Inserte valor numero 2");
        v2 = sc.nextInt();
        sc.close();

        //programa

        switch(a){
            case 1:
                double b = v1 + v2;
                System.out.println("Suma es " + b);
            break;
            case 2:
                double c = v1 - v2;
                System.out.println("Resta es " + c);
            break;    

            case 3:
                double d = v1 * v2;
                System.out.println("Multiplicacion es " + d);
            break;    

            case 4:
                double e = v1 / v2 ; 
                System.out.println("Division es " + e);
            break;

            default:
                System.out.println("No has seleccionado una opcion valida");
            break;
        }
    }
    public static void e214(){
        
        //variables
        int a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que mes piensas del 1/12");
        a = sc.nextInt();
        sc.close();

        //programa

        switch (a) {
            case 2:
                System.out.println("Tiene 28 dias, 29 si año es bisiesto");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tiene 30 dias");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 31 dias");
                break;
            default:
                System.out.println("Numero mes incorrecto");
                break;
        }
    }
    public static void e215(){
        
        //variables
        
        int a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la temperatura");
        a = sc.nextInt();
        sc.close();
        
        //programa

        if (a >= 21) {
            System.out.println("Encender aire");
        }
        else {
            System.out.println("No enciendas el aire");
        }
    }
    public static void e216(){
        
        //variables
        
        int a = 1;

        //scanner

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que hora es?");
        a = sc.nextInt();
        sc.close();
        
        //programa

        if (a >= 9 && a < 14 || a >= 16 && a < 19) {
            System.out.println("A trabajar");
        }
        else if(a >= 14 && a < 16 || a >= 19) {
            System.out.println("Es tiempo libre");
        }
        else {
            System.out.println("No es una hora valida");
        }
    }
    public static void e217(){
        
        // 0 to 100
        
        int randomNum = (int)(Math.random() * 101);
        int n = 1;
        int v = 5;

        // scanner

        Scanner sc = new Scanner(System.in);

        // programa
        
        System.out.println("Adivina el numero que pienso del 1 al 100");
        System.out.println("Tienes 5 vidas cada vez que fallas se restara 1");
        System.out.println("Si quieres terminar escribe 999");
        System.out.println("Empieza a adivinar");
        n = sc.nextInt();

        while (randomNum != n && n <= 100 && v != 1) {
 
            if (randomNum < n) {
                System.out.println("Muy alto");
                --v;
                System.out.println("Tienes " + v + " vidas");
            }
            else if (randomNum > n) {
                System.out.println("Muy bajo");
                --v;
                System.out.println("Tienes " + v + " vidas");
            }
            else if (n > 100) {
                System.out.println("No es un número entre el 1 y el 100");
            }
            System.out.println("Vuelve a intentarlo");

            System.out.println("Adivina el numero");
            
            n = sc.nextInt();
        }
        if (randomNum == n) {
            System.out.println("Has acertado, el numero era " + randomNum);
        }
        else if (n == 999) {
            System.out.println("Adios");
        }
        else {
            System.out.println("Has perdido, el numero era " + randomNum);
        }
        sc.close();
    }
    public static void e218(){
        System.out.println("hola");
    }
    public static void e220(){
       
        //variables
        
        int menu = 1;
        int[] num = new int[5];

        //scanner

        Scanner sc = new Scanner(System.in);

        //programa
        
        System.out.println("Este programa recoge los 5 numeros que deseas.");

        for (int i = 0; i < num.length; i++) {
        System.out.println("Dime un numero");
        num[i] = sc.nextInt();
        }
        
        System.out.println("Selecciona diciendome la opción que quieres");
        System.out.println("1. Valor maximo de tus numeros");
        System.out.println("2. Valor minimo de tus numeros");
        System.out.println("3. Media aritmetica de tus numeros");
        System.out.println("4. Salir");
        menu = sc.nextInt();

        if (menu == 1) {
            int max = num[0];

            for (int i = 0; i < num.length; i++) {
                max = Math.max(max, num[i]);
            }

            System.out.println("Maximo valor es " + max);
        }
        else if (menu == 2) {
            int min = num[0];

            for (int i = 0; i < num.length; i++) {
                min = Math.min(min, num[i]);
            }

            System.out.println("Minimo valor es " + min);
        }
        else if (menu == 3) {
            int sum = 0;

            for (int arr: num) {
                sum += arr;
            }

            int media = sum / num.length;
            System.out.println("La media es " + media);
        }
        else {
            System.out.println("Adios");
        }
        sc.close();
    }
    public static void e221(){
        
        // 0 to 100
        
        double randomNum = (double)(Math.random() * 1);
        //System.out.println(randomNum);
        
        // programa
        
        if (randomNum <= 0.5) {
            System.out.println("1");
        }
        else if (randomNum >= 0.51 && randomNum <= 0.7) {
            System.out.println("x");
        }
        else {
            System.out.println("2");
        }
    }
    public static void e222(){

        //variables
        
        int menu = 1;
        int[] num = new int[5];

        //scanner

        Scanner sc = new Scanner(System.in);

        //programa
        
        System.out.println("Este programa recoge los 5 numeros que deseas.");

        for (int i = 0; i < num.length; i++) {
        System.out.println("Dime un numero");
        num[i] = sc.nextInt();
        }
        
        System.out.println("Selecciona diciendome la opción que quieres");
        System.out.println("1. Muestrame el array");
        System.out.println("2. Incrementa en 1 los valores del array");
        System.out.println("3. Salir");
        menu = sc.nextInt();
        sc.close();

        if (menu == 1) {
            for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + "; ");
            }
        }
        else if (menu == 2) {
            for (int i = 0; i < num.length; i++) {
                num[i] = num[i] + 1 ;
                System.out.print(num[i] + "; ");
            }
        }
        else {
            System.out.println("Adios");
        }
    }
    public static void e223(){

        //variables
        
        int[] num = new int[5];

        //scanner

        Scanner sc = new Scanner(System.in);

        //programa
        
        System.out.println("Este programa recoge los 5 numeros que deseas.");

        for (int i = 0; i < num.length; i++) {
        System.out.println("Dime un numero");
        num[i] = sc.nextInt();
        System.out.println("Los numeros pares son:");

        }
        sc.close();

        for (int i = 0; i < num.length; i++) {  
            if(num[i] % 2 == 0) {  
                System.out.println(num[i]);
            }
        }
    }
    public static void e224(){

        //variables
        
        String[] palabras = new String[5];

        //scanner

        Scanner sc = new Scanner(System.in);

        //programa
        
        System.out.println("Este programa recoge 5 palabras que deseas.");

        for (int i = 0; i < palabras.length; i++) {
        System.out.println("Dime palabras");
        palabras[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("Sus palabras en orden invertido son:");

        for (int i = 4; i >= 0; i--) {  
            System.out.println(palabras[i]);
        }
    }
    public static void e225(){
        System.out.println("hola");
    }
    public static void e226(){
        System.out.println("hola");
    }
    public static void e227(){
        System.out.println("hola");
    }
    public static void e228(){
        System.out.println("hola");
    }
    public static void e229(){
        System.out.println("hola");
    }
    public static void e229X(){
        System.out.println("hola");
    }
    public static void e229A(){
        System.out.println("hola");
    }
    public static void e229B(){
        System.out.println("hola");
    }
    public static void e229C(){
        System.out.println("hola");
    }
    public static void e229D(){
        System.out.println("hola");
    }
    public static void e229E(){
        System.out.println("hola");
    }
    public static void e231(){
        System.out.println("hola");
    }
    public static void e232(){
        System.out.println("hola");
    }
    public static void e233(){
        System.out.println("hola");
    }
    public static void e234(){
        System.out.println("hola");
    }
    public static void e235(){
        System.out.println("hola");
    }
    public static void e236(){
        System.out.println("hola");
    }
    public static void e237(){
        System.out.println("hola");
    }
}
