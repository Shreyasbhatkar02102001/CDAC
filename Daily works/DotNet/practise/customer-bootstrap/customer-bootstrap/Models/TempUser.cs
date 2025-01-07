using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class TempUser
{
    public int UserId { get; set; }

    public string Name { get; set; } = null!;

    public string Email { get; set; } = null!;

    public string PhoneNumber { get; set; } = null!;

    public string? DietaryPreferences { get; set; }

    public string? ProfilePicture { get; set; }

    public DateTime? CreatedAt { get; set; }

    public DateTime? UpdatedAt { get; set; }
}
