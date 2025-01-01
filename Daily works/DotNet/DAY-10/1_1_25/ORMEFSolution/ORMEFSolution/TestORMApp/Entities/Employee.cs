using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestORMApp.Entities
{
    public class Employee
    {
        public int EmployeeId { get; set; } // Primary Key
        public string Name { get; set; }
        public string Position { get; set; }
        public int DepartmentId { get; set; } // Foreign Key
        public Department Department { get; set; } // Navigation property
    }
}
