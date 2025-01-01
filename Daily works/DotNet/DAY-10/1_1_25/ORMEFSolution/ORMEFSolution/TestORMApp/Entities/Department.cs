using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestORMApp.Entities
{
    public class Department
    {
        public int DepartmentId { get; set; } // Primary Key
        public string Name { get; set; }
        public ICollection<Employee> Employees { get; set; } // Navigation property
    }
}
