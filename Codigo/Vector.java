/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
import structure5.StackVector;
public class Vector<T> extends Stack<T> {
    StackVector<T> stackV = new StackVector<T>();


    
    /** 
     * @return boolean
     * metodo para verificar si esta vacio
     */
    public boolean isEmpty(){
        return stackV.isEmpty();
    }

    
    /** 
     * @param value
     * metodo para pushear un valor
     */
    public void push(T value){
        stackV.push(value);
    }

    
    /** 
     * @return T
     * metodo para obtener un valor
     */
    public T pull(){
        return stackV.pop();
    }

    
    /** 
     * @return T
     * metodo para observar un valor
     */
    public T peek(){
        return stackV.peek();
    }

    
    /** 
     * @return int
     * metodo para el tamaño
     */
    public int count(){
        return stackV.size();
    }
}
