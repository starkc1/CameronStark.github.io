using System;
namespace CharterQuoting.Models
{
    public class Quotes
    {
        public string DepartureLocation { get; set; }
        public string ArrivalLocation { get; set; }
        public string PlaneName { get; set; }
        public string CharterCompany { get; set; }
        public double FlightQuote { get; set; }
    }
}
