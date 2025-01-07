using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Rating
{
    public int RatingId { get; set; }

    public int? UserId { get; set; }

    public int? ChefId { get; set; }

    public int? MealId { get; set; }

    public int? Rating1 { get; set; }

    public string? ReviewComment { get; set; }

    public DateTime? ReviewDate { get; set; }

    public virtual Chef? Chef { get; set; }

    public virtual Meal? Meal { get; set; }

    public virtual User? User { get; set; }
}
