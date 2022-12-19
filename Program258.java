import java.util.*;
class ArrayX
{

    public int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int [iSize];
    }
    public void Accept()
    {
        Scanner sobj =new Scanner (System.in);

        System.out.println("Please Enter "+Arr.length +"Elements");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the Element No: : "+ (iCnt +1));
            Arr[iCnt]= sobj.nextInt();
        }

    }
    public void Display()
    {
        System.out.println("Elements of Array Are ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]+"\t");

        }
        System.out.println();

    }
}

class Program258
{


    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();
        ArrayX obj = new ArrayX(5);

        obj.Accept();
        obj.Display();
    }
}