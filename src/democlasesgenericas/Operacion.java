/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package democlasesgenericas;

/**
 *
 * @author sergio
 */
public class Operacion<T extends Number> {
    
    private T dato1;
    private T dato2;

    public Operacion(T dato1, T dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }
    
    public Double sumaDouble(){
        return dato1.doubleValue() +dato2.doubleValue();        
    }

    public long sumaLong(){
        return dato1.longValue() +dato2.longValue();        
    }
    
    public T getDato1() {
        return dato1;
    }

    public T getDato2() {
        return dato2;
    }
    
    
    
}
