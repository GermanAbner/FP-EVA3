/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica9_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA3_Practica9_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        imprimir las areas con los cosos
        menu
        calculo1(radio)
        calculo2(base y altura)
        calculo3(base mayor, base menor, altura)
        salir
        
        */
        
        double radio,base,baseM,basem,altura,opcion;
        System.out.println("**************************************");
        System.out.println("*Bienvenido a la calculadora de Areas*");
        System.out.println("**************************************");
                Scanner captu = new Scanner(System.in);
            
            do{
            imprimirMenu();
            opcion = captu.nextInt();
                if (opcion == 1) {
                    areaCirculo();
                    
                }else if (opcion == 2) {
                    areaRectangulo();
                }else if (opcion == 3)
                    areaTrapecio();
                else if (opcion ==55)
                    break;
            }while(opcion != 4);
    }
        
       public static void imprimirMenu(){
        System.out.println("Selecciona una opcion: ");
        System.out.println("1.- Calcular area de un Circulo");
        System.out.println("2.- Calcular area de un Rectangulo");
        System.out.println("3.- Calcular area de un Trapecio");
        System.out.println("Selecciona una opcion: ");
    } 
        public static void areaCirculo(){
        Scanner captu = new Scanner(System.in);
        double radio,resu;
        System.out.println("***********AREA DE UN CIRCULO***************");
        System.out.println("Captura el Radio: ");
        radio = captu.nextDouble();
        System.out.println("*************************************************");
        resu = radio * radio * 3.1416;
        System.out.println("El area de un circulo cuyo radio es " + radio + " Es igual a " + resu);
        System.out.println("*************************************************");
        
    }
        public static void areaRectangulo(){
        Scanner captu = new Scanner(System.in);
        double base,altura,resu;
        System.out.println("***********AREA DE UN RECTANGULO***************");
        System.out.println("Captura la base: ");
        base = captu.nextDouble();
        System.out.println("Captura la Altura: ");
        altura = captu.nextDouble();
        System.out.println("*************************************************");
        resu = base * altura;
        System.out.println("El area de un rectangulo cuya base es " + base + " y su altura es de " + altura +" Es igual a " + resu);
        System.out.println("*************************************************");
        
    }
        public static void areaTrapecio(){
       double baseM,basem,altura,resu;
        Scanner captu = new Scanner(System.in);
        System.out.println("***********AREA DE UN TRAPECIO***************");
        System.out.println("Captura la base mayor: ");
        baseM = captu.nextDouble();
        System.out.println("Captura la base menor: ");
        basem = captu.nextDouble();
        System.out.println("Captura la Altura: ");
        altura = captu.nextDouble();
        System.out.println("*************************************************");
        resu = ((baseM+basem)* altura)/2;
        System.out.println("El area de un Trapecio cuya base mayor es " + baseM + " y su base menor es de " + basem + " y su altura es de " + altura +" Es igual a " + resu);
        System.out.println("*************************************************");
        
    }
}   
    

