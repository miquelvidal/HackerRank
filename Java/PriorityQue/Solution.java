import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.*;
 //Sembla que podrem reutilitzar el codi de l'exercici de checker
 //Reutilizo la meva propia implementacio https://github.com/miquelvidal/HackerRank/blob/master/Java/JavaComparator2/Solution.java
 //toca posar un mètode més a la classe Student el getName(), reutilitzem existen.
 class Checker implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if (s1.getCgpa()>s2.getCgpa()) return -1;
        if (s1.getCgpa()<s2.getCgpa()) return 1;
        if (s1.getFname().compareTo(s2.getFname())!=0) return s1.getFname().compareTo(s2.getFname());
        if (s1.getId()>s2.getId()) return -1;
        return 1;
    }

}
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public String getName() {
        return getFname();
    }
}
class Priorities{
    public static List<Student> getStudents(List<String> events){
        ArrayList<Student> estudiants = new ArrayList<Student>();
        for(String linia : events){
            //parser amb string tokenizer... segur que hi ha més eficients xD
            StringTokenizer parts = new StringTokenizer(linia," ");
            String comanda = parts.nextToken();
            //Si la comanda es served ordenem i treiem el primer.
            if ("SERVED".equals(comanda)) {
                Collections.sort(estudiants,new Checker());
                if (estudiants.size()>0) estudiants.remove(0);
            }
            else {
                //Si no es served, es entrada :), creem Student i cap dins la llista
                String name = parts.nextToken();
                double cgpa = new Double(parts.nextToken()).doubleValue();
                int id = new Integer(parts.nextToken()).intValue();
                estudiants.add(new Student(id,name,cgpa));
            }
        }
        //Ordenem al final
        Collections.sort(estudiants,new Checker());
        return estudiants;
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
