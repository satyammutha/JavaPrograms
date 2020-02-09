class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("eating Bread...");
    }
}
class cat extends Animal{
    void eat(){
        System.out.println("eating Rat...");
    }
}
class lion extends Animal{
    void eat(){
        System.out.println("eating vegetables...");
    }
}
class runtimepoly4{
    public static void main(String args[])
    {
        Animal a;
        a = new dog();
        a.eat();
        a=new cat();
        a.eat();
        a=new lion();
        a.eat();
    }
}