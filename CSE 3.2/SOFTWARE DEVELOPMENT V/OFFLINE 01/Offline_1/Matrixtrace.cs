using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Offline_1
{
    class Matrixtrace
    {
        public void output()
        {
          int i, j, k, l, m=0;
          
            int[,] array = new int[20, 20];
            Console.WriteLine("PLEASE ENTER MATRIX ORDER \n");
            k = Convert.ToInt32(Console.ReadLine());
            l = Convert.ToInt32(Console.ReadLine()); 

            if(k != l)
            {
                Console.WriteLine("PLEASE ENTER THE MATRIX VALUE");
                for (i = 0; i < k; i++)
                {
                    for (j = 0; j < l; j++)
                    {
                        array[i, j] = Convert.ToInt32(Console.ReadLine());
                    }
                }
                Console.WriteLine("Invalid Input(should be a square matrix)");

            }
            else
            {
                
                Console.WriteLine("PLEASE ENTER THE MATRIX VALUE");
                for (i = 0; i < k; i++)
                {
                    for (j = 0; j < l; j++)
                    {
                        array[i, j] = Convert.ToInt32(Console.ReadLine());
                    }
                }

                Console.Write("\n\nMatrix All Value:");
                for (i = 0; i < k; i++)
                {
                    Console.Write("\n");
                    for (j = 0; j < l; j++)
                        Console.Write("{0}\t", array[i, j]);
                }

                for (i = 0; i < k; i++)
                {
                    for (j = 0; j < l; j++)
                    {
                        if (i == j)
                        {
                            m += array[i, j];
                        }
                    }
                }
                Console.WriteLine("\n\nTrace of the matrix is {0}", m);


            }
            Console.ReadLine();

        }

    }
}
