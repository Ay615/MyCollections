package cubecarttest;

public class Singlton {
    //In oop,a singleton class is a class that can have only once object(instance of the class) at a time
    //how to design singleton class
    //1.make constructor as private
    //2.write a public static method (getInstance) that has return type of object of this singleton class
    //also called lazy initialization
    //Car c1=new Car();      Car c1=null;
    private static Singlton singletonInstance=null;
    public String str;
     private Singlton(){
         str="Hi, singleton pattern";
     }
     public static Singlton getInstance(){
         if(singletonInstance==null)
             singletonInstance=new Singlton();
         return singletonInstance;
     }
    public static void main(String[] args) {
        Singlton s1=Singlton.getInstance();
        Singlton s2=Singlton.getInstance();
        Singlton s3=Singlton.getInstance();
        s1.str=(s1.str).toUpperCase();
        System.out.println(s1.str);
        System.out.println(s2.str);
        System.out.println(s3.str);
    }


}
