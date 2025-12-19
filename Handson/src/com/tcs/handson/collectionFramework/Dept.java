package com.tcs.handson.collectionFramework;

public class Dept {
private int id;
private String deptname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public Dept(int id, String deptname) {
	super();
	this.id = id;
	this.deptname = deptname;
}

}
