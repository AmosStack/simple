// Computes average marks and prints PASS or FAIL.
public class MarksPassFailChecker {
    public static void main(String[] args) {
        int mark1=40;
        int mark2=70;
        int mark3=20;
        //calculate the average and round it off 
        double average =(mark1 + mark2 + mark3) / 3.0;
        int roundedAverage=(int)Math.round(average);
        // print "PASS" or "FAIL" based on the average
        if(roundedAverage>=40) {
            System.out.println("PASS");
        } else{
                System.out.println("FAIL");
            }
        

    }
}
