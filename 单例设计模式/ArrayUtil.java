/**
 * 饿汉式
 */
public class ArrayUtil {
    private ArrayUtil(){};

    public static final ArrayUtil instance = new ArrayUtil();

    public static ArrayUtil getInstance(){
        return instance;
    }
}
