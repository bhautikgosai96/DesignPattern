package AbstractClass;

public class AbstractMain {

    public static void main(String[] args){
        Calculation cal1 = new Sum();
        Calculation cal2 = new Devide();
        cal1.print();
        cal2.print();
    }
}
