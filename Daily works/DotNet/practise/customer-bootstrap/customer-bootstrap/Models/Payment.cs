using System;
using System.Collections.Generic;

namespace customer_bootstrap.Models;

public partial class Payment
{
    public int PaymentId { get; set; }

    public int? OrderId { get; set; }

    public int? SubscriptionId { get; set; }

    public decimal AmountPaid { get; set; }

    public string PaymentMethod { get; set; } = null!;

    public string PaymentStatus { get; set; } = null!;

    public DateTime PaymentDate { get; set; }

    public virtual Order? Order { get; set; }

    public virtual Subscription? Subscription { get; set; }
}
