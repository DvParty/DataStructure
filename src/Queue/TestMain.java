package Queue;

public class TestMain {

    public static void main(String[] args) {

        Queue q =  new Queue();

        q.enQueue("1st");
        q.enQueue("2nd");
        q.enQueue("3rd");

        q.element(); //  3rd

        q.enQueue("4th");

        q.element();

        q.enQueue("5th");


        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();

    }

}