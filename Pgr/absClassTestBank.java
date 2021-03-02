abstract class Bank2 {
    abstract int getIntRate();
}

class SBIB extends Bank2 {
    int getIntRate() {
        return 7;
    }
}

class ICICIB extends Bank2 {
    int getIntRate() {
        return 8;
    }
}

class AXISB extends Bank2 {
    int getIntRate() {
        return 9;
    }
}

class absClassTestBank {
    public static void main(String args[]) {
        Bank2 b2;
        b2 = new SBIB();
        System.out.println("SBIB Rate of Interest is: " + b2.getIntRate() + " %");
        b2 = new ICICIB();
        System.out.println("ICICIB Rate of Interest is: " + b2.getIntRate() + " %");
        b2 = new AXISB();
        System.out.println("AXIS5B Rate of Interest is: " + b2.getIntRate() + " %");
    }
}