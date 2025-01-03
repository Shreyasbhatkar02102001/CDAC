using System;
using System.Collections.Generic;

namespace trial_6.Models;

public partial class ContactU
{
    public int ContactId { get; set; }

    public string Name { get; set; } = null!;

    public string Email { get; set; } = null!;

    public string? PhoneNumber { get; set; }

    public string QueryMessage { get; set; } = null!;
}
