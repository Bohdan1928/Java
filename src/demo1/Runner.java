package demo1;

public interface Runner extends Singer {

    void run();

    default void test(){
        System.out.println("test1");
    }

    static void test2(){
        System.out.println("test2");
    }
}
