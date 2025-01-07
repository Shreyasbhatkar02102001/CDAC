using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Dietary
{
    public int DietaryId { get; set; }

    public string UserName { get; set; } = null!;

    public string DietaryPreference { get; set; } = null!;

    public string? Description { get; set; }
}
