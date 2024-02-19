package N8_Ansvar_Afhaengighed_GRASP_15_02_2024;

public class StudentFind {
    private String[] students = new String[40];
    public StudentFind(String[] newStudent) {
        if(newStudent.length <= 40) {
            students = newStudent;
        } else {
            System.out.println("Der er for mange elever!");
        }
    }


    public void findStudent(String name) {
        String message = "findes ikke i klassen!";
        for(String indexName : students) {
            if(indexName.equalsIgnoreCase(name)) {
                message = "findes i klassen!";
                break;
            }
        }
        System.out.println(name + " " + message);
    }


}
