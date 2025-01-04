using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Identity;

namespace trial_6.Models;

public partial class SignUp: IdentityUser
{

    public SignUp()
    {
        Id = Email;  // Set Id to Email
    }

    //public string Name { get; set; } = null!;

    //public string Email { get; set; } = null!;

    //public string Password { get; set; } = null!;

    //public string ConfirmPassword { get; set; } = null!;

    //public string PhoneNumber { get; set; } = null!;

    //public string Role { get; set; } = null!;


    public string Name { get; set; } = null!;  // Custom property
    public string ConfirmPassword { get; set; } = null!;  // Custom property
    public string Role { get; set; } = null!;  // Custom property

}
