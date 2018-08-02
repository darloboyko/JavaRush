package Lavel2;


/*
Предсказание на будущее
*/

import java.io.*;

public class Solution_70 {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge1 = reader1.readLine();
        String sAge2 = reader2.readLine();
        int nAge1 = Integer.parseInt(sAge1);
        int nAge2 = Integer.parseInt(sAge2);
        System.out.println(name + " получает " + sAge1 + " через " + sAge2 + " лет.");
        // Коля получает 3000 через 5 лет.
    }
}
