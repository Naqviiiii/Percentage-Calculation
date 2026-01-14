import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double GM ;
        int TM;
        double P;
        System.out.print("Enter your obtained marks :");
        GM = input.nextDouble();
        System.out.print("Enter your total marks :");
        TM = input.nextInt();
        P = GM*100/TM;    
        System.out.print(P+"%");
        input.close();
    }
}    
    



