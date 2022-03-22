public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH","0540000000");
        Teacher t2 = new Teacher("Sibel Hoca","TRKÇ","05060000000");
        Teacher t3 = new Teacher("İbrahim Hoca","MAT","05080000000");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course türkçe = new Course("Türkçe","103","TRKÇ");
        türkçe.addTeacher(t2);

        Course matematik = new Course("Matematik","102","MAT");
        matematik.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","023","4",tarih,türkçe,matematik);
        s1.addVerbalGrade(55,67,45);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi","024","4",tarih,türkçe,matematik);
        s2.addVerbalGrade(30,35,20);
        s2.addBulkExamNote(45,78,50);
        s2.isPass();

    }
}
