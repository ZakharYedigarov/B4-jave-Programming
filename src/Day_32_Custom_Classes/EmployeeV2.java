package Day_32_Custom_Classes;

public class EmployeeV2 {
    // name, id, job title, salary
    // Instance variable - does not have "static" keyword
    String name;
    int id;
    String jobTitle;
    double salary;


    // Constructor - name and jobTitle
    public EmployeeV2 (String jobTitle, String name) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    // Constructor - name, id, job title, and salary
    public EmployeeV2 (String name, int id, String jobTitle, double salary) {
        this(name,jobTitle);
        this.id = id;
        this.salary = salary;
    }

    // Instance Method - does not have "static" keyword
    public void goToMeeting () {
        //  $name is going to a meeting
        System.out.println(name + " is going to a meeting");
    }


    // Instance Method - does not have "static" keyword
    public String toString() {
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }
}