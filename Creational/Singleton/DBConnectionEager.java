package Creational.Singleton;

public class DBConnectionEager {

    static DBConnectionEager obj = new DBConnectionEager(); //static belong to class not an object 

    private DBConnectionEager() { //it helps to restrict the creation of object from outside the class

    }

    public static DBConnectionEager getInstance() { //used to call the object by outside world / class
        return obj;
    }

    public static void main(String[] args) {
        DBConnectionEager db1 = DBConnectionEager.getInstance();
        DBConnectionEager db2 = DBConnectionEager.getInstance();

        System.out.println(db1);
        System.out.println(db2);
    }

}
