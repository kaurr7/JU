import java.util.Scanner;
class Students
{
    public static void main(String args[])
    {
        //F1: user input assignment name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        //F2 : input students' marks for assignment 
        int[] marksList = new int[30];
        for (int i=0; i<30;)
        { 
            System.out.println("Enter mark for student " + (i + 1) + ": ");
            //use try catch to ensure only correct type of data is accepted as input 
            try
            {
                int mark = scanner.nextInt();
                if (mark >=0 && mark <=30)
                {
                    marksList[i] = mark; 
                    i++;// increment i only if input is valid
                }
         //F3 : shows error message for invalid input
                else
                {
                    System.out.println("Invalid input. Mark must be between 0 and 30.");   
                }
            }
            catch(Exception e)
            {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.nextLine(); // To clear the invalid input from the buffer

            }
        }
        
        //F4 : assignment name followed by the marks of the students
        System.out.println("Assignment Name: " + assignmentName);
        System.out.println("The students' marks are as follows:");
        
        for (int i = 0; i < 30; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + marksList[i]);
        }
        
        //F5 : Print the highest and lowest marks
        int highestMark = marksList[0];
        int lowestMark = marksList[0];
        for (int i = 1; i < 30; i++) 
        {
            if (marksList[i] > highestMark)//check if current mark is greater than previously recorded highest mark
            {
                highestMark = marksList[i];
            }
            if (marksList[i] < lowestMark)//check if current mark is lower than previously recorded highest mark
            {
                lowestMark = marksList[i];
            }
        }
        System.out.println("Highest mark : " + highestMark);
        System.out.println("Lowest mark: " + lowestMark);
        
        //F6 : calculate the mean and standard deviation of the marks
        double sum = 0;
        for (int mark : marksList) {
            sum += mark;
        }
        double mean = sum / 30;
        double varianceSum = 0;
        for (int mark : marksList) {
            varianceSum += Math.pow(mark - mean, 2);
        }
        double variance = varianceSum / 30;
        double standardDeviation = Math.sqrt(variance);
        
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
        
        
        scanner.close();//to close scanner instance
    }
}
