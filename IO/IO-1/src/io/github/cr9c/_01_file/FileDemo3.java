package io.github.cr9c._01_file;

import java.io.File;

//需求:列出指定目录中所有的文件,包括子文件夹中的所有文件(使用递归算法(recursion)).
public class FileDemo3 {
	public static void main(String[] args) {
		File dir = new File("G:/u/Study Notes/Five");
		listAllFile(dir);
	}

	//列出所有的文件
	private static void listAllFile(File f) {
		//第一级子文件
		File[] fs = f.listFiles();
		for (File file : fs) {
			//目录和文件
			System.out.println(file);
			if(file.isDirectory()) {
				//如果子文件是目录,则继续递归
				listAllFile(file);
			}
		}
		
	}
}
