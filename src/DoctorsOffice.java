import java.util.Scanner;

public class DoctorsOffice {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String patientName=input.nextLine();
        System.out.print("Do you have insurance? ");
        Boolean hasInsurance=input.nextBoolean();
        System.out.print("Enter your body temperature: ");
        float temp=input.nextFloat();
        System.out.print("Enter number of visits: ");
        short numVisits=input.nextShort();
        System.out.println("Patient Details:"+"\n"+
                "Name: "+patientName+"\n"+
                "Patient has insurance: "+hasInsurance+"\n"+
                "Body temperature: "+temp+"\n" +
                "Number of visits "+numVisits);
    }
}
