package baitaptuan2;

 abstract class Peoples {
    public String name ;
    public int age;
    public boolean gender;

    public Peoples(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Peoples(){}

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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public  abstract void Eat();



    public abstract void Sleep();


    public abstract void Study();


}

interface Students{
    void registerCourse(String course);

    void attendClass();
}

interface Employees {
    void work() ;
    void takeABreak();
}

class Studentt extends Peoples implements Students{


  public Studentt(String name,int age,boolean gender){
      super(name, age, gender);
  }
   public void Eat() {

       System.out.println("Eat");
    }
    public void Sleep() {

    }
    public void Study() {

    }

   public void registerCourse(String course){

       System.out.println("ha thanh tinh");

       this.name = course;
    }



   public void attendClass(){

    }

}

class TestPeoples{
    public static void main(String[] args) {
        Studentt studentt = new Studentt("viet" ,18,true);
        System.out.println(studentt.getAge() + studentt.getName() +studentt.isGender());
        studentt.Eat();
        studentt.attendClass();

        studentt.registerCourse("nguyen hoang viet");
        studentt.Sleep();
        studentt.Study();


    }
}
