import java.util.Scanner;
 class myclass{
    static int total=0;
    public static void main(String[] args){
        
        for (int i = 0; i < 7; i++) {
            
            getMarks(i);
        }
        System.out.println("Your average: "+ ((total/7)));
        System.out.println("Your total marks: "+total);
        System.out.println("Your grade: "+ getGrade(total));
    }
    public static void getMarks(int counter){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your mark for Subject "+(counter+1)+": ");
        int userInput = Integer.parseInt(scan.nextLine().trim());

        total = total+userInput;

    }
    public static  String getGrade(int total){
        if(((total/7)) >= 75) {
            return "Pass with Distinction";
        }
        if(((total/7)) >= 50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
}