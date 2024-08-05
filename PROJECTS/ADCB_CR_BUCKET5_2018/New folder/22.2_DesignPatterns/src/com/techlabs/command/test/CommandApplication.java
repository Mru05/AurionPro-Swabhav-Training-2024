package com.techlabs.command.test;

import com.techlabs.command.model.OpenTextFileOperation;
import com.techlabs.command.model.SaveTextFile;
import com.techlabs.command.model.TextFile;
import com.techlabs.command.model.TextFileOperationExecutor;

public class CommandApplication {
	public static void main(String[] args) {
		TextFileOperationExecutor textFileOperationExecutor
				= new TextFileOperationExecutor();
//		textFileOperationExecutor.executeOperation(
//				new OpenTextFileOperation(new TextFile("file1.txt")));
		textFileOperationExecutor.executeOperation(
				new SaveTextFile(new TextFile("file2.txt")));
	}

}
