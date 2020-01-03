/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoresjava;

/**
 *
 * @author Walter Gdmz
 */
class CalculoMatematico{
    
        //atributos de la clase
        int a;
        int b;
        
        //Constructor Vacio
        CalculoMatematico(){
        }
        
        //Constructor no vacio
        //asigna los parametros a los atributos de la clase
        CalculoMatematico(int argumentoUno, int argumentoDos){
            a = argumentoUno;
            b = argumentoDos;
        }
        
        //metodo suma sin argumentos
        //usa los atributos de la clase
        int sumar(){
            return a+b;
        }
        
        //metodo suma con argumentos
        //recibe los parametros al crear el objeto de tipo CalculoMatematico 
        int sumar(int a,int b){
        return a+b;
        }
}
public class ConstructoresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creamos el objeto de tipo calculo matematico con un constructor vacio
        //no inicializa los atributos de la clae
        CalculoMatematico obj1 = new CalculoMatematico();
        
        //inicializamos la variable resultado1 para guardar el resultado del metodo suma le enviamos al metodo suma los parametros 5 y 7
        int resultado1 = obj1.sumar(5,7);
        
        //creamos el objeto de tipo CalculoMatematico con un constructor no vacio inicializamos los atributos de la clase a=8; b=8;
        //el metodo suma sin argumentos usara los atributos de la clase a+b; 8+8
        CalculoMatematico obj2 = new CalculoMatematico(8,8);
        
        //se asigna a la variable resultado2 el resultado del metodo suma
        int resultado2 = obj2.sumar();
        
        //imprimimos el resultado 1 y 2
        System.out.println("El resultado 1 es: "+resultado1);
        System.out.println("El resultado 2 es: "+resultado2);
    }
    
}
