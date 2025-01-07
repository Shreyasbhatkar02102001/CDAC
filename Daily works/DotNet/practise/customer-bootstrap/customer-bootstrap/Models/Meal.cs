using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Meal
{
    public int MealId { get; set; }

    public int? ChefId { get; set; }

    public string Name { get; set; } = null!;

    public string? Description { get; set; }

    public string MealPreference { get; set; } = null!;

    public string MealType { get; set; } = null!;

    public decimal Price { get; set; }

    public string? Ingredients { get; set; }

    public byte[]? ImageUrl { get; set; }

    public string CuisineType { get; set; } = null!;

    public string? DietaryTags { get; set; }

    public virtual Chef? Chef { get; set; }

    public virtual ICollection<Order> Orders { get; set; } = new List<Order>();

    public virtual ICollection<Rating> Ratings { get; set; } = new List<Rating>();
}
