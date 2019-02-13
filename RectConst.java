class Rectangle{
    public
        float length, breadth;

    public Rectangle(float l, float b) {
        length = l;
        breadth = b;
	}
    float calArea(){
        return length*breadth;
    }
}

public class RectConst{
    public static void main(String args[]) {
        float l = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        Rectangle r1 = new Rectangle(l, b);
        System.out.println("The Result is: " + r1.calArea());
    }
}