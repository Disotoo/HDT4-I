/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
public abstract class MadreLista<T> implements ILista<T>  {

    public MadreLista(){
        super();
    }

    
    /** 
     * @param value
     * metodos de la interfaz 
     */
    @Override
    public void InsertAtStart(T value) {
        // TODO Auto-generated method stub
        
    }

    
    /** 
     * @param value
     * metodo de la interfaz
     */
    @Override
    public void InsertAtEnd(T value) {
        // TODO Auto-generated method stub
        
    }

    
    /** 
     * @param value
     * @param index
     * metodo de la interfaz
     */
    @Override
    public void Insert(T value, int index) {
        // TODO Auto-generated method stub
        
    }

    
    /** 
     * @param index
     * @return T
     * metodo de la interfaz
     */
    @Override
    public T Delete(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return T
     * metodo de la interfaz
     */
    @Override
    public T DeleteAtStart() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return T
     * metodo de la interfaz 
     */
    @Override
    public T DeleteAtEnd() {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @param index
     * @return T
     * metodo de la interfaz 
     */
    @Override
    public T Get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    
    /** 
     * @return boolean
     * metodo de la interfaz 
     */
    @Override
    public boolean IsEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    
    /** 
     * @return int
     * metodo de la interfaz
     */
    @Override
    public int Count() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
