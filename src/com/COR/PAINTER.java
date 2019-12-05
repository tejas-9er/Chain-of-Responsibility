package com.COR;

public class PAINTER extends Employee{
	
	public PAINTER(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "car complete");
    }
}
