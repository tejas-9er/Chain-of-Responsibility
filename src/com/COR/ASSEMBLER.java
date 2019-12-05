package com.COR;

public class ASSEMBLER extends Employee{
	
	public ASSEMBLER(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "all parts have been put together");
    }
}
