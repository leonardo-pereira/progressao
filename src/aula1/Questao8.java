/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author leonardo
 */
public class Questao8 {
    public static void main(String[] args) {
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
        // erro c = c+i;
        s+=i;
        // erro i+=s;
        // erro c+=s;
        i+=l;
        
    }
   
}
