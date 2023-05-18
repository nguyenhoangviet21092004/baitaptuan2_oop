package baitaptuan5;

import java.io.*;

class Product implements Serializable   {
     int id ;
     String name;
     int price;
     public Product() {}

     public Product(int id, String name, int price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", price=" + price +
                 '}';
     }


 }

 class ProductProcess{
     public  static boolean writeObjectData(Product [] objProduct, String fileName) throws Exception{

         try{
             FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

             objectOutputStream.writeObject(objProduct);
             objectOutputStream.close();
             return true;
         }catch (Exception e) {
             System.out.println(e);
             return false;
         }

     }

     public Product[] readObjectData(String fileName) throws Exception{

         Product[] products = null;

         try {
             FileInputStream fileInputStream = new FileInputStream(fileName);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             products = (Product[]) objectInputStream.readObject();

             for (Product a: products
                  ) {
                 System.out.println(a);
             }
             objectInputStream.close();

         }catch (Exception e){
             System.out.println(e);
         }

         return products;


     }
 }

 class ProductApp{
     public static void main(String[] args) throws Exception {



            Product product = new Product();
            product.setId(1);
            product.setName("nguyen hoang viet");
            product.setPrice(20);
            Product product1 = new Product(2,"viet hoang nguyen",18);
            ProductProcess productProcess = new ProductProcess();
            Product [] array = new Product[2];
            array[0] = new Product(1,"nguyen hoang viet",10);
            array[1] = new Product(2,"nguyen hoang viet",30);


            ProductProcess.writeObjectData(array,"object.dat");
            productProcess.readObjectData("object.dat");

     }
 }
