import java.io.DataInputStream;

class Reading {
    public static void main(String args[]) {
        DataInputStream in = new DataInputStream(System.in);
        int intNumber = 0;
        float floatNumber = 0.0f;
        String s = "";
        try {
            System.out.println("Enter an Integer Value:");
            intNumber = Integer.parseInt(in.readLine());
            System.out.println("Enter a float value:");
            floatNumber = Float.valueOf(in.readLine()).floatValue();
            System.out.println("Enter a String Value:");
            s = in.readLine();

        } catch (Exception e) {
        }
        System.out.println("intNumber:" + intNumber);
        System.out.println("intFloat:" + floatNumber);
        System.out.println("String s:" + s);
    }
}