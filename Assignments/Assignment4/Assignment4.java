package Assignments.Assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int testCase = keyboard.nextInt();
        String signUpDate, currentDate;

        while(testCase > 0)
        {
            signUpDate = keyboard.next();
            currentDate = keyboard.next();
            KYC_dates obj =  new KYC_dates();

            obj.getRanges(signUpDate,currentDate);

            testCase--;


        }
    }
}
class KYC_dates
{
    Date signUpDate, currentDate;

    public void getRanges(String inputSignUpDate , String inputCurrentDate)
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            signUpDate = dateFormatter.parse(inputSignUpDate);

            currentDate = dateFormatter.parse(inputCurrentDate);

            if(signUpDate.after(currentDate))
            {
                System.out.print("No range");
            }
            else
            {
                extracted(dateFormatter);
            }

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private void extracted(SimpleDateFormat dateFormatter) {
        Date startDate, endDate;
        startDate = signUpDate;

        startDate.setYear(currentDate.getYear());

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(startDate);

        calendar.add(Calendar.DATE, -30);
        startDate=calendar.getTime();

        calendar.add(Calendar.DATE, 60);
        endDate=calendar.getTime();

        if(endDate.after(currentDate)) {
            endDate=currentDate;
        }
        System.out.print(  dateFormatter.format(startDate) + " " + dateFormatter.format(endDate));
    }
}
