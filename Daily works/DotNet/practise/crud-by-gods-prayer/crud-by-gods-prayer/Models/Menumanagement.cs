using System;
using System.Collections.Generic;

namespace crud_by_gods_prayer.Models
{
    public partial class Menumanagement
    {
        public int Id { get; set; }
        public string? Description { get; set; }
        public string? Name { get; set; }
        public int? Price { get; set; }
    }
}
