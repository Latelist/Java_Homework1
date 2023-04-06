import java.util.Scanner;

public class Ex4 {
    static String eq;

    Ex4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите уравнение вида q + w = e: ");
        eq = sc.nextLine();
        sc.close();
    }

    public static String[] splitter() {
        String[] res = eq.split("\\s");
        return res;
    }

    public static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public static String[] changer(int i) {
       char c = '?';
       String ch = Integer.toString(i);
       char[] chars = ch.toCharArray();
       String[] str = splitter();
       for (int j = 0; j < str.length; j++) {
        if (str[j].indexOf(c) != -1) {
            str[j] = str[j].replace('?', chars[0]);
        }
       }
       return str;
    }

    public static boolean contain(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return true;
            }     
        }
        return false;
    }

    public static int[] intoNums(String[] str) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (isNumber(str[i])) {
                count++;
            }
        }
        int[] nums = new int[count];
        for (int j = 0; j<nums.length; j++) {
            for (int n = 0; n < str.length; n++) {
                if (isNumber(str[n]) && !contain(nums, Integer.parseInt(str[n]))) {
                    nums[j] = Integer.parseInt(str[n]);
                    break;
                }
            }
        }
        return nums;
        }
    
    public static int calc(String[] str, int[] nums) {
        char[] chars = str[1].toCharArray();
        int res = 0;
        if (chars[0] == '+'){
            res = nums[0] + nums[1];
        } else if (chars[0] == '-') {
            res = nums[0] - nums[1];
        } else if (chars[0] == '*') {
            res = nums[0] * nums[1];
        } else if (chars[0] == '/') {
            res = nums[0] / nums[1];
        }
        return res;
    }

    public static boolean compare(int res, int num) {
        if (res == num) {
            return true;
        }
        return false;
    }

    public static String finder() {
        String result = "There is no solution";
        for (int i = 0; i < 10; i++) {
            String[] changed_str = changer(i);
            int[] nums = intoNums(changed_str);
            int res = calc(changed_str, nums);
            if (compare(res, nums[nums.length-1])) {
                return String.join(" ", changed_str);
            }
        }
        return result;
    }



    }

    

