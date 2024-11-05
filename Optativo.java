//Una matriz de dimensiones NxN de enteros es mágica si: Aparecen todos los números enteros desde 1 a N². La suma de los elementos de cada fila, cada columna, y las dos diagonales dan el mismo valor.
//Por ejemplo, la matriz siguiente de dimensiones 5x5 contiene todos los elementos del 1 al 25 y tiene como suma común 65.
//
//Desarrolla un programa que lea una matriz y nos indique si es mágica. Nota: Puedes probar el programa con las siguientes matrices que son también mágicas (en la imágen)
//Intenta crear un generador de matrices mágicas.

public class Optativo {

    static int[] cuadradoMagico={15, 8, 1, 24, 17, 16, 14, 7, 5, 23, 22, 20, 13, 6, 4, 3, 21, 19, 12, 10, 9, 2, 25, 18, 11};

    public static void main(String[] args) {

        System.out.println(comprobarRepetidos());
        System.out.println(comprobarSumaFilas(5));
    }
    public static boolean comprobarRepetidos(){

        int dimension= cuadradoMagico.length-1;

        for(int i=0; i< cuadradoMagico.length;++i){

            if(cuadradoMagico[i]==dimension){
                dimension--;
                i=-1;
            }
        }
        if(dimension==0){
            return true;
        }else
            return false;
    }
    public static boolean comprobarSumaFilas(int dimension){

        int primeraSumaFila=0;
        int contadorFilas=0;

        for(int i=0; i<dimension;++i){
            primeraSumaFila+=cuadradoMagico[i];
        }

        int suma=0;

        for(int i=0;i< cuadradoMagico.length;i+=dimension){

            for (int j =0; j<dimension;++j){
                suma+=cuadradoMagico[i+j];
                if(suma==primeraSumaFila){
                    contadorFilas++;
                }
            }
            suma=0;
        }
        if(contadorFilas==dimension){
            return true;
        }else {
            return false;
        }
    }
    public static boolean comprobarSumaColumnas(int dimension){

        int primeraSumaColumna=0;
        int contadorColumna=0;

        for(int i =0;i< cuadradoMagico.length;i+=5){
            primeraSumaColumna+=cuadradoMagico[i];
        }

        for(int i=0; i<dimension;++i){
            for(int j=0;j<cuadradoMagico.length;j+=dimension){
                
            }
        }
    }
}
