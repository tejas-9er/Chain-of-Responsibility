package com.COR;

public class Driver {

	private static Employee work() {
        Employee part_collector = new PART_COLLECTOR(Employee.PART_COLLECTOR);
        Employee assembler = new ASSEMBLER(Employee.ASSEMBLER);
        Employee welder = new WELDER(Employee.WELDER);
        Employee painter = new PAINTER(Employee.PAINTER);
        
        part_collector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);

        return part_collector;
    }

    public static void main(String[] args) {
        Employee work = work();
        
        work.doWork(Employee.PART_COLLECTOR, "What up bro! ");
    }

}
