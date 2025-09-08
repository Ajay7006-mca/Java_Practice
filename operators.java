import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for first variable:");
        int a= sc.nextInt();
        System.out.println("Enter the value for second variable:");
        int b= sc.nextInt(); 
        //Arthimetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        //Logical Operators
        if(a==b && a<b){
       System.out.println(true);
        }
        else{
            System.out.println(false);
        }
   sc.close();
    }
}

