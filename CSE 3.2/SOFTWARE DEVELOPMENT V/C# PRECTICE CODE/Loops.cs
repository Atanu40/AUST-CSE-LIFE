using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public class Loops
    {
        public void ExploreLoops()
        {
            var numbers = new int[] { 1, 2, 3, 4, 5 };

            // For Loop

            Console.WriteLine("Inside For loop");
            int sum = 0;

            for (int i = 0; i < numbers.Length; i++)
            {
                sum += numbers[i];
            }

            Console.WriteLine($"Sum is: {sum}");

            // While Loop

            Console.WriteLine("Inside While loop");

            sum = 0;
            int j = 0;

            while (j < numbers.Length)
            {
                sum += numbers[j];
                j++;
            }

            Console.WriteLine($"Sum is: {sum}");

            // Foreach Loop

            sum = 0;

            foreach (var number in numbers)
            {
                sum += number;
            }

            Console.WriteLine($"Foreach Sum is: {sum}");

            Console.ReadLine();
        }
    }
}
