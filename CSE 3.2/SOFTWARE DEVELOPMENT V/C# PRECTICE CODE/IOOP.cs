using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab1
{
    public interface IOOP
    {
        void StudentInfo();
    }

    public class Student
    {
        //https://www.w3schools.com/cs/cs_properties.asp
        public string Name { get; set; }
        public int ID { get; set; }
        public string Section { get; set; }
    }
}
