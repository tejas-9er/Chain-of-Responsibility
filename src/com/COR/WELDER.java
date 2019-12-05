package com.COR;

public class WELDER extends Employee{
	
	public WELDER(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "all parts have been welded together");
    }
}
