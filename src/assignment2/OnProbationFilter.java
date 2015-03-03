/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Christopher
 */
public class OnProbationFilter {
    List<Student> probationList = new ArrayList<>();
    private double probationGpa;
    Iterator probation;
    OnProbationFilter(Iterator it)
    {
        probationGpa = 2.85;
        while(it.hasNext())
        {
            Student student = (Student)it.next();
            if(student.gpa() <= probationGpa)
            {
                probationList.add(student);
            }
        }
        probation = probationList.iterator();
    }
    boolean hasNext()
    {
        return probation.hasNext();
    }
    Student next()
    {
        return (Student)probation.next();
    }
}
