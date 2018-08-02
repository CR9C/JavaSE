package io.github.cr9c._02_file_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

//演示文件字节输出流
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//1:创建目标对象(表示把数据保存到哪一个文件)
		//会自动创建文件,不会自动创建项目
		File target = new File("file/stream.txt");
		//2:创建文件字节输出流对象(水管)
		OutputStream out = new FileOutputStream(target,true);
		//3:具体的输出操作(往外写操作)
		//void write(int b):把一个字节写出到文件中 
		//void write(byte[] b):把数组b中所有的字节都写出到文件中去
		//void write(byte[] b, int off, int len):把数组b中的off索引开始的len个字节写出到文件中去
		//out.write(65);
		//out.write("ABCDE".getBytes());
		out.write("WillLucyLily".getBytes(), 5, 4);
		
		//4:关闭资源对象
		out.close();

	}
}












































