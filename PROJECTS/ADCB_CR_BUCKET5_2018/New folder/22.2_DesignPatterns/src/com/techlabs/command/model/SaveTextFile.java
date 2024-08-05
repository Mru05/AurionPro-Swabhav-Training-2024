package com.techlabs.command.model;

public class SaveTextFile implements TextFileOperation{

	 private TextFile textFile;

	    public SaveTextFile(TextFile textFile) {
	        this.textFile = textFile;
	    }

	    @Override
	    public String execute() {
	        return textFile.save();
	    }
	

}
