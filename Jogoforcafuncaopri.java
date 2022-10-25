/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforcafuncao;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Jogoforcafuncaopri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra;
        char letra;
        int i=0;
        System.out.println("qual a palavra? ");
        palavra = in.next();
        System.out.println("qual é a letra?");
        letra = in.next().charAt(i);
        char[] letrasCertas = letraDaPalavra(palavra);
        char[] enigma = sublinhado(palavra);
        enigma = substituiLetra(palavra,letra,enigma);
        
       
        String resp = new String(enigma);
        System.out.println(resp);
        
    }
    public static char[] letraDaPalavra(String minhaPalavra){
        char[] caracteres = new char[minhaPalavra.length()];
        for(int i = 0;i<minhaPalavra.length();i++){
            caracteres[i]=minhaPalavra.charAt(i);
        }
        return caracteres;
    }
    public static char[] sublinhado(String palavra){
       char[] caracteres = new char[palavra.length()];
       for(int i = 0;i<palavra.length();i++){
            caracteres[i]='_';
        }
        return caracteres;
    }
    public static char[] substituiLetra(String palavra,char letra,char[]enigma){
         for(int i = 0;i<palavra.length();i++){
            
          if(letra == palavra.charAt(i)){
                
                enigma[i] = letra; 
            }          
        }
        return enigma;
    }    
}
