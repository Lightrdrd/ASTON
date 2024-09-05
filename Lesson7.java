import java.util.Scanner;
import java.util.Arrays;


public class Lesson7{

    //Методы закомментил для удобства, так как есть ввод значений с клавиатуры

    public static void main(String[] args) {
       printThreeWords();        //1 задание
       checkSumSign();           //2 задание
       printColor();             //3 задание
       compareNumbers();         //4 задание
       checkRange();             //5 задание
       checkNumber();            //6 задание
       displayNumberBoolean();   //7 задание
       printStringNumber();      //8 задание
       checkYear();               //9 задание
       recordArray();            //10 задание
       recordToEmptyArray();     //11 задание
       decreaseArray();          //12 задание
       squareArray(20);          //13 задание
       OneDimensionalArray(5, 12);   //14 задание

    }
    //1. Задание    
    public static void printThreeWords() {
        System.out.println(" Orange\n Banana\n Apple");
    }

    //2. Задание    
    public static void checkSumSign() {
        int a = -10,b = 27;
        int res = a + b;
        if(res >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");


    }

    //3. Задание
    public static void printColor() {
        int value = -11;
        if(value <= 0)
            System.out.println("Красный");
        else if(value > 0 && value <= 100 && value >= 1 )
            System.out.println("Желтый");
        else if(value > 100)
            System.out.println("Зеленый");

    }

    //4. Задание
    public static void compareNumbers(){
        int a=24,b=2;
        if(a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    //5. Задание
    public static void checkRange() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите певрое число ");
        int a = console.nextInt();
        System.out.println("Введите второе число ");
        int b = console.nextInt();
        int sum = a + b;
        boolean displayBoolean = ( sum >= 10 && sum <= 20 );
        if(sum >= 10 && sum <= 20)
            System.out.println(displayBoolean);
        else
            System.out.println(displayBoolean);
    }

    //6. Задание
    public static void checkNumber() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int a = console.nextInt();
        if(a >= 0)
            System.out.println("Введено положительное число");
        else if(a < 0)
            System.out.println("Введено отрицательное число");
    }

    //7. Задание
    public static void displayNumberBoolean() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = console.nextInt();
        boolean b = (a < 0 );
        if(a < 0)
            System.out.println(b);
        else if(a >= 0)
            System.out.println(b);
    }

    //8. Задание
    public static void printStringNumber(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = console.nextLine();
        System.out.println("Введите число");
        int b = console.nextInt();
        for(int i = 0; i < b; i++){
            System.out.println(a);
        }
    }

    //9. Задание
    public static void checkYear() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int year = console.nextInt();
        boolean leapYearBoolean;

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYearBoolean = true;
            System.out.println(leapYearBoolean);
        }else {
            leapYearBoolean = false;
            System.out.println(leapYearBoolean);
        }
    }

    //10. Задание
    public static void recordArray() {
        int[] array = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }

    //11. Задание
    public static void recordToEmptyArray(){
        int[] array = new int[100];
        for (int i = 0, j = 1; i < array.length; i++, j ++)
            array[i] = j;
        System.out.println(Arrays.toString(array));
    }

    //12. Задание
    public static void decreaseArray(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        System.out.println(Arrays.toString(array));
    }

    //13. Задание
    public static void squareArray(int size) {
        int[][] square = new int[size][size];
        for (int i = 0; i < size; i++) {
            square[i][i] = 1;
            square[i][size - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(square));
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(square[i]));
    }

    //14. Задание
    public static void OneDimensionalArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }



    }

}
