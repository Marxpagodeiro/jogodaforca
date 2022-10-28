/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaforca;

import java.util.Scanner;

/**
 *
 * @author 20222tpmi0035
 */
public class Jogodaforca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String palavra;
        char letra;
        int i=0;
        
        System.out.println("qual a palavra? ");
        palavra = in.next();
        System.out.println("qual é a letra?");
        letra = in.next().charAt(i);
        
        char[] enigma = new char[palavra.length()];
        enigma = sublinhado(enigma);
        substituiLetra(palavra,letra,enigma);
        boolean buscRep = buscarRepositorio(enigma,letra);
        boolean ganhou = ganhou(enigma);
        char[] insLet = inserirLetra(enigma,letra);
        String listRep = listarRepositorio(enigma);
        
        
       
        String resp = new String(enigma);
        System.out.println(resp);
        
    }

    public static char[] sublinhado(char[] vet){
       char[] caracteres = new char[vet.length];
       for(int i = 0;i<vet.length;i++){
            caracteres[i]='_';
        }
        return caracteres;
    }
    public static void substituiLetra(String palavra,char letra,char[]enigma){
         for(int i = 0;i<palavra.length();i++){
            
          if(letra == palavra.charAt(i)){
                
                enigma[i] = palavra.charAt(i); 
            }          
        }
        
    }
    public static boolean buscarRepositorio(char[] vet,char letra){
        boolean resp = false;
        for(int i=0;i<vet.length;i++){
            if(letra==vet[i]){
                resp=true;
                break;
            }
        }
        return resp;
    }
    public static char[] inserirLetra(char[]vet,char letra){
        char[] resp = vet;
        for(int i=0;i<vet.length;i++){
            if(vet[i]=='_'){
                vet[i]=letra;
                break;
            }
        }
        return resp;
    }
    public static String listarRepositorio(char[]vet){
        String resp ="";
        for(int i=0;i<vet.length;i++){
            if(vet[i]!='_'){
                resp = resp + vet[i] + " ";
            }else{
                break;
            }
        }
        return resp;
        
    }
    public static boolean ganhou(char[] vet){
        boolean resp = true;
        for(int i =0;i<vet.length;i++){
            if(vet[i] == '_'){
                resp=false;
            }
        }
        return resp;
    } 
    
}
