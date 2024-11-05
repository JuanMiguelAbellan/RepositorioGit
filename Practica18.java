//Escribe un programa que genere un array de 1000 números aleatorios positivos menores que 100 y haga lo siguiente:
//
//    Ordenar/visualizar los números de la lista en orden creciente.

//    Calcular la mediana (tras ordenarlos, la mediana es el valor que ocupa el "centro" de la lista de orden creciente). Ejemplo: si la serie es {-1, 0, 1, 2, 3, 3, 10}
//    la mediana es 2, debido a que en la serie tres números están antes del 2 y tres números están después del 2. Si tienes un número par de valores en la serie, entonces necesitas conseguir
//    la media de los dos números del medio. Por ejemplo, si la serie es {0, 1, 2, 3}, la mediana será la media de los dos números del centro (1, 2): es decir 1,5.

//    Imprimir el número o números que tienen mayor frecuencia de aparición (indicando también el valor de esa frecuencia máxima)

import java.util.ArrayList;
import java.util.HashSet;

public class Practica18 {

    public static void main(String[] args) {

        int[] array=new int[10];
        int maximo=100;
        int minimo=0;
        addArrayRandom(array, minimo, maximo);

    }
    public static void addArrayRandom(int[] array, int min, int max) {

        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * max-min) + min;
        }
        UtilidadesArrays.muestraArray(array);
        ordenarArray(array);
    }
    public static void ordenarArray(int[] array){

        for(int i =0; i< array.length;++i){
            int num=array[i];
            for(int j= 1; j< array.length;++j){
                if(num>array[j]){
                }
            }
        }
        UtilidadesArrays.muestraArray(array);
    }
}
