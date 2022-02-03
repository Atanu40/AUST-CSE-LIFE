using System;

namespace Lab1
{
    public class OverRidingImplementation : OverRiding
    {
        public void ImplementOverRiding()
        {
            int result = Sum(30, 20);

            Console.WriteLine("After OverRiding. " + result);
            Console.ReadLine();
        }

        public override int Sum(int num1, int num2)
        {
            return num1 * num2;
        }
    }
}