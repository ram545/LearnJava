package practice;

public class Operators {
    int a = 5, b = 4, c = 6;

    public void callAllOperators(){
        this.arithematicOperator();
        this.assignmentOperators();
        this.unaryOperators();
        this.relationalOperators();
        this.logicalOperator();
        this.bitwiseOperators();
        this.ternaryOperator();
    }

    void unaryOperators(){
        System.out.println("Value of Unary plus" + (+a));
        System.out.println("Value of Unary minus" + (-b));
        System.out.println("Value of Unary Post and Pre increment "+ (a++) +  " and " + (++a));
        System.out.println("Value of Unary Post and Pre decrement "+ (b--) + " and " + (--b));
    }

    void relationalOperators(){
        System.out.println("a greater than or equal to b" + (a >= b) );
        System.out.println("b less than or equal to c" + ( b <= c) );
        System.out.println("a not equal to b" + (a != b));
        System.out.println("a equal to b" + (a == b));
    }

    void bitwiseOperators(){
        System.out.println("Value of bitwise and " + (a&b));
        System.out.println("Value of bitwise or " + (a|b));
        System.out.println("Value of bitwise Xor " + (a^b));
        System.out.println("Value of bitwise Negation " + (~a));
        System.out.println("Value of bitwise right shift " + (a>>2) );
        System.out.println("Value of bitwise left shift " + (a<<3) );
    }

    void assignmentOperators(){
        System.out.println("Value of a = b is " + (a=b));
        a += b;
        System.out.println("Value of a += b is " + a);
        a -= b;
        System.out.println("Value of a -= b is " + a);
        a *= b;
        System.out.println("Value of a *= b is "+ a);
        a /= b;
        System.out.println("Value of a/=b is " + a);
        a %= b;
        System.out.println("Value of a%=b is" + a);
    }

    void ternaryOperator(){
        System.out.println("Greatest of a,b,c is "+ ((a>b)?((a>c)?a:c):((b>c)?b:c)));
    }

    void logicalOperator(){
        System.out.println("Value of a && b is " + ((a>b) && (a>c)));
        System.out.println("Value of a || b is " + ((b>c) || (b > a)));
        System.out.println("Value of !a is " + !(a>c));
    }

    void arithematicOperator(){
        System.out.println("Sum of a and b "+ (a+b));
        System.out.println("A minus B is " + (b-a));
        System.out.println("Multiply " + (a*b));
        System.out.println("division " + (b/c));
        System.out.println("Modulo " + (b%c));
    }
}

