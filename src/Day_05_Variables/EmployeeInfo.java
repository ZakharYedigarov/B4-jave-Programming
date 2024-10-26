package Day_05_Variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle;
        int age, numOfPTO;
        char gender, suite;
        boolean isFullTime, isMarried;
        double salary;

        firstName = "Zack";
        lastName = "Yedigarov";
        companyName = "LoopCamp";
        jobTitle = "SDET";
        age = 37;
        numOfPTO = 21;
        salary = 120_000;
        isMarried = false;
        isFullTime = true;
        gender = 'M';
        suite = 'A';

        String fullReport = "Full Report: \n\tFirst Name:\t\t" + firstName + "\n\tLast Name:\t\t" + lastName + "\n\tCompany Name:\t" + companyName + "\n\tJob Title:\t\t" + jobTitle + "\n\tAge:\t\t\t" + age + "\n\tPTO Amount:\t\t" + numOfPTO + "\n\tSalary: \t\t$" + salary + "\n\tIs Full Time?\t" + isFullTime + "\n\tIs Married?\t\t"  + isMarried + "\n\tGender:\t\t\t" + gender + "\n\tSuite:\t\t\t" + suite;

        System.out.println(fullReport);
    }
}


        