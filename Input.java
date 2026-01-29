import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int ok=sc.nextInt();
        System.out.println(ok);
        System.out.println("Enter string");
        String f=sc.nextLine();
        System.out.println(f);
        sc.close();
    }
}
