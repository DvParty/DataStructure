package LinkedList;

public class ListSolution {

    public static void main(String[] args) {

        LinkeList list = new LinkeList();
        list.addLast("Monday");
        list.addLast("Tuesday");
        list.addLast("Friday");

        list.addFirst("Sunday");

        list.insert(4, "Wednesday");
        list.insert(5, "Thursday");

        Node removeFirst1 = list.removeFirst();
        System.out.println("removed : " + removeFirst1.getValue());

        Node removeLast1 = list.removeLast();
        System.out.println("removed : " + removeLast1.getValue());

        Node removed = list.remove(4);
        System.out.println("removed : " + removed.getValue());

        Node getNode = list.get(2);
        System.out.println("get : " + getNode.getValue());

    }// main()

}