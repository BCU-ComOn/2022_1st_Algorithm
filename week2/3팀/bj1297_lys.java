import java.util.Scanner;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int diagonal =   sc.nextInt();
        	int height  =   sc.nextInt();
		int width   =   sc.nextInt();
        sc.close();
        
        double d = Math.sqrt(Math.pow(height, 2 ) + Math.pow(width,2));
        
        int h = (int) Math.floor(height * (diagonal / d));
        int w = (int) Math.floor(width * (diagonal / d));
        
        System.out.println(h + " " + w);
        }
}
