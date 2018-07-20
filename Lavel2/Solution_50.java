package Lavel2;

public class Solution_50 {
    public static int min(int a, int b, int c) {
        int m2;
        if (a <= b && a <= c)
            m2 = a;
        else
          if (b <= a && b <= c)
            m2 = b;
             else
                 if (c <= a && c <= b)
                m2 = c;
            else
                m2 = a;

        return m2;


        //напишите тут ваш код
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
