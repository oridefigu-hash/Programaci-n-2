
public class burbujanros{

    public static void main(String[] args){
        int [] matriz = {5,3,9,2,1,6,0,7};
        for (int n=1; n < matriz.length; n++) { //aca empieza el ciclo de la burbuja
            for (int i = 0; i < matriz.length - 1; i++) {
                //Debug//
                System.out.println(i);
                System.out.println(java.util.Arrays.toString(matriz)); //imprimimos los valores que se van a comparar
                System.out.println((matriz[i] + "-"+ (matriz[i + 1]))); //imprimimos si la comparación es verdadera o falsa
                //Debug//
                if (matriz[i] > matriz[i + 1]) {
                    int aux = matriz[i]; //guardamos el valor de la posición i en una variable auxiliar
                    matriz[i] = matriz[i + 1];//matriz[i] toma el valor de la posición i + 1. ejemplo: la posicion 0 pasa a valer 3
                    matriz[i + 1] = aux;//matriz[i+1] toma el valor de la posición [i]. ejemplo: la posicion  i+1pasa a valer 5
                }

               
                System.out.println("Iteración " + n + ": " + java.util.Arrays.toString(matriz)); //imprimimos el arreglo en cada iteración para ver como va cambiando
            }

        }
    }
        

}
