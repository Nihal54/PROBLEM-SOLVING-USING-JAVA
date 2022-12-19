//Accept numbers and display even factors

import java.util.*;

class Numbers
{

    public void CommonFactorDisplay(int iValue1,int iValue2)
    {

        int iCnt = 0;
        System.out.println("Common Factors Are:");

       for(iCnt = 1; (iCnt <= iValue1/2 )&& (iCnt<=iValue2/2); iCnt++)
       {
            if((iValue1%iCnt==0)&&(iValue2 % iCnt == 0))
            {

                System.out.println(iCnt);
            }

       }


    }


}


class Program254
{
    public static void main(String  Arg[])
    {
        Scanner sobj = new Scanner (System.in);

        int iNo1=0, iNo2=0;
        System.out.println("Please enter the first number:");

        iNo1= sobj.nextInt();
        System.out.println("Please enter the second number:");

        iNo2= sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.CommonFactorDisplay(iNo1,iNo2);


    }


}
