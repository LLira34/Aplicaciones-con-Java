/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

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
    
    public static void quickSort(int[] datos, int inicio, int fin) {
        int izquierda = inicio;
        int derecha = fin;
        int x = inicio;
        boolean ban = false;
        int aux = 0;

        while (ban&&izquierda<derecha) {
            ban = false;
            while (izquierda < derecha && datos[x] <= datos[derecha]) {
                derecha--;
            }
            if (izquierda < derecha) { 
                aux = datos[x];
                datos[x] = datos[derecha];
                datos[derecha] = aux;
                ban = true;
            }

            while (izquierda < derecha && datos[izquierda] < datos[x]) {

                izquierda++;

            }
            if (izquierda < derecha) {
                aux = datos[izquierda];
                datos[izquierda] = datos[x];
                datos[x] = aux;
                x = izquierda;
                ban = true;
            }
        }
        
        if (inicio<x-1){
            quickSort(datos,inicio,x-1);
        }
        
        if(x+1<fin){
            quickSort(datos,x+1,fin);
        }
        
    }
    
    public static int[]mezcla(int[]a, int[]b){
        int i = 0; //indice del arreglo a
        int j = 0; //indice del arreglo b
        int k = 0; //indice del arreglo c
        int[]c=new int[a.length+b.length];
        
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                c[k++] = a[i++];
            }else{
                c[k]=b[j++];
            }
        }
        
            if (i>=a.length) { 
                for (int x = j; x < b.length; x++) {
                    c[k++]=b[x];
                }
            }else{
                for (int x = i; x < a.length; x++) {
                    c[k++]=a[x];
                }
            }
            
            return c;
        
    }
    
    public static int[][] insercionDirecta(int[] datos, char orden){
        
        int tam = datos.length;
        int[][] pasadas = new int[tam-1][tam];
        int j = 0;
        int aux;
        for (int i = 1; i < tam; i++) {
            j = i;
            
            if (orden == 'a') {
                while(j >= 1 && datos[j] < datos[j-1]){
                aux = datos[j];
                datos[j] = datos[j-1];
                datos[j-1] = aux;
                j--;
            }
            }else{
                while(j >= 1 && datos[j] > datos[j-1]){
                aux = datos[j];
                datos[j] = datos[j-1];
                datos[j-1] = aux;
                j--;
            }
            }
            
            //save
            for (int k = 0; k < tam; k++) {
                pasadas[i-1][k] = datos[k];
            }
            
        }
        return pasadas;
    }
    
    public static int[][] burbuja(int[] datos, char orden) {
        int tam = datos.length;
        int[][] pasadas = new int[tam - 1][tam];
        int aux = 0;
        for (int pivote = 0; pivote < tam - 1; pivote++) {

            for (int k = pivote + 1; k < tam; k++) {
                if (orden == 'a') { //asc
                    if (datos[k] < datos[pivote]) {

                        aux = datos[k];
                        datos[k] = datos[pivote];
                        datos[pivote] = aux;

                    }
                } else { //desc
                    if (datos[k]>datos[pivote]) {

                        aux = datos[k];
                        datos[k] = datos[pivote];
                        datos[pivote] = aux;

                    }
                }
                
            }
            for (int k = 0; k < tam; k++) {
                pasadas[pivote][k] = datos[k];
            }
          
        }
        return pasadas;  
    }
    
//    public static void upgradedBubble(int[] data){ //cuz upgraded thingz are better
//        int tam = data.length;
//        int aux = 0;
//        for (int pivot = 0; pivot < tam-1; pivot++) {
//            int pos = pivot;
//            for (int k = pivot+1; k < tam; k++) {
//                if (data[k]<data[pos]) {
//                    pos = k;
//                }
//            }
//            if (pos!=pivot) {
//                aux = data[pivot];
//                data[pivot] = data[pos];
//                data[pos] = aux;
//            }
//            System.out.println("Pasada #" + (pivot+1) + " :" );
//            mostrarDatos(data);
//        }
//    }
    
    public static int[][] upgradedBubble(int[] datos, char orden){ 
        int tam = datos.length;
        int aux = 0;
        int[][] pasadas = new int[tam - 1][tam];
        for (int pivot = 0; pivot < tam-1; pivot++) {
            int pos = pivot;
            for (int k = pivot+1; k < tam; k++) {
                ////////////////////////////////////

                if (orden == 'a') {

                    if (datos[k] < datos[pos]) {
                        pos = k;
                    }

                } else {
                    if (datos[k] > datos[pos]) {
                        pos = k;
                    }
                }
                
                
            }
            if (pos!=pivot) {
                aux = datos[pivot];
                datos[pivot] = datos[pos];
                datos[pos] = aux;
            }
            
            for (int k = 0; k < tam; k++) {
                pasadas[pivot][k] = datos[k];
            }
            
        }
        return pasadas;  
    }
    
    
    
    
    
    //Muestra los datos
    public static void mostrarDatos(int[] datos){
        for (int i = 0; i < datos.length; i++) {
            
            System.out.print("\t"+datos[i]);
            
        }
        System.out.println("");
    }

    static void upgradedBubble(int[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
