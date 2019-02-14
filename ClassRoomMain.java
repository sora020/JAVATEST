class Room
{
    private
        float length, breadth;
    public
        Room(float length, float breadth)
        {
            this.length = length;
            this.breadth = breadth;
        }
        float area()
        {
            return length*breadth;
        }
}
class ClassRoom extends Room
{
    private
        float height;
    public
        ClassRoom(float length, float breadth, float height)
        {
            super(length, breadth);
            this.height = height;
        }
        float volume()
        {
            return (area()*height);
        }
}
public class ClassRoomMain
{
    public static void main(String args[])
    {
        ClassRoom c = new ClassRoom(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
        System.out.println("The Area is: " + c.area());
        System.out.println("The Volume is: " + c.volume());
    }
}