package buoi1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        switch(month){
            case 1:
                if(day > 19 && day < 32 ){
                    System.out.println("Bao Binh");
                }else if(day > 0 && day < 20){
                    System.out.println("Ma Ket");
                }
                break;
            case 2:
                if((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0)) {
                    if (day > 0 && day < 19) {
                        System.out.println("Bao Binh");
                    }else if(day > 18 && day < 30){
                        System.out.println("Song Ngu");
                    }
                }else{
                    if (day > 0 && day < 19) {
                        System.out.println("Bao Binh");
                    }else if(day > 18 && day < 29){
                        System.out.println("Song Ngu");
                    }
                }
                break;
            case 3:
                if(day > 0 && day < 21 ){
                    System.out.println("Song Ngu");
                }else if(day > 20 && day < 32){
                    System.out.println("Bach Duong");
                }
                break;
            case 4:
                if(day > 0 && day < 21 ){
                    System.out.println("Bach Duong");
                }else if(day > 20 && day < 31){
                    System.out.println("Kim Nguu");
                }
                break;
            case 5:
                if(day > 0 && day < 21 ){
                    System.out.println("Kim Nguu");
                }else if(day > 20 && day < 32){
                    System.out.println("Song Tu");
                }
                break;
            case 6:
                if(day > 0 && day < 22 ){
                    System.out.println("Song tu");
                }else if(day > 21 && day < 31){
                    System.out.println("Cu Giai");
                }
                break;
            case 7:
                if(day > 0 && day < 23 ){
                    System.out.println("Cu Giai");
                }else if(day >22 && day < 32){
                    System.out.println("Su Tu");
                }
                break;
            case 8:
                if(day > 0 && day < 23 ){
                    System.out.println("Su Tu");
                }else if(day > 22 && day < 32){
                    System.out.println("Xu Nu");
                }
                break;
            case 9:
                if(day > 19 && day < 24 ){
                    System.out.println("Xu Nu");
                }else if(day > 23 && day < 31){
                    System.out.println("Thien Binh");
                }
                break;
            case 10:
                if(day > 0 && day < 25 ){
                    System.out.println("Thien Binh");
                }else if(day > 24 && day < 32){
                    System.out.println("Bo Cap");
                }
                break;
            case 11:
                if(day > 0 && day < 24 ){
                    System.out.println("Bo Cap");
                }else if(day > 23 && day < 31){
                    System.out.println("Nhan Ma");
                }
                break;
            case 12:
                if(day > 0 && day < 23 ){
                    System.out.println("Nhan Ma");
                }else if(day > 22 && day < 32){
                    System.out.println("Ma Ket");
                }
                break;
            default:
                System.out.println("Nhap thang khong hop le");
        }
    }
}
