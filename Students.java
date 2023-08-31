import java.util.Scanner;
class Students
{
    public static void main(String args[])
    {
        //F1: user input assignment name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        //F2 : input students marks for assignment 
        int[] marksList = new int[30];
        for (int i=0; i<30; i++)
        { 
            System.out.println("Enter mark for student " + (i + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark >=0 && mark <=30)
                {
                    marksList[i] = mark;       
                }
            }
    }
}
