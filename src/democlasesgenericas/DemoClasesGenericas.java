/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package democlasesgenericas;

/**
 *
 * @author sergio
 */
public class DemoClasesGenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*AlmacenEnteros almacenentero=new AlmacenEnteros(5);
        AlmacenDouble almacendouble=new AlmacenDouble(5.6);
         
        almacenentero.dato=5;
        almacendouble.dato=5.3;
        */
        
        AlmacenGenerico<Double> almacen=new AlmacenGenerico<>(5.3);
        AlmacenGenerico<Integer> almacenI=new AlmacenGenerico<>(5);
        AlmacenGenerico<Cliente> almacenCli=new AlmacenGenerico<>(new Cliente("Pedro"));
        Operacion<Double> operad=new Operacion<>(5.3,6.8);
        String dato="Hola";
        
        dato=dato+" Como estas";
        
        System.out.println("Valor:"+almacen.getDato());
        System.out.println("cliente:"+almacenCli.getDato().getNombre());
        
        //almacen.dato=7.6;
        
    }
    
}
