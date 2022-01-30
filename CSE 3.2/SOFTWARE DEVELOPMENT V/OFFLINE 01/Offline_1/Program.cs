using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Offline_1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("IF YOU WANT TO SEE 1ST PROBLEM SOLVE PLEASE PRESS 1 OR IF YOU WANT TO SEE 2ND PROBLEM SOLVE PLEASE PRESS 2\n");
             int x = Convert.ToInt32(Console.ReadLine());
            if(x==1)
            {
                 Matrixtrace m = new Matrixtrace();
                 m.output();
            }
            else if(x==2)
            {
                Problem2 p = new Problem2();
                p.listoutput();
            }


           




        }
    }
}
