//Вывести все простые числа от 1 до 1000

public class Ex2 {
    public void simples() {
        for (int i = 1; i <=1000; i+=2) {
            for (int j = 3; j < i; j++){
                if (i % j == 0) {
                    break;
                }
                else if (j == i-1){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
