//Accept numbers and display Multiplication of  factors

import java.util.*;

class Numbers
{

    public int MultFactorDisplay(int iValue)
    {

        int iCnt = 0;
        int iMult = 1;

        for(iCnt = 1; iCnt <= iValue/2; iCnt ++)//iCnt +2;
        {
            if(iValue%iCnt == 0 ) 
            {

                
                

                    System.out.println(+iCnt);
                    iMult = iMult*iCnt;
                

            }

        }
        return iMult;
        


    }


}


class Program255
{
    public static void main(String  Arg[])
    {
        Scanner sobj = new Scanner (System.in);

        int iNo=0;
        System.out.println("Please enter the number:");

        iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.MultFactorDisplay(iNo);
        System.out.println("Multiplication is :"+iRet);




    }


}
