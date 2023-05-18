package baitaptuan5;

import java.io.*;

class Student {
     int id;
    String name ;
    int age ;

     public Student(int id, String name, int age) {
         this.id = id;
         this.name = name;
         this.age = age;
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

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

 class TestStudent {
     public static void main(String[] args) throws Exception {
         File file = new File("student.txt");

         Student[] student = new Student[2];
         student[0] = new Student(1,"viet hoang nguyen " , 81);
         student[1] = new Student(2,"nguyen hoang viet " , 18);


         OutputStream outputStream= new FileOutputStream(file);
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

         objectOutputStream.writeObject(student);



     }
 }
  