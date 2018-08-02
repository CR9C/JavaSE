package io.github.cr9c._01_file;

import java.io.File;

//批量修改文件名称案列:
public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("C:/123");
		// 获取当前目录下所有的文件
		File[] fs = dir.listFiles();
		//需要被替换/删除的文字
		String deleteText = "陈陈陈-Java-最好,最帅-";
		for (File file : fs) {
			if (file.getName().contains(deleteText)) {
				String newFileName = file.getName().replace(deleteText, "");
				file.renameTo(new File(dir,newFileName));
			}
		}
	}
}
