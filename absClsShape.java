abstract class Shape1 {
    abstract void draw();
}

class Rectangle extends Shape1 {
    void draw() {
        System.out.println("drawing Rectangle");
    }
}

class Circle extends Shape1 {
    void draw() {
        System.out.println("drawing Circle");
    }
}

class absClsShape {
    public static void main(String args[]) {
        Shape1 s1 = new Circle();
        s1.draw();
    }
}