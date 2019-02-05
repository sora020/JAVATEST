//Normal class and object Example
class Rectangle {
    float length, breadth;

    void rectangle(float x, float y) {
        length = x;
        breadth = y;
    }

    float calArea() {
        return length * breadth;
    }
}

public class Rectmain {
    public static void main(String args[]) {
        float l, b;
        l = Float.parseFloat(args[0]);
        b = Float.parseFloat(args[1]);
        Rectangle r1 = new Rectangle();
        // Rectangle r2 = new Rectangle();
        r1.rectangle(l, b);
        // r2.length = l;
        // r2.breadth = b;
        System.out.println("The Result is: " + r1.calArea());
    }
}
