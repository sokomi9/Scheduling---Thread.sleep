class Greeting extends Thread
{
    public void run(){
        for(int i = 1; i<=30; i++){
            System.out.println("Hello  world!");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }  
    }
}
class Vehicles extends Thread
{
    public void run(){
        for(int i = 1; i<=30; i++){
            System.out.println("Lamborghini");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
/**
 * index
 */
public class index {

    public static void main(String[] args) {
        Greeting obj1 = new Greeting();
        Vehicles obj2 = new Vehicles();

        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        obj2.start();
    }
}