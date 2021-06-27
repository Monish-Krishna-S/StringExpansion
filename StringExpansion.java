/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2;
import java.util.Scanner;
/**
 *
 * @author Monish Krishna Selva
 */
public class StringExpansion {

    /**
     * @param args the command line arguments
     */
    public static void start() {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int len = input.length();
        char[] A = input.toCharArray();
        for(int i=0; i<len; i++){
            int times,a;
            if((A[i]>='a'&&A[i]<='z')||(A[i]>='A'&&A[i]<='Z')){
                if((i!=len-1)&&(A[i+1]!='0')) System.out.print(A[i]+" ");
                else if(i==0&&len==1) System.out.print(A[i]);
                else if(i==len-1) System.out.print(A[i]);
            }else{
                times = (int)A[i] - '0';
                char t0 = A[i-1]; 
                for(;i<len-1 && !(A[i+1] >= 'a' && A[i+1] <= 'z');){
                  a = (int)A[i+1] - '0';
                  times = times*10 + a;
                  i = i+1;
                }
                for(int x=0; x<times-1;x++){
                  System.out.print(t0+" ");
                }
            }
        
        }
    }
}
