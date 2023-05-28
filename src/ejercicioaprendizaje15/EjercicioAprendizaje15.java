/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package ejercicioaprendizaje15;
public class EjercicioAprendizaje15 {
    public static void main(String[] args) {
               
        int vector[] = new int[101];
        
        rellenar(vector);
        System.out.println("");       
    }
    public static void rellenar(int [] vector){
        for (int i = 100; i > 0; i--) {          //Bucle descendiente
            vector[i] = i;                       //rellenar matriz
            System.out.print("["+vector[i]+"]"); //imprimir vector
        }
    }
}
