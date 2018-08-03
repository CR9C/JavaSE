package io.github.cr9c;

/**
 * 懒汉式
 * 使用双重检查锁机制.
 * 双层校验, 第一次校验不是线程安全的，
 * 也就是说可能有多个线程同时得到singleton为null的结果，
 * 接下来的同步代码块保证了同一时间只有一个线程进入，
 * 而第一个进入的线程会创建对象，等其他线程再进入时对象已创建就不会继续创建。
 * 这是一个很巧妙的方式，
 * 如果对整个方法同步，所有获取单例的线程都要排队，
 * 但实际上只需要对创建过程同步来保证"单例"，
 * 多个线程不管是否已经有单例可以同时去请求。
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
