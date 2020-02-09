abstract class Bike1{
    void run(){}
}
class Honda extends Bike1{
    void run(){
        System.out.println("Running Safely");
    }

    public static void main(String args[]) {
        Bike1 obj= new Honda();
        obj.run();
    }
}