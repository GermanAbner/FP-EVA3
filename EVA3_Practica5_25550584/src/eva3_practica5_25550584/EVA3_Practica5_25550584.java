/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica5_25550584;

/**
 *
 * @author miria
 */
public class EVA3_Practica5_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int valor[] = new int [1]; // new --> Objetos
         valor[0] = 5;                          //new es algo distinto a lo normal
            System.out.println(valor);
        System.out.println("valor (antes) = " + valor[0]);
        incrementar(valor);
        System.out.println("valor (ahora) = " + valor[0]);
    }
    public static void incrementar(int[] val){
    //se manda una copia mas no es la originall, una evs editada la copia no se va a editar la originall
                //OBVIO PAPA OBVIO
                System.out.println(val);
                for (int i = 0; i < val.length; i++) {
                val[i] = val[0] + 1;
                
        }
                //valor++
        
    }
    
}
