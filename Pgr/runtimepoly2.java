class Bank{
        float getRateofInterest(){return 0;}
}
class sbi extends Bank{
        float getRateofInterest(){return 8.4f;}
}
class icici extends Bank{
        float getRateofInterest(){return 7.3f;}
}
class axis extends Bank{
        float getRateofInterest(){return 9.7f;}
}
class runtimepoly2{
    public static void main(String args[]){
        Bank b;
        b = new sbi();
        System.out.println("SBI rate of Int:"+b.getRateofInterest());
        b = new icici();
        System.out.println("ICICI rate of interest:"+b.getRateofInterest());
        b = new axis();
        System.out.println("Axis rate of interest:"+b.getRateofInterest());
    }
}