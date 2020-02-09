class shape{
    void draw(){
        System.out.println("In shape class");
    }
}
class rectangle extends shape{
        void draw()
        {
            System.out.println("Rectangle drawing..");
        }
}
class circle extends shape{
        void draw(){
            System.out.println("Circle drawing..");
        }
}
class triangle extends shape{
    void draw(){
    System.out.println("Triangle drawing..");}
}
class runtimepoly3 extends shape{
    public static void main(String args[])
    {
        shape s;
        s = new rectangle();
        s.draw();
        s = new circle();
        s.draw();
        s = new triangle();
        s.draw();
    }
}