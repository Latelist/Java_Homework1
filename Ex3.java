import java.util.Scanner;

//Реализовать простой калькулятор


public class Ex3 {
    Float a;
    Float b;
    char op;

    Ex3(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = in.nextFloat();
        System.out.print("Введите операцию: ");
        op = in.next().charAt(0);
        System.out.print("Введите второе число: ");
        b = in.nextFloat();
        in.close();
    }

    public boolean oper() {
        return (op == '/' || op == '*' || op == '+' || op == '-');
    }
    
    public String calc() {
        String str = "";
        if (oper()){
            if (op == '+') {
                str = String.format("%.1f", a+b);
            } else if (op == '-') {
                str = String.format("%.1f", a-b);
            } else if (op == '*') {
                str = String.format("%.1f", a*b);
            } else if (op == '/') {
                str = String.format("%.1f", a/b);
            } 
        }
        else {
            str = "mistake";
        }
        return str;
    }
}
