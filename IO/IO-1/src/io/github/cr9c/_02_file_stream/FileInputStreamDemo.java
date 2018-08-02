package io.github.cr9c._02_file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

//演示文件字节输入流
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1:创建源(挖井)
		File f = new File("file/stream.txt");
		//2:创建文件字节输入流对象,并接在源上
		InputStream in = new FileInputStream(f);
		//3:具体的读取操作
		//注意:如果读取到最后没有数据的时候,返回-1
		//int read():读取一个字节,返回读取的字节
		//int read(byte[] b):读取多个字节,并存储到数组b中,从数组b的索引为0的位置开始存,返回读取了几个字节
		//int read(byte[] b, int off, int len):读取多个字节,并存储到数组b中,从数组的off索引位置开始存储
		//int data = in.read();//获取stream.txt文件中的第一个字节A->65
		byte[] buffer = new byte[5];//此时buffer只能最多存储5个字节
//		//int read(byte[] b):返回读取了几个字节
//		int ret = in.read(buffer);//读取一次光标就移一次,下次接着上次的地方继续读
//		ret = in.read(buffer);
//		System.out.println(ret);//2
//		System.out.println(Arrays.toString(buffer));//[70, 71, 67, 68, 69]
//		//把byte[]转换为字符串
//		String str = new String(buffer,0,7);
//		System.out.println(str);//ABCDEFG
		//int ret = in.read(buffer, 2, 6);
		//System.out.println(Arrays.toString(buffer));
		//把文件中所有的数据都读取到程序中
		int len = -1;//表示当前读取的字节总数,如果为-1,表示读取到末尾了
		while ((len = in.read(buffer))!= -1) {
			//把数组转换成String
			String str = new String(buffer,0,len);
			System.out.println(str);
		}
		//4:关闭资源
		in.close();
	}
}
















