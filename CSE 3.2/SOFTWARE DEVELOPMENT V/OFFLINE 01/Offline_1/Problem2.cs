using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Offline_1
{
    class Problem2
    {
        public void listoutput()
        {
            Console.WriteLine("PLEASE ENTER THE STRING \n");
            string Device_Name = Console.ReadLine();
            Console.WriteLine(Device_Name);

            var Splite = Device_Name.Split(' ');
            var Splite_list = Splite.ToList();

            Console.WriteLine("THE SPLTE RESULT IS: \n");

            foreach (var list in Splite_list)
            {
                Console.WriteLine(list);
            }
            Console.WriteLine("\n");

            Splite_list.Sort();
            Splite_list.Reverse();

            Console.WriteLine("SORTING LIST IS: \n");

            foreach (var sortlist in Splite_list)
            {
                Console.WriteLine(sortlist);
            }

           Console.WriteLine("\nAdd Second Lists: \n");

             var SecondList = new List<string>() { };
             SecondList.Add(Console.ReadLine());
             SecondList.Add(Console.ReadLine());
             SecondList.Add(Console.ReadLine());


             Console.WriteLine("Second List :\n");
             foreach (var j in SecondList)
             {
                  Console.WriteLine(j);
             }

            Splite_list.InsertRange(6, SecondList);
            Console.WriteLine("\nInserting the first list on the top of the second list :");
            foreach (var k in Splite_list)
            {
                Console.WriteLine(k);
            }
            Console.WriteLine("PLEASE SELECT THE FAST LIST OR SECOUND LIST FOR REMOVING \n");
            Console.WriteLine("IF YOU SELECT FIRST ITEM PLEASE PRESS 1 OR PRESS 2");
            int x = Convert.ToInt32(Console.ReadLine()); 
            if(x==1)
            {
                Console.WriteLine("\nRemove Items:");
                Splite_list.Remove(Console.ReadLine());

                Console.WriteLine("\nAfter removing the list is: ");
                foreach (var l in Splite_list)
                {
                    Console.WriteLine(l);
                }

                Console.WriteLine("\nRemove Items:");
                Splite_list.Remove(Console.ReadLine());

                Console.WriteLine("\nAfter removing the list is: ");
                foreach (var l in Splite_list)
                {
                    Console.WriteLine(l);
                }

            }
           /* else if(x==1 && x==2)
            {
                Console.WriteLine("\nRemove Items:");
                Splite_list.Remove(Console.ReadLine());

                Splite_list.Remove(Console.ReadLine());

                Console.WriteLine("\nAfter removing the list is: ");
                foreach (var l in Splite_list)
                {
                    Console.WriteLine(l);
                }

                Console.WriteLine("\nRemove Items:");
                Splite_list.Remove(Console.ReadLine());

                Console.WriteLine("\nAfter removing the list is: ");
                foreach (var l in Splite_list)
                {
                    Console.WriteLine(l);
                }
            }*/
            else
            {
                Console.WriteLine("\nRemove Items:");
                SecondList.Remove(Console.ReadLine());

               // Splite_list.Remove(Console.ReadLine());

                Console.WriteLine("\nAfter removing the list is: ");
                foreach (var l in Splite_list)
                {
                    Console.WriteLine(l);
                }

                Console.WriteLine("\nRemove Items:");
                SecondList.Remove(Console.ReadLine());

                Console.WriteLine("\nAfter removing the list is: ");
                foreach (var l in Splite_list)
                {
                    Console.WriteLine(l);
                }
            }
            

            Console.ReadLine();
        }
      

    }
}
