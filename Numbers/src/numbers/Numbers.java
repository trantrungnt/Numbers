/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

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
                                    
            System.out.print("\nUSCLN cua " + inputA + " va " + inputB + " la: " + USCLN(inputA, inputB));
            System.out.println();
            
            //tim Boi so chung nho nhat cua a va b
            int bscnn;
            bscnn = (inputA * inputB)/USCLN(inputA, inputB);
            System.out.print("\nBSCNN cua " + inputA + " va " + inputB + " la: " + bscnn);
            
            //tinh giai thua cua cac so vua nhap tu ban phim
            System.out.print("\nGiai thua cua so " + inputA + " la: " + calculateGiaiThua(inputA));
            System.out.print("\nGiai thua cua so " + inputB + " la: " + calculateGiaiThua(inputB));
            
            System.out.println();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    
    //tim uoc so chung lon nhat cua 2 so a va b
    public static int USCLN(int x, int y)
    {
        int r;
            while(y!=0)
            {
                r = x % y;
                x = y;
                y = r;
            }
        return x;
    }
    
    //Tinh giai thua cua 1 so
    public static int calculateGiaiThua(int x)
    {
        if(x==0)        
            return 1;
        
        return x*calculateGiaiThua(x-1);
    }
    
    //Kiem tra so Nguyen to
    public static boolean isNguyenTo(int x)
    {
        if(x<2) //cac so nguyen nho hon 2 khong phai la so nguyen to
            return false;
        
        //duyet cac so nguyen chia het va khong con so du khong phai la so nguyen to
        for(int i=2; i<=Math.sqrt(x); i++)
            if(x%i==0)
                        return false;
        
        return true;
    }
}
