/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author TrungNT
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputA, inputB;
        
        try
        {
            
            BufferedReader oBufferReader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("\nNhap so thu nhat a=");
            inputA = Integer.parseInt(oBufferReader.readLine());
            
            System.out.print("\nNhap so thu nhat b=");
            inputB = Integer.parseInt(oBufferReader.readLine());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
}
