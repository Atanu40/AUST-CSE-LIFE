using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

public class Generic
{
    //Generics allow us to write a class or method that can work with any data type.
    public void ExploreGeneric()
    {
        Console.WriteLine(Sum<int>(1, 2));
        Console.WriteLine(Sum<double>(2.9, 3.9));
        Console.WriteLine(Sum<string>("10", "20"));

        Console.ReadLine();
    }

    public static double Sum<T>(T num1, T num2)
    {
        double number1 = Convert.ToDouble(num1);
        double number2 = Convert.ToDouble(num2);

        return number1 + number2;
    }
}
