import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();

        System.out.print(combinate(Num));
    }

    public static int combinate(int Num) {
        return Num*Num - Num;
    }

}