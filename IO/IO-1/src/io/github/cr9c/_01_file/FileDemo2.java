package io.github.cr9c._01_file;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		test4();
	}
	/*
	File类中方法-目录操作
	boolean isDirectory() :判断是否是目录
	boolean mkdir()  :创建当前目录
	boolean mkdirs() :创建当前目录和上级目录
	String[] list() :列出所有的文件名
	File[] listFiles() :列出所有文件对象
	static File[] listRoots() :列出系统盘符
	*/
	private static void test4() {
		File dir = new File("C:/abc/xxx");
		File f1 = new File(dir,"123.txt");
		System.out.println(dir.isDirectory());
		
		
	}
}

























































































