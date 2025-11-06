/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica2_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA3_Practica2_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String mensaje;
        int valor;
        
        System.out.println("*********************");
        
        System.out.println("Captura mensaje:");
        mensaje = captu.next();
        
        System.out.println("Captura repeticiones:");
        valor = captu.nextInt();
        
        System.out.println("*********************");
        
        imprimirMensaje(mensaje,valor); // INVOCAMOS EL METODO
        }
    public static void imprimirMensaje(String mensaje,int repeticiones){ // EL NOMBRE DEL METODO SIGUE LAS MISMAS REGLAS QUE UN IDENTIFICADOR
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(mensaje);
        }
        
        
    }
    
}
