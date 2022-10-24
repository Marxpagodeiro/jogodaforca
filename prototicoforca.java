/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jogodaforca;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class prototicoforca {

    public static void main(String[] args) {
        
        String[] palavras = {"java","logica"};
        String[] letrasEsco = {"j","a","v","a","l","o","g","i","c","a"};
        char[] jogo;
        int contErro = 0;
       // criar a função jogo 
       // criar variavel venceu , com uma função para a condição da vitoria 
       
       while(contErro<6 || !venceu(função de vitoria)){
        imprimir jogo = //função jogo;
        char[] a = perguntarcaracter( função de pergunta);
        }
    }
    public static String perguntachar(char x){
        Scanner in = new Scanner(System.in);
        System.out.println("qual a letra");
        String resp = in.next();
        return resp;
        
    }
    public static char[] criarJogo(String letrasEsco){
        char[]resp=new char[letrasEsco.length()];
        for(int i=0;i<resp.length;i++){
            resp[i]='s'; 
        }
        return resp;
    }
}
