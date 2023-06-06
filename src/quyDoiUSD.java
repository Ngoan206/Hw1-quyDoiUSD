import java.util.Scanner;

public class quyDoiUSD {
    public static void main(String[] args) {
        double vnc = 230000;
        double usd;
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * 230000;

        System.out.println("Quy doi: " + quyDoi);

    }
}
