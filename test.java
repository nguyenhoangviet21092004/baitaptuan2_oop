package baitaptuan5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class test {
    public static void main(String[] args) {


        byte array[] = {1,2,3,4,5};

        try{

            FileOutputStream fout = new FileOutputStream("testout.txt");
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0 ; i < array.length ; i++) {
                dout.writeInt(array[i]);
                dout.close();
            }
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
class ttt{
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("testin.txt");
            String s = "Welcome to java.";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fout.close();
        }


    }
}