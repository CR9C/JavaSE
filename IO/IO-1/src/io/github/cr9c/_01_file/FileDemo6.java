package io.github.cr9c._01_file;

import java.io.File;
import java.io.FilenameFilter;

//文件过滤器(FilenameFilter)
public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("G:/a 学习/视频");
		File[] fs = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return new File(dir,name).isFile() && name.endsWith(".avi");
			}
		});
		for (File file : fs) {
			System.out.println(file);
		}
	}
}