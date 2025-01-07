using System.ComponentModel.DataAnnotations;

namespace gods_is_only_my_hope.Models;

public partial class Subscription
{
    public long Id { get; set; }

    [Required(ErrorMessage = "Customer Name is required.")]
    [StringLength(100, ErrorMessage = "Customer Name cannot exceed 100 characters.")]
    public string? CustomerName { get; set; }

    [Required(ErrorMessage = "Plan is required.")]
    [StringLength(50, ErrorMessage = "Plan cannot exceed 50 characters.")]
    public string? Plan { get; set; }

    [Required(ErrorMessage = "Status is required.")]
    [StringLength(20, ErrorMessage = "Status cannot exceed 20 characters.")]
    public string? Status { get; set; }
}