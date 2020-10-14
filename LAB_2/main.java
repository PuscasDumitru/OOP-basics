
public class main
{

    public static void main(String[] args)
    {

        BoxShape box_1 = new BoxShape(13, 23, 41);
        BoxShape box_2 = new BoxShape(31);
        BoxShape box_3 = new BoxShape();


        Queue Queue1 = new Queue(3);
        Queue Queue2 = new Queue();
        Queue1.push(111);
        Queue1.push(32);
        Queue1.push(51);
        System.out.println("Queue1: "+ Queue1.showQueue());
        Queue2.push(17);
        Queue2.push(32);
        Queue2.push(123);
        Queue2.pop();
        System.out.println("Queue2: "+ Queue2.showQueue() + "\n");


        System.out.println("Box 1 volume is: " + box_1.Volume());
        System.out.println("Box 2 volume is: " + box_2.Volume());
        System.out.println("Box 3 volume is: " + box_3.Volume() + "\n");

        System.out.println("Box 1 surface area is: " + box_1.Surface());
        System.out.println("Box 2 surface area is: " + box_2.Surface());
        System.out.println("Box 3 surface area is: " + box_3.Surface() + "\n");

        Queue Queue3 = new Queue();
        Queue3.isEmpty();

        Queue Queue4 = new Queue(2);
        Queue4.push(577);
        Queue4.push(69);
        Queue4.isFull();

        Queue3.push(313);
        Queue3.push(900);
        Queue3.push(212);
        Queue3.push(1);
        Queue3.isFull();

        Queue Queue5 = new Queue(4);
        Queue5.push(41);
        Queue5.push(5);
        Queue5.push(2);
        Queue5.isFull();


    }

}