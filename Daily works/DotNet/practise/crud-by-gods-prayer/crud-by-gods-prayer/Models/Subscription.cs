using System;
using System.Collections.Generic;

namespace crud_by_gods_prayer.Models
{
    public partial class Subscription
    {
        public long Id { get; set; }
        public string? CustomerName { get; set; }
        public string? Plan { get; set; }
        public string? Status { get; set; }
    }
}
