using System;
namespace CharterQuoting.Models
{
    public class Destination
    {
        public int ID { get; set; }
        public string APID { get; set; }
        public string AirportCode { get; set; }
        public string AltAPCode { get; set; }
        public string FriendlyName { get; set; }
        public string CountryAbbrv { get; set; }
        public string USState { get; set; }
        public string USCity { get; set; }

        public string geoPoint { get; set; }
        public string lat { get; set; }
        public string lon { get; set; }
    }
}
