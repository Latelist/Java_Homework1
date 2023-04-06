import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Ex1 {
    int n;
    int sum = 0;
    int factorial = 1;

    Ex1(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number n: ");
        n = in.nextInt();
        in.close();
    }

    public int triangle_num() {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int get_factorial() {
        for (int i = 1; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
