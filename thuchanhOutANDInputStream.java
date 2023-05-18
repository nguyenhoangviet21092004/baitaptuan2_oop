package baitaptuan5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class thuchanhOutANDInputStream {
    public static void main(String[] args) throws Exception {
        File file = new File("person.dat");
        FileOutputStream fileOutputStream = new FileOutputStream("person.dat");

        String a = "nguyen hoang viet";
        byte [] b = a.getBytes();

        fileOutputStream.write(b);
        fileOutputStream.close();
        System.out.println("Complete!");

        FileInputStream fileInputStream = new FileInputStream("person.dat");


        int i ;
        while ((i = fileInputStream.read() )!= -1) {
            System.out.print((char) i);
        }


        fileInputStream.close();
    }
}


