import java.util.Scanner;
public class Main {
       public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int N = Integer.parseInt(sc.nextLine());
             String input ;
             int iter = 0;
             String target = "";
             
             for (int i = 0 ; i < N ; i++)
             {
                    input = sc.nextLine();
                    iter = Integer.parseInt(input.split(" ")[0]);
                    target = input.split(" ")[1];
                    String newStr ="";
                    for (int j = 0 ; j < target.length(); j++)
                    {
                           for(int k = 0 ; k < iter ; k++)
                           {
                                 newStr += target.charAt(j);
                           }
                    }
                    System.out.println(newStr);
             }
       }
}