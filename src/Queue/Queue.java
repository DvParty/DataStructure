package Queue;

public class Queue {
    private Node head;
    private int front = -1;
    private int rear;

    /**
     * 데이터 입력
     * @param input
     */
    public void enQueue(Object inputObj){

        Node newNode = new Node(inputObj);

        if (isEmpty()) {
            this.head = newNode;
        } else {
            Node tmp = new Node();
            tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }// while()
            tmp.setNext(newNode);
        }
        this.front++;
        printQ();

    }// enQueue()

    /**
     * 데이터 리턴 및 삭제
     * @return
     */
    public void deQueue(){
        if (isEmpty()) {
            printQ();
            return;
        } else {
            Node rear = this.head;
            Node newRear = rear;
            while (rear.getNext() != null) {
                newRear = rear;
                rear = rear.getNext();
            }// while()
            System.out.println("deQueue >> " + rear.getValue() + " deleted..");
            newRear.setNext(null);
        }
        this.front--;
        printQ();
    }// deQueue()

    /**
     * 데이터 리턴
     * @return
     */
    public void element(){

        Node tmp = this.head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        System.out.println("now >> " + tmp.getValue());
    }// element()

    public boolean isEmpty(){
        return this.front <= -1;
    }// isEmpty()

    public void printQ () {
        if (isEmpty()) {
            System.out.println("There is no Node...");
        } else {
            Node tmp = new Node();
            tmp = this.head;
            while (tmp.getNext() != null) {
                System.out.print(tmp.getValue() + "\t");
                tmp = tmp.getNext();
            }// while()
            System.out.print(tmp.getValue() + "\n");
        }
        System.out.println("======================");
    }// printQ()
}