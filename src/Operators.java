public class Operators {

  public static void main(String[] args) {
    //class operators
    // The = operator means attribution
    int age = 22;
    double sum = 10.5 + 15.7;
    int subtraction = 10 - 5;
    int multiplication = 10 * 10;
    int division = 100 / 10;
    int module = 10 % 5;
    double result = (10 * 10) + (1000 / 10);

    //When a sum operator is used with a string, it concatenates texts.
    String completeName = "User" + "name";
    System.out.println(completeName);

    System.out.println(age);
    System.out.println(sum);
    System.out.println(subtraction);
    System.out.println(multiplication);
    System.out.println(division);
    System.out.println(module);
    System.out.println(result);

    System.out.println(
      "----------------------------------------------------------------------------------------------"
    );
    //Unary operators
    //the unary operator + makes a result positive, when the number is already positive there's no need to add this operator before it.
    int number = 5;
    //But if we add a - signal before it, the code change the result to a negative number, the oposite can happen too.
    System.out.println(-number);
    // But since the - operator is put while the number is being printed, that doesn't mean the var number gonna be negative.
    System.out.println(number);
    //If your objective is to really make it negative you need to change it directly.
    number = -number;

    System.out.println(
      "----------------------------------------------------------------------------------------------"
    );
    // The operator ++ and -- increment and decrement, respectively, a number.
    int ageLoop = 10;
    ageLoop++;
    System.out.println(ageLoop);

    System.out.println(
      "----------------------------------------------------------------------------------------------"
    );

    boolean isAlive = false;
    // The ! operator changes the boolean value of a variable.
    System.out.println(!isAlive);

    System.out.println(
      "----------------------------------------------------------------------------------------------"
    );
    // A ternary operator need a condition to be satisfied, just like a IF block.
    int a, b;
    String results = "";

    a = 5;
    b = 6;

    // Using a IF block would be like this:
    // if (a == b) results = "true"; else results = "false";
    // System.out.println(results);

    // Using a ternary operator:
    results = a == b ? "true" : "false";
    System.out.println(results);
    System.out.println(
      "----------------------------------------------------------------------------------------------"
    );
    // Relational operators compare two diferent variables or expressions.
    int number1 = 1;
    int number2 = 2;

    if (number1 > number2) System.out.println(
      "number 1 is bigger than number 2"
    );
    if (number1 < number2) System.out.println(
      "number 2 is bigger than number 1"
    );

    // The operator ! = means "different from"
    boolean yesNo = number1 != number2;
    System.out.println("Number 1 is different from Number 2? " + yesNo);

    // It is possible to compare some strings too.
    String name1 = "user";
    String name2 = "user";
    System.out.println(name1.equals(name2));

    System.out.println(
      "----------------------------------------------------------------------------------------------"
    );
    // Logical operators.
    boolean condition1 = true;
    boolean condition2 = false;

    // On this case, the operator && means kinda like "and" comparing both the conditions
    if (condition1 && condition2) {
      System.out.println("Both conditions are true");
    }

    // The operator || stands for "OR", if one of the conditions is true, the block is executed.
    if (condition1 || condition2) {
      System.out.println("One of the conditions is true");
    }
    System.out.println("end");
  }
}
