/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica3_25550584;

import java.util.Scanner;   

/**
 *
 * @author miria
 */
public class EVA3_Practica3_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner captu = new Scanner(System.in);
            int opcion;
            do{
            imprimirMenu();
            opcion = captu.nextInt();
                if (opcion == 1) {
                    calcularPotencia();
                    
                }else if (opcion == 2) {
                    calcularSuma();
                }
            }while(opcion != 3);
    }
    public static void imprimirMenu(){
        System.out.println("************************");
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar 2 numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
        
        
    }
    public static void calcularPotencia(){
        Scanner captu = new Scanner(System.in);
        int base, exp, resu;
        System.out.println("***********CALCULO DE UNA POTENCIA***************");
        System.out.println("Captura la base: ");
        base = captu.nextInt();
        System.out.println("*************************************************");
        System.out.println("Captura el exponente: ");
        exp = captu.nextInt();
        System.out.println("*************************************************");
        System.out.println(base + " elevado a " + exp + " = " + calcularPot(base,exp));
        
    }
    public static int calcularPot(int base, int exp){
        int resu = 1; // EN CASO DE UN ACUMULADOR O RPETICION EMPEZAMOS EN 0
        for (int i = 1; i <= exp; i++) {
            resu = resu*base;
        }
    return resu;   
    }
    public static void calcularSuma (){
        Scanner captu = new Scanner(System.in);
        int num1, num2,resu;
        System.out.println("***********CALCULO DE UNA POTENCIA***************");
        System.out.println("Captura el primer numero: ");
        num1 = captu.nextInt();
        System.out.println("*************************************************");
        System.out.println("Captura el segundo numero: ");
        num2 = captu.nextInt();
        System.out.println("*************************************************");
        System.out.println(num1 + " sumado a " + num2 + " = " + calcularSum(num1,num2));
    }
    public static int calcularSum (int num1, int num2){
        int resu;
        resu = num1 + num2;
        return resu;
    }
}
