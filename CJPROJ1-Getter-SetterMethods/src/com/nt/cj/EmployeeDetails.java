package com.nt.cj;

class EmployeeDetails 
{
 
	private int eid;
    private String name;
	private String desg;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [eid=" + eid + ", name=" + name + ", desg=" + desg + "]";
	}
}
