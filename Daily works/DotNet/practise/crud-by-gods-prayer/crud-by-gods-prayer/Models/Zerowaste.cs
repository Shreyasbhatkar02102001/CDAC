using System;
using System.Collections.Generic;

namespace crud_by_gods_prayer.Models
{
    public partial class Zerowaste
    {
        public long Id { get; set; }
        public string? DonatedTo { get; set; }
        public string? Name { get; set; }
        public string? Quantity { get; set; }
    }
}
