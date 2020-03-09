package facadePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static int ch;  
    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
        	System.out.print("WELCOME TO VELLANKI FOODS\n");
            System.out.print("1. Kalakand\n");  
            System.out.print("2. Halwa\n");
            System.out.print("3. Exit\n");  
            System.out.print("Enter your choice: ");  
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            ch=Integer.parseInt(br.readLine());  
            ShopKeeper sk=new ShopKeeper();
            switch (ch) {
            	case 1:
            		sk.KalakandSale();
            		break;  
            	case 2:  
                    sk.HalwaSale();        
                    break;
                default:
                	System.out.println("ThankYou...");
                	return;
            }
        }
        while(ch != 4);
    }
}