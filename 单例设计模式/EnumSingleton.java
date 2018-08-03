package io.github.cr9c;

/**
 * 如果枚举值只有 1 个的时候，其实例也就只有 1 个，就完全符合了单例模式的限定。
 * 由于 Java 的 enum 可以跟类一样任意定义方法和属性，所以就完全可以用枚举来实现单例。
 * 代码中INSTANCE本身就是一个EnumSingleton类型的引用, 与普通的饿汉式单例相似。
 * 优势：
 *	无偿提供序列化；
 *	绝对防止多次实例化；
 *	防反射，这样就没办法反射生成对象了；
 *	单元素的枚举类型本应该成为单例模式的最佳实现方式，只可惜这种方式在现实开发中很少被使用。
 */
enum EnumSingleton {
	INSTANCE;
	public void doSomeThing() {
	}
}
