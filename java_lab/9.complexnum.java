                                              
import java.util.Scanner;

public class complexnum {

    int real, imaginary;
 
    complexnum(int real, int imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }

    complexnum add(complexnum other) {

        complexnum sum = new complexnum(0, 0);

        sum.real = this.real + other.real;

        sum.imaginary = this.imaginary + other.imaginary;

        return sum;

    }

    void display() {

        System.out.println("Sum of complex number is :"+this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first CN");
        complexnum cn1 = new complexnum(sc.nextInt(), sc.nextInt());
        System.out.println("enter the     the second CN");
        complexnum cn2 = new complexnum(sc.nextInt(), sc.nextInt());

        complexnum sum = cn1.add(cn2);
        sum.display();

    }
}