public class Student {
    Course tarih;
    Course turkce;
    Course matematik;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass; //Sınıfı geçti mi geçmedi mi
    double verbalnote = 0.2;
    double examnote = 0.8;

    Student(String name, String stuNo, String classes, Course tarih, Course turkce, Course matematik){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.tarih = tarih;
        this.turkce = turkce;
        this.matematik = matematik;
        this.avarage = 0.0; //default tanımlama
        this.isPass = false;
    }

    void addVerbalGrade(double verbalNote1, double verbalNote2, double verbalNote3){
        if(verbalNote1 >= 0 && verbalNote1 <= 100 ){
            this.tarih.verbal_grade = verbalNote1;
        }
        if(verbalNote2 >= 0 && verbalNote2 <= 100){
            this.turkce.verbal_grade = verbalNote2;
        }
        if(verbalNote3 >= 0 && verbalNote3 <= 100){
            this.matematik.verbal_grade = verbalNote3;
        }
    }

    void addBulkExamNote(double note1, double note2, double note3){
        if(note1 >= 0 && note1 <= 100 ){
            this.tarih.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.turkce.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.matematik.note = note3;
        }
    }

    void isPass(){
        System.out.println("===========================");
        this.avarage = ((this.tarih.verbal_grade * verbalnote + this.tarih.note * examnote) + (this.turkce.verbal_grade * verbalnote + this.turkce.note * examnote)
                + (this.matematik.verbal_grade * verbalnote + this.matematik.note * examnote)) / 3.0;
        if (this.avarage > 55){
            System.out.println(this.name + " Tebrikler! Sınıfı başarılı şekilde geçtiniz. ");
            this.isPass = true;
        } else {
            System.out.println(this.name + " Üzgünüm! Sınıfı geçemediniz.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.tarih.name + " Sınav Notu\t:" + this.tarih.note);
        System.out.println(this.tarih.name + " Sözlü Notu\t:" + this.tarih.verbal_grade);
        System.out.println(this.turkce.name + " Sınav Notu\t:" + this.turkce.note);
        System.out.println(this.turkce.name + " Sözlü Notu\t:" + this.turkce.verbal_grade);
        System.out.println(this.matematik.name + " Sınav Notu\t:" + this.matematik.note);
        System.out.println(this.matematik.name + " Sözlü Notu\t:" + this.matematik.verbal_grade);
        System.out.println("Ortalamanız\t:" + this.avarage);
    }


}
