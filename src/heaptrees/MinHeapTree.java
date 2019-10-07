/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heaptrees;

/**
 *
 * @author hca
 */
public class MinHeapTree <T extends Comparable<T>> implements MinHeap {
    private T[] arr;
    private int cont;
    
    public MinHeapTree(){
        arr = (T[]) new  Object[250];
        cont=0;
        
    }

    public void inserta(T elem){
        cont++;
        int pos=cont/2;
        T aux;
        if(cont>=arr.length-1)
            expande();
        while(arr[pos].compareTo(elem)<0){
            aux= arr[pos];
            arr[pos]= elem;
            arr[cont]=aux;
            pos=pos/2;
        }
        
    }
    private void expande(){
        
    }

    @Override
    public Comparable getMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comparable eliminaMin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserta(Comparable elem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
