import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] liczby = new Integer[]{2, 10, 16, 20, 24};
        for (  int index = 0   ;   index< liczby.length   ;  index ++   )
        System.out.println(liczby[index]);
        System.out.println("Suma wartości wymienionych wyżej liczb");
        int suma = 0;
        for (  int i = 0   ;   i< liczby.length   ;  i ++   )
            suma+= liczby[i];
            System.out.println(suma);



        }



    }

