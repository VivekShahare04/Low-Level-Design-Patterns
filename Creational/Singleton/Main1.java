package Creational.Singleton;
//Double Checked Locking
public class Main1 {
    public static void main(String[] args) {
        Main1 db1 = Main1.getInstance();
        Main1 db2 = Main1.getInstance();

        System.out.println(db1);
        System.out.println(db2);
    }

    private static Main1 obj;
    private Main1(){

    }
    public static Main1 getInstance(){
        if(obj==null){
            synchronized(Main1.class){
                if(obj==null){
                    obj = new Main1();
                }
            }
        }
        return obj;
    }
}
