package hackerrank.introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Comparator {
    class Student implements Comparable<Student>{
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

        @Override
        public int compareTo(Student o){
            double epsilon = 0.001; // since we shouldn't use "==" with doubles

            if (Math.abs(this.getCgpa() - o.getCgpa()) > epsilon) {
                return this.getCgpa() < o.getCgpa() ? 1 : -1; // descending order
            } else if (!this.getFname().equals(o.getFname())) {
                return this.getFname().compareTo(o.getFname());
            } else {
                return this.getId() - o.getId();
            }
        }
    }


        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
                int id = in.nextInt();
                String fname = in.next();
                double cgpa = in.nextDouble();

//                Student st = new Student(id, fname, cgpa);
//                studentList.add(st);
//
//                testCases--;
//            }
//            Collections.sort(studentList);
//            for(Student st: studentList){
//                System.out.println(st.getFname());
            }
        }
    }
