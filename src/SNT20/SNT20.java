package SNT20;

import java.util.Scanner;

public class SNT20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        double n = 2.0;
        while (count!=20){
            if (n==2){
                System.out.print( n + " , ");
                count++;
            }else {
                boolean flag = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n%i == 0){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.print(n + " , ");
                    count ++;
                }
            }
            n++;
        }
    }
}
