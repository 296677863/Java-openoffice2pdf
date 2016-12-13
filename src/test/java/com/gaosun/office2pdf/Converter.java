package com.gaosun.office2pdf;

import java.util.ArrayList;
import java.util.List;

public class Converter {

	public static void main(String args[]) {

		List<String> inputFilePathList = new ArrayList<String>();
		inputFilePathList.add("e://888.doc");
		inputFilePathList.add("e://FastDFS.docx");
		inputFilePathList.add("e://关联包技术交流讲解PPT.pptx");
		inputFilePathList.add("e://14包软件V1.0验证过程问题报告 -0811.xls");

		OpenOffice2PDF oop = OpenOffice2PDF.getInstance();
		for (String inputFilePath : inputFilePathList) {
			oop.add(inputFilePath);
		}
		oop.start();

		oop.add("e://5月8号-14包需求调研启动会.pptx");

	}

}
