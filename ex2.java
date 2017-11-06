import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        char ch = scn.next().charAt(0);
        for (int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < b ; j++){
                System.out.println(ch);
            }
            System.out.println();
        }

    }

}
