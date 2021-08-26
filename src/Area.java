/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author cmdhn
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        System.out.println("Realizando o cálculo da área de um triângulo");
            int base;
            int altura;
            int num = 2;
            
            Scanner leitor = new Scanner(System.in);
                System.out.println("Digite o valor da base:");
                        base = leitor.nextInt();
                    System.out.println("Digite o valor da altura:");
                        altura = leitor.nextInt();
                        System.out.println("A área do triângulo com base nos valores obtidos é");
                        System.out.println( (base * altura)/ num );
  
    }
    
}
