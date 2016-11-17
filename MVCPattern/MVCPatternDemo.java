package MVCPattern;

/**
 * Created by xhon on 16-11-17.
 */
public class MVCPatternDemo {
    public static void main(String[] args) {

        Student model  = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Xhon");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Vladimir");
        student.setRollNo("10");
        return student;
    }
}
