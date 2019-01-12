/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

//import static arreglos.Burbuja.mostrarDatos;

/**
 *
 * @author LLira
 */
public class Ordenamientos {
    public static void shellSort(int[] datos, char orden){
        int k= (datos.length + 1)/2;
        int aux= 0;
        
        while(k >= 1){
            boolean ban= true;
            while(ban){
                ban = false;
                for (int i = 0; i < datos.length - k; i++) {
                    
                    if (orden == 'a') {
                        if (datos[i] > datos[i + k]) {
                            aux = datos[i];
                            datos[i] = datos[i + k];
                            datos[i + k] = aux;
                            ban = true;
                        }
                    }else{
                        if (datos[i] < datos[i + k]) {
                            aux = datos[i];
                            datos[i] = datos[i + k];
                            datos[i + k] = aux;
                            ban = true;
                        }
                    }
                    
                    
                }
            }
            k= k/2;
        }
    }
    
    
    public static void quickSort(int[] datos, int inicio, int fin){
        int izq = inicio;
        int der = fin;
        int x= inicio;
        boolean ban= true;
        int aux=0;
        
        while(ban&&izq<der){
            ban= false;
            while(x<der && datos[x]<datos[der]){
                der--;
            }
            if(x<der){//Hubo cambio
                aux= datos[x]= datos[der];
                datos[x]=datos[der];
                datos[der]= aux;
                x= der;
                ban= true;
            }
            while(izq<x && datos[izq]<datos[x]){
                izq++;
            }
            if(izq<x){
                aux= datos[izq];
                datos[izq]= datos[x];
                datos[x]= aux;
                x= izq;
                ban= true;
            }
        }
        if(inicio<x-1){
            quickSort(datos, inicio, x-1);
        }
        if(x+1<fin){
            quickSort(datos, x+1, fin);
        }
    } 
    
    
    
    public static int busquedaBinaria(int[] datos, int elemento, int inicio, int fin){
        int m= (fin+inicio)/2;
        if(inicio>fin){//No lo encontro
            return -1;
        }else if(datos[m]==elemento){//Si lo encuentra
            return m;
        }else if(elemento<datos[m]){//busqueda en el lado izquierdo
            return busquedaBinaria(datos, elemento, inicio, m-1);
        }else{//busqueda de lado derecho
            return busquedaBinaria(datos, elemento, m+1, fin);
        }
        
    }
    
    public static int[] mezcla(int[] a, int[] b){
        int i=0; //Index of array A
        int j=0; //Index of array B
        int k=0; //Index of array C
        int[] c= new int[a.length+b.length];
        while(i < a.length && j < b.length){
            if(a[i]< b[j]){
                c[k++]= a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        if(i>=a.length){//Ya termino el arreglo A
            for (int x = j; x < b.length; x++) {
                c[k++]= b[x];
            }
        }else{
            for (int x = i; x < a.length; x++) {
                c[k++]= a[x];
            }
        }
        return c;
    }//End

        
    public static int[][] insercionDirecta(int[] datos) {
        int tam = datos.length;
        int[][] pasadas= new int[tam - 1][tam];
        int j = 0;
        int aux;
        //System.out.println("Original: 14, 21, 7, 18, 30, 19, 5, 18, 20, 25.");
        for (int i = 1; i < tam; i++) {
            j = i;
            while (j >= 1 && datos[j] < datos[j - 1]) {
                aux = datos[j];
                datos[j] = datos[j - 1];
                datos[j - 1] = aux;
                j--;
            }
            //Guardar datos de la pasada
            for (int k = 0; k < tam; k++) {
                pasadas[i - 1][k] = datos[k];
            }
//            System.out.print("Pasada #" + i + ": ");
//            mostrarDatos(datos);
        }
        return pasadas;
    }

//    public static void burbuja(int[] datos) {
//        int tam = datos.length;
//        int aux;
//        for (int pivot = 0; pivot < tam - 1; pivot++) {
//            //pos= pivot;
//            for (int k = pivot + 1; k < tam; k++) {
//                if (datos[k] < datos[pivot]) {
//                    aux = datos[k];
//                    datos[k] = datos[pivot];
//                    datos[pivot] = aux;
//                }
//            }
//            System.out.print("Pasada #" + (pivot + 1) + ": ");
//            mostrarDatos(datos);
//        }
//    }
    public static int[][] burbuja(int[] datos) {
        int tam = datos.length;
        int[][] pasadas= new int[tam - 1][tam];
        int aux;
        //Buscamos la posicion del menor
        for (int pivot = 0; pivot < tam - 1; pivot++) {
            int pos= pivot;
            for (int k = pivot + 1; k < tam; k++) {
                if (datos[k] < datos[pos]) {
                    pos = k;
                }
            }
            if(pos!= pivot){
                aux = datos[pivot];
                datos[pivot] = datos[pos];
                datos[pos] = aux;
            }
            System.out.print("Pasada #" + (pivot + 1) + ": ");
            mostrarDatos(datos); 
        }
        return pasadas;
    }
    
    /*public static void quickSort(){
    
    }*/

    public static void mostrarDatos(int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            System.out.print("\t" + datos[i]);
        }
        System.out.println("");
    }

    static void shellSort(int[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//End
