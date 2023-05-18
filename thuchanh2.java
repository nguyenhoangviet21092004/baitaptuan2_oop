package baitaptuan5;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class thuchanh2 {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap du lieu muon luu");
        String i = sc.nextLine();
        writeData(i, "data.dta");
        ReadFile("data.dta");



    }

    public  static boolean writeData(String Data , String fileName) throws Exception{


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(Data.getBytes());
            fileOutputStream.close();
            System.out.println("-----");
            System.out.println("Complete");

            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    private static String ReadFile(String fileName) throws Exception {
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            int i ;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char) i);
            }

            fileInputStream.close();
        }catch (Exception e) {
            System.out.println(e);
        }
        return "complete";
    }
}
