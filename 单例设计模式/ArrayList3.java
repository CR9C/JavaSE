/**
 * 懒汉式
 * 使用同步方法
 * 使用同步方法,已经解决了懒汉式的线程安全问题,
 * 但是synchronized的作用域太大了,损耗性能------->尽量减小synchronized的作用域.
 * 解决方案:使用双重检查锁机制.
 */
public class ArrayList3 {
    private ArrayList3(){

    }

    private static ArrayList3 instance = null;

    synchronized public static ArrayList3 getInstance(){
        if (instance == null) {
            instance = new ArrayList3();
        }
        return  instance;
    }
}
