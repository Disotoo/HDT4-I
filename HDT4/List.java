/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
public  class List<T> extends Stack<T> {
    private FLista<T> flista = new FLista<T>();
    private MadreLista<T> lista;

    public List(){

    }

    public List(int tipoL){
        lista = flista.getInstance(tipoL);
    }
    
    /** 
     * @return int
     * metodo para saber el tamaño
     */
    @Override
    public int count() {
        return lista.Count();
    }

    
    /** 
     * @return boolean
     * metodo para saber si esta vacia
     */
    @Override
    public boolean isEmpty() {
        return lista.IsEmpty();
    }

    
    /** 
     * @param value
     * metodo para pushear un valor
     */
    @Override
    public void push(T value) {
        lista.InsertAtStart(value);
    }

    
    /** 
     * @return T
     * metodo para obtener un valor
     */
    @Override
    public T pull() {
        return lista.DeleteAtStart();
    }

    
    /** 
     * @return T
     * metodo para saber el valor
     */
    @Override
    public T peek() {
        return lista.Get(lista.Count());
    }


}
