package Builder;

public class Client {
    public static void main(String[] args) {

//        Builder builder = Student.getBuilder();
//        builder.setName("Jagan");
//        builder.setAge(28);
//        builder.setBatch("Academy june");
//        builder.setPsp(89.0);
//        builder.setGradYear(2022);
//
//        Student st = builder.build();

        Student st = Student.getBuilder()
                            .setName("Jagan")
                            .setAge(28)
                            .setGradYear(2024)
                            .setPsp(90.0)
                            .setUniversityName("Academy june")
                            .build();

        System.out.println("DEBUG");
    }
}
