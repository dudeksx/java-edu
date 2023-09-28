public class PrimitiveTypes {

  public static void main(String[] args) throws Exception {
    // Below there are the types of variables
    byte age = 25;
    short year = 2023;
    int phone = 52839109;
    long id = 1994854778L;
    final float PI = 3.14F;
    double salary = 1500;

    String name = "user";
    System.out.println(name);

    System.out.println(age);
    System.out.println(year);
    System.out.println(phone);
    System.out.println(id);
    System.out.println(PI);
    System.out.println(salary);
    System.out.println("--------------");

    //Differences between Variables and CONSTANTS
    age = 10;
    System.out.println(age);
    //PI = 3.15F; in this case, pi can't be modified because the word "final" makes it a CONSTANT, it's a good practice to write constants as UPPER CASE.
  }
}
