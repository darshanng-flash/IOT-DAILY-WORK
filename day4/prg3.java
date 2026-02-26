package day4;

class Student1 {
    String name;

    Student1(String name) {
        this.name = name;
    }
}

class Department1 {
    String deptName;
    Student1 student;

    Department1(String deptName, Student1 student) {
        this.deptName = deptName;
        this.student = student;
    }

    void show() {
        System.out.println(student.name + " belongs to " + deptName);
    }
}

class prg3 {
    public static void main(String[] args) {
        Student1 s = new Student1("Unni");
        Department1 d = new Department1("ISE", s);
        d.show();
    }
}