using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public class Print
    {
        public void DoPrint()
        {
            string department = "CSE";

            Console.WriteLine("Hello " + department);

            // Composite Format String

            Console.WriteLine("Hello {0}", department);

        // String Interpolation
        //https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/tokens/interpolated

            Console.WriteLine($"hello{department}");

            // Verbatim Identifier
            // By using @ in the given string  
            // it runs smoothly because 
            // @ symbol tells the compiler to 
            // ignore all escape sequences 

            string filename1 = @"c:\documents\files\u0066.txt";
            string filename2 = "c:\\documents\\files\\u0066.txt";
            //string quote = @"He said, ""this is the last chance""";

            Console.WriteLine(filename1);
            Console.WriteLine(filename2);
            //Console.WriteLine(quote);

            Console.ReadLine();
        }
    }
}
