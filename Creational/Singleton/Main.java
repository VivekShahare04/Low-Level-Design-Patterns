package Creational.Singleton;
//Lazy Initialization
public class Main {
    public static void main(String[] args) {
        Main db1 = Main.getInstance();
        Main db2 = Main.getInstance();

        System.out.println(db1);
        System.out.println(db2);
    }

    private static Main obj;

    private Main(){

    }

    public static Main getInstance(){
        if(obj==null){
            obj = new Main();
        }
        return obj;
    }
}
