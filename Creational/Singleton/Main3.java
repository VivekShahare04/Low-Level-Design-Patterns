package Creational.Singleton;
//bill Pugh Singleton Implementation
public class Main3 {
    public static void main(String[] args) {
        Main3 db1 = Main3.getInstance();

        System.out.println(db1);
    }

    private Main3(){

    }
    private static class Helper{
        private static final Main3 obj = new Main3();
    }
    public static Main3 getInstance(){
        return Helper.obj;
    }
}
