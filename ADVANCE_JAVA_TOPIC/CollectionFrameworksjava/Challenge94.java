package CollectionFrameworksjava;

import java.util.Comparator;
import java.util.PriorityQueue;
public class Challenge94 {

    public static void main(String[]args){

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>(){
            //inside the heap there Pq object as well as variable reference which points to anonymous class object
            @Override
            public int compare(Student student1, Student student2){
                return student1.getGrade() - student2.getGrade();
            }
        });

        queue.offer(new Student("Sai", 'A'));
        queue.offer(new Student("Siya", 'B'));
        queue.offer(new Student("Soham", 'C'));

        System.out.println(queue.poll());
//        queue.offer(2);
//        queue.offer(3);
//        queue.offer(7);
//
//        System.out.println(queue);
    }

    private static class Student{

        public final String name;

        public final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString(){
            return name + ":" + grade;
        }
    }
}
