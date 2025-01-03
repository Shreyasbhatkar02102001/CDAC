using System;
using System.Collections.Generic;

namespace trial.Models;

public partial class Employee
{
    public long Empid { get; set; }

    public DateTime? CreatedOn { get; set; }

    public string? Department { get; set; }

    public string? Email { get; set; }

    public string? Fname { get; set; }

    public string? Lname { get; set; }

    public string? Location { get; set; }

    public long? Salary { get; set; }
}
