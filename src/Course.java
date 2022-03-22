public class Course {
    Teacher teacher; //teacher adında Teacher sınıfından nitelik oluşurma
    String name;
    String code;
    String prefix; // Teacher sınıfındaki branch ile aynı
    double note;
    double verbal_grade;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbal_grade = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }

}
