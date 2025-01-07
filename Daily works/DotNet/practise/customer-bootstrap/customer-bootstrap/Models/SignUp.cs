using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Signup
{
    public string Name { get; set; } = null!;

    public string Email { get; set; } = null!;

    public string Password { get; set; } = null!;

    public string ConfirmPass { get; set; } = null!;

    public string PhoneNumber { get; set; } = null!;

    public string Role { get; set; } = null!;

    public virtual ICollection<Chef> Chefs { get; set; } = new List<Chef>();

    public virtual ICollection<User> Users { get; set; } = new List<User>();
}
