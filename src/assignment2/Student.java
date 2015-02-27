/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Christopher
 */

public class Student implements Comparable{
    private String name;
    private String redId;
    private double gpa;
    
    public Student()
    {
        name = "";
        redId = "";
        gpa = 0.0;
    }
    
    @Override
    public int compareTo(Object t) {
        Student anotherStudent = (Student)t;
        return this.name().compareTo(anotherStudent.name());
    }
    
    public double gpa()
    {
        return this.gpa;
    }
    public void gpa(double value)
    {
        this.gpa = value;
    }
    
    public String name()
    {
        return this.name;
    }
    public void name(String value)
    {
        this.name = value;
    }
    
    public String redId()
    {
        return this.redId;
    }
    public void redId(String value)
    {
        this.redId = value;
    }
    
    @Override
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append(name);
        s.append('|');
        s.append(redId);
        s.append('|');
        s.append(gpa);
        return s.toString();
    }
}
