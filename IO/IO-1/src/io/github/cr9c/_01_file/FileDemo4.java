package io.github.cr9c._01_file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//File类案列-列出文件的分层结构
public class FileDemo4 {
	public static void main(String[] args) {
		String file = "G:/u/Study Notes/Five/day07";
		File f = new File(file);
		List<String> parentNames = new ArrayList<>();
		listAllParent(parentNames, f);
		System.out.println(parentNames);
		Collections.reverse(parentNames);//颠倒List元素顺序
		StringBuilder sb = new StringBuilder(40);
		for (String name : parentNames) {
			sb.append(name).append(">");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}

	private static void listAllParent(List<String> parentNames,File f) {
		if (!"".equals(f.getParentFile().getName())) {
			parentNames.add(f.getParentFile().getName());
		}
		if (f.getParentFile().getParentFile()!=null) {
			listAllParent(parentNames, f.getParentFile());
		}
	}
}