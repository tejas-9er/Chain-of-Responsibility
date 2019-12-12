package com.COR;

public class Driver {

	private static Employee work() {
        Employee part_collector = new PART_COLLECTOR(Employee.PART_COLLECTOR);
        Employee assembler = new ASSEMBLER(Employee.ASSEMBLER);
        Employee welder = new WELDER(Employee.WELDER);
        Employee painter = new PAINTER(Employee.PAINTER);
        
        painter.setNextEmployee(welder);
        welder.setNextEmployee(assembler);
        assembler.setNextEmployee(part_collector);

        return painter;
    }

    public static void main(String[] args) {
        Employee work = work();
        
        work.doWork(Employee.PAINTER, "Painter bro! ");
        work.doWork(Employee.WELDER, "Welder bro! ");
        work.doWork(Employee.ASSEMBLER, "Assembler bro! ");
        work.doWork(Employee.PART_COLLECTOR, "Part Collector bro! ");
    }

}
