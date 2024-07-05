package Prototype;

public class IntelligentStudent extends Student{
    int iq;
    double intelligenceScore;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent student){
        // initialize the parent attributes
        super(student);
        this.iq = student.iq;
        this.intelligenceScore = student.intelligenceScore;
    }

    @Override
    public IntelligentStudent clone() {
//        IntelligentStudent st = new IntelligentStudent();
//        /*
//        copy all attributes of parent and then child
//         */
//
//
//        st.iq = this.iq;
//        st.intelligenceScore = this.intelligenceScore;

        return new IntelligentStudent(this);
    }
}
