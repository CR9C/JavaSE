/**
 * 懒汉式:存在线程不安全问题
 */
public class ArrayUtil2 {
    private ArrayUtil2(){
    }

    private static ArrayUtil2 instance = null;

    public static ArrayUtil2 getInstance(){
        if (instance == null){
            instance = new ArrayUtil2();
        }
        return instance;
    }

}
