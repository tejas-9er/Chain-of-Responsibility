package com.COR;

public class PART_COLLECTOR extends Employee{

	public PART_COLLECTOR(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "all parts have been gathered");
    }

}
