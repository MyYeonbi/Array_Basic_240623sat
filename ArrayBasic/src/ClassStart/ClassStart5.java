package ClassStart;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "김연지";
        student1.age = 23;
        student1.grade = 3;

                Student student2 = new Student();
        student2.name ="김똥꼬";
        student2.age = 8;
        student2.grade = 1;

        Student[] students = new Student[]{student1, student2};

        for (int i = 0; i < students.length; i++){
            System.out.println("이름 : " + students[i].name + "  나이 :" + students[i].age + "  성적 : "+ students[i].grade);
        }
    }
}
