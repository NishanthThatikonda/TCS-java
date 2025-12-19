package com.tcs.java8features.streamA;

import java.util.Optional;

public class OptionalExample {
public static void main(String[] args) {
	Optional<String> ops=Optional.empty();
if(ops.isPresent()) {
	System.out.println("oblect is present");
}else {
	System.out.println("objrct is not present");
}
Employee emp= new Employee(123,"ravi",50000,"ece");
Optional<Employee>ope= Optional.of(emp);
if(ope.isPresent()) {
	System.out.println("emp is there");
}else {
	System.out.println("emp is not there");
}
//second way
ope.ifPresentOrElse(x->System.out.println("emp is there"),()->System.out.println("emp is not present"));


ope.ifPresentOrElse(x->System.out.println(x.getEmpno()+" "+ x.getEname()),()->System.out.println("emp is not present"));

Employee emp2= null;
Optional<Employee> op2= Optional.ofNullable(emp2);
if(op2.isPresent()) {
	System.out.println("emp is present");
}else {
	System.out.println("emp is not present");
}
	
	
	
	

}
}
