package com.jxd.emp.model;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author tanliang
 * @Date 2020/10/23
 * @Version 1.0
 */
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private double sal;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
