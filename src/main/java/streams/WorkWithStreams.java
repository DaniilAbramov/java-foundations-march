package streams;

import streams.model.Faculty;
import streams.model.Student;
import streams.utils.NewApproach;
import streams.utils.OldApproach;

import java.util.List;

public class WorkWithStreams {
    public static void main(String[] args) {

        Student harryPotter = new Student("Harry Potter", 2, Faculty.GRYFFINDOR);
        Student jennyWeasley = new Student("Jenny Weasley", 1, Faculty.GRYFFINDOR);
        Student drakoMalfoy = new Student("Drako Malfoy", 2, Faculty.SLYTHERIN);
        Student cedricDigory = new Student("Cedric Diggory", 3, Faculty.HUFFLEPUFF);

//        List<Student> hogwartsStudent = OldApproach.generate(harryPotter,jennyWeasley,drakoMalfoy,cedricDigory);
        List<Student> hogwartsStudent = NewApproach.generate(harryPotter,jennyWeasley,drakoMalfoy,cedricDigory);

        System.out.println(OldApproach.getGryffindorStudents(hogwartsStudent));
        System.out.println(NewApproach.getGryffindorStudents(hogwartsStudent));

        System.out.println(NewApproach.getCoursesGryffindorStudents(hogwartsStudent));

    }
}
