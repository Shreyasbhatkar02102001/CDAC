using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Chef
{
    public int ChefId { get; set; }

    public string Name { get; set; } = null!;

    public string Email { get; set; } = null!;

    public string? Bio { get; set; }

    public string? ProfilePicture { get; set; }

    public string DeliveryArea { get; set; } = null!;

    public decimal? Rating { get; set; }

    public string ContactInfo { get; set; } = null!;

    public DateTime? CreatedAt { get; set; }

    public DateTime? UpdatedAt { get; set; }

    public virtual Signup EmailNavigation { get; set; } = null!;

    public virtual ICollection<Meal> Meals { get; set; } = new List<Meal>();

    public virtual ICollection<Order> Orders { get; set; } = new List<Order>();

    public virtual ICollection<Rating> Ratings { get; set; } = new List<Rating>();
}
