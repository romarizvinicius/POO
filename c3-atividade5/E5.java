import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 100;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBUzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        s.close();
    }
}
