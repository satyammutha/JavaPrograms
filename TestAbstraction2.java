abstract class bike3 {
    bike3() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void gearChanges() {
        System.out.println("Gear Changed");
    }
}

class honda3 extends bike3 {
    void run() {
        System.out.println("Running Safely");
    }
}

class TestAbstraction2 {
    public static void main(String args[]) {
        bike3 obj = new honda3();
        obj.run();
        obj.gearChanges();
    }
}
