package classAndMethodsAndObject;

class calculator                   //this is a class made for the 
{
    int a = 7;
    int b = 8;
    public int add(){                             //this is called a method 
        System.out.println("Hi");
        return (a+b);
    }
}


public class first1 {
    public static void main(String[] args) {

        calculator calc = new calculator();
        int result = calc.add();
        System.out.println(result);
    }
}
