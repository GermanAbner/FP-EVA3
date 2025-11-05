/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica1_25550584;

/**
 *
 * @author miria
 */
public class EVA3_Practica1_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int val1=5, val2=10;
        //1.Si necesito guardar el valor de retorno
        int resu = sumarEnteros(val1,val2);//si el metodo exige parametros, en este caso enteros
        //MISMOS TIPOS DE DATOS EN EL MISMO ORDEN
        System.out.println("Suma de 5 + 10 = "+resu);
        //2.- No necesito guardar el valor, un solo uso
        System.out.println("Suma de 5 + 10 = "+sumarEnteros(val1,val2));
        //3.- solo necesito ejecutar el metodo, no interesa el resultado
        sumarEnteros(val1,val2);
        
    }
        /*El principal objetivo de un metodo es reusar el codigo y separar el codigo, mejorar la estructura del codigo o que sea mas facil agarrar el error
        //bloque de codigo = Main
        // regresa o no un resultado
        int como metodo regresa un numero entero
        un metodo puede tener 0 o n cantidad de parametros SIMPLEMENTE EN CABECERA
        no puedes tener 2 metodos con la misma firma MISMO NOMBRE DE PARAMETRO Y MISMO METODO
        */
       // metodo para sumar 2 numeros enteros 
       // llamar a sus metodos usando verbos y escritos camelCase
       //primer palabra inicia en minusculas y si hay mas palabras usar mayuscula como primera letra
       //1.-Modificadores de accesor, public, protected, privade, default
       //por default dejarle public, por esta materia
       //2.- static --> para usarlos dentro del main 
       //4.-valor de retorno (return) mientras sea un tipo de dato lo puedes regresar.
       //3.- usen void si su metodo no regresa nada
       //4.-nombre del metodo mismas reglas que identificadores
       //5.-lista de parametross
       //1      2     3       4              
       public static int sumarEnteros(int num1, int num2){ 
       /*cada uno tiene que estar independiente*/
       int suma = num1 + num2;
       return suma;
           
           
               }
    
    
    }
    // atributos variables o metodos,o simplemente otras clases
    
    


