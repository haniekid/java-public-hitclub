package buoi2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String s = "        28 Trinh  tHu   hA ";

        System.out.println("Xoa cac so co trong chuoi: ");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                s = s.replace(String.valueOf(s.charAt(i)), " ");
            }
        }
        System.out.println(s);

        System.out.println("Xoa dau cach thua: ");
        String s1 = s.replaceAll("\\s+", " ").trim();
        System.out.println(s1);

        System.out.println("Viet hoa chu cai dau, cac chu cai sau viet thuong: ");
        String[] words = s1.split(" ");
        s1 = "";
        for( int i = 0; i < words.length; i++){
            s1 += String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(s1);


    }
}
