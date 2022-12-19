//Accept numbers and display even factors

import java.util.*;

class Numbers
{

    public void EvenFactorDisplay(int iValue)
    {

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iValue/2; iCnt ++)
        {
            if(iValue%iCnt == 0  && iCnt%2==0) 
            {

                
                

                    System.out.println("Even Factors is "+iCnt);
                

            }

        }


    }


}


class Program251
{
    public static void main(String  Arg[])
    {
        Scanner sobj = new Scanner (System.in);

        int iNo=0;
        System.out.println("Please enter the number:");

        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorDisplay(iNo);


    }


}
