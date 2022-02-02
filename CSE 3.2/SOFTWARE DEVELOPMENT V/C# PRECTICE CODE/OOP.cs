using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public class OOP : IOOP
    {
        public void StudentInfo()
        {
            var studentList = new List<Student>()
            {
                new Student() {Name = "Rifat", ID=32, Section="A"},
                new Student() {Name = "Rakib", ID=33, Section="A"},
                new Student() {Name = "Shishir", ID=84, Section="B"}
            };

            studentList.Add(new Student() { Name = "Jerin", ID = 12, Section = "A" });
            studentList.Add(new Student() { Name = "Nasim", ID = 82, Section = "B" });

            // Count total number of students in Section A and B

            int countA = 0, countB = 0;

            foreach (var student in studentList)
            {
                if (student.Section == "A")
                {
                    countA++;
                }
                else if (student.Section == "B")
                {
                    countB++;
                }
            }

            Console.WriteLine($"Total Students in A: {countA}");
            Console.WriteLine($"Total Students in B: {countB}");


            Console.ReadLine();
        }
    }
}
