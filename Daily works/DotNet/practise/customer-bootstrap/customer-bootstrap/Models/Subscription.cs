using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Subscription
{
    public int SubscriptionId { get; set; }

    public int UserId { get; set; }

    public string PlanType { get; set; } = null!;

    public int MealCountPerWeek { get; set; }

    public DateTime SubscriptionStartDate { get; set; }

    public DateTime? SubscriptionEndDate { get; set; }

    public decimal Price { get; set; }

    public string Status { get; set; } = null!;

    public DateTime? CreatedAt { get; set; }

    public DateTime? UpdatedAt { get; set; }

    public virtual ICollection<Payment> Payments { get; set; } = new List<Payment>();

    public virtual User User { get; set; } = null!;
}
