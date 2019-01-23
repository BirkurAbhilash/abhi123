package com.nt.cmd;
class College 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		System.out.println(s1);
		s1.sno = Integer.parseInt(args[0]);
		s1.sname = args[1];
		s1.course = args[2];
		s1.fees = Double.parseDouble(args[3]);
		s1.email = args[4];
		s1.mobile = Long.parseLong(args[5]);
		s1.gender = args[6].charAt(0);
		s1.study = Boolean.parseBoolean(args[7]);
		System.out.println("Values are of student 1 is::::");
		System.out.println("student number::::->"+s1.sno);
		System.out.println("student name::::->"+s1.sname);
		System.out.println("student course::::->"+s1.course);
		System.out.println("student feer::::->"+s1.fees);
		System.out.println("student  email:::->"+s1.email);
		System.out.println("student mobile::::->"+s1.mobile);
		System.out.println("student gender::::->"+s1.gender);
		System.out.println("student study::::->"+s1.study);
	}
}
