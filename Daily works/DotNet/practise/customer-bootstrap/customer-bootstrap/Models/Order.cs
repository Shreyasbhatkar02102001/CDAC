using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Order
{
    public int OrderId { get; set; }

    public int? UserId { get; set; }

    public int? ChefId { get; set; }

    public int? MealId { get; set; }

    public int Quantity { get; set; }

    public DateTime? OrderDate { get; set; }

    public string DeliveryAddress { get; set; } = null!;

    public decimal TotalAmount { get; set; }

    public string Status { get; set; } = null!;

    public string DeliveryTimeSlot { get; set; } = null!;

    public string PaymentStatus { get; set; } = null!;

    public string PaymentMethod { get; set; } = null!;

    public virtual Chef? Chef { get; set; }

    public virtual Meal? Meal { get; set; }

    public virtual ICollection<Payment> Payments { get; set; } = new List<Payment>();

    public virtual User? User { get; set; }
}
