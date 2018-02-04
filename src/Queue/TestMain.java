package Queue;

public class TestMain
{
	public static void main(String[] args) 
    {

        System.out.println("test");
        ArrayQueue arrayQueue= new ArrayQueue(10);
        System.out.println(arrayQueue.empty());
        arrayQueue.insert(2);



    }
}