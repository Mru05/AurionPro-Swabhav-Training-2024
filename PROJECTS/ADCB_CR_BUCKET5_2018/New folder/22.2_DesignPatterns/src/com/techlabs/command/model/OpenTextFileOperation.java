package com.techlabs.command.model;

public class OpenTextFileOperation implements TextFileOperation {
	 private TextFile textFile;

	    public OpenTextFileOperation(TextFile textFile) {
	        this.textFile = textFile;
	    }

	    @Override
	    public String execute() {
	        return textFile.open();
	    }

}
