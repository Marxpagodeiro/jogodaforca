/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jogodaforca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Jogodaforca {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random(); // pegar aleatoriamente  
        
        // lista de palavras
        String[] palavras = {"java","logica","programacao","algoritmo","tecnico","segunda","casa","ifes","informatica"};
        String palavraSort = palavraS(palavras); 
        String letrasUsadas = "";
        char letras;
        char[] letrasCertas = new char[palavraSort.length()];// controlar o acertos do usuario 
        for(int i =0; i<letrasCertas.length;i++){
            letrasCertas[i]=0;
        }
        int vidas = 6;
        boolean ganhou = false;
        
        for(int i = 0; i<palavraSort.length();i++){
                System.out.print(" _ ");
        }
        
        while (!ganhou && vidas > 0){
            
            System.out.println("\n"
                    +"Você tem " + vidas + " vidas" 
                    +"\nletras usadas:" + letrasUsadas
                    +"\nQual a letra que vc deseja tentar? ");
            letras = in.next().charAt(0);
            letrasUsadas += " " + letras;
            
            boolean erro = true;
            for(int i = 0; i<palavraSort.length();i++){
                if(letras == palavraSort.charAt(i)){
                    System.out.println("A palavra tem essa letra na posição " + (i+1));
                    letrasCertas[i]= 1;
                    erro = false;
                }
            }
            if(erro){
                vidas--;
            }
            
            System.out.println("\n");
            ganhou = true;
            for(int i = 0; i<palavraSort.length();i++){
                if(letrasCertas[i] == 0){
                    System.out.print(" _ ");
                    ganhou = false;
                }else{
                    System.out.print(" " + palavraSort.charAt(i) + " ");
                }
            }
            System.out.println("\n");
        }
        if(vidas<1){
            System.out.println("\n Você perdeu, mas sorte da proxima vez.");
            System.out.println("\n A palavra era: " + palavraSort);
        }else{
            System.out.println(" \n Voce ganhou,parabéns seu QI é maior que o de um bolsominiom.");
        }
        System.out.println("Obrigado por jogar meu jogo");
    }
        // sorteio de palavras
    public static String palavraS(String[] palavras){
        Random random = new Random();
        int quantPa = palavras.length; // tamanho do vetor
        int indiceSorte = random.nextInt(quantPa); // posição do vetor para palavra sorteada.
        String palavraSort = palavras[indiceSorte];// palavra sorteada
        return palavraSort;
    }
}
   

