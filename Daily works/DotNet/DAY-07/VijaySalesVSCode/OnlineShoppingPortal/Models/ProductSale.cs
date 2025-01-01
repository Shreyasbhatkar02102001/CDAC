namespace OnlineShoppingPortal.Models
{
    public class ProductSale
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public double SalesPrice { get; set; }
        public double CostPrice { get; set; }
        public int QuantitySold { get; set; }
    }
}
