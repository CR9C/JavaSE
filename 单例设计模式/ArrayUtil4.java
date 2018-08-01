/**
 * 懒汉式
 * 使用双重检查锁机制.
 */
public class ArrayUtil4 {
    private ArrayUtil4(){}

    private static volatile ArrayUtil4 instance = null;

    //同步方法:此时的同步箭头对象是(ArrayUtil4.class)
    public static ArrayUtil4 getInstance() {
        if (instance == null) {
            synchronized (ArrayUtil4.class) {
                if (instance == null){
                    instance = new ArrayUtil4();
                }
            }
        }
        return instance;
    }
}
