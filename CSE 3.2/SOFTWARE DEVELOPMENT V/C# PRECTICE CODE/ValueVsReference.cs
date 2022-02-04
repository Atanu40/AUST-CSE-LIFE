using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public class ValueVsReference
    {
        public void ExploreValueVsReferenceType()
        {
            int num = 100;
            var numbers = new int[] { 1, 2, 3, 4 };

            ValueType(num);
            ReferenceType(numbers);
            //A value type derives from System.ValueType and contains the data inside its own memory allocation. 
            //In other words, variables or objects or value types have their own copy of the data.
            //A reference type, meanwhile, extends System.Object and points to a location in the memory that contains the actual data.

            Console.WriteLine("In the main loop. Num: " + num);
            Console.WriteLine("In the main loop. Numbers: ");

            foreach (var number in numbers)
            {
                Console.Write(number + " ");
            }



            Console.ReadLine();
        }

        public void ValueType(int num)
        {
            num++;
            Console.WriteLine("Inside Value Type. Number: " + num);
        }

        public void ReferenceType(int[] numbers)
        {
            for (int i = 0; i < numbers.Length; i++)
            {
                numbers[i]++;
            }

            Console.WriteLine("Inside Reference Type. Numbers: ");

            foreach (var number in numbers)
            {
                Console.Write(number + " ");
            }

            Console.WriteLine();
        }
    }
}
