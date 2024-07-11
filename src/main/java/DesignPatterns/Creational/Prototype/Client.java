package DesignPatterns.Creational.Prototype;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry){
        Student june23BeginnerBatch = new Student();
        june23BeginnerBatch.setBatch("June23 Beginner");
        june23BeginnerBatch.setInsName("Umang");
        june23BeginnerBatch.setAvgBatchPsp(50);
        june23BeginnerBatch.moduleName = "LLD 2";
        studentRegistry.register("june23BeginnerBatch",june23BeginnerBatch);

        IntelligentStudent june23IntelligentStudents = new IntelligentStudent();
        june23IntelligentStudents.insName = "Umang Agarwal";
        june23IntelligentStudents.iq = 160;
        june23IntelligentStudents.intelligenceScore = 100;
        june23IntelligentStudents.setBatch("Beginner");
        studentRegistry.register("june23IntelligentStudents",june23IntelligentStudents);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student jagan = studentRegistry.get("june23BeginnerBatch").clone();
        jagan.setName("Jagan");
        jagan.setAge(28);
        jagan.setPsp(90.0);

        Student baskar = studentRegistry.get("june23BeginnerBatch").clone();
        baskar.setName("Baskar");
        baskar.setAge(55);
        baskar.setPsp(99);

        Student jack = studentRegistry.get("june23IntelligentStudents").clone();
        jack.setName("Jack");
        jack.setAge(60);
        jack.setPsp(80);

        System.out.println("Debug");

    }
}
