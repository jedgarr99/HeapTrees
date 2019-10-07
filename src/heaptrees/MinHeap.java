/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heaptrees;

/**
 *
 * @author hca
 */
public interface MinHeap <T extends Comparable<T>>{
    public void inserta(T elem); 
    public T getMin();
    public T eliminaMin();
    
}
