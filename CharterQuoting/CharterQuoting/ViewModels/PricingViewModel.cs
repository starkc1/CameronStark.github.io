using System;
using System.Collections.Generic;
using Xamarin.Forms;
using CharterQuoting.Models;
using CharterQuoting.ViewModels;
using CharterQuoting.Views;

namespace CharterQuoting.ViewModels
{
    public class PricingViewModel
    {

        public PricingViewModel()
        {
            createPlaneList();
            createCharterList();
        }

        public static List<Planes> createPlaneList()
        {
            List<Planes> planeList = new List<Planes>();
            planeList.Add(new Planes() { PlaneName = "Cessna 510 Mustang", PlaneCapacity = "4", PlaneSpeed = 330, PlaneRange = 1050, PriceRate = 1700, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Cessna Citation 1", PlaneCapacity = "6", PlaneSpeed = 350, PlaneRange = 1000, PriceRate = 2000, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Cessna C560 Citation V", PlaneCapacity = "7", PlaneSpeed = 370, PlaneRange = 1920, PriceRate = 3300, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Eclipse 500", PlaneCapacity = "4", PlaneSpeed = 375, PlaneRange = 900, PriceRate = 2600, TotalFuel = 1698 });
            planeList.Add(new Planes() { PlaneName = "Cessna C560 Citation Encore", PlaneCapacity = "7", PlaneSpeed = 380, PlaneRange = 1700, PriceRate = 3600, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "1124 Westwind", PlaneCapacity = "9", PlaneSpeed = 415, PlaneRange = 1800, PriceRate = 4700, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Falcon 50", PlaneCapacity = "9", PlaneSpeed = 420, PlaneRange = 3200, PriceRate = 5700, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "1123 Commodore", PlaneCapacity = "7", PlaneSpeed = 427, PlaneRange = 1400, PriceRate = 4600, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Hawker 900", PlaneCapacity = "9", PlaneSpeed = 440, PlaneRange = 2500, PriceRate = 4300, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Citation Latitude", PlaneCapacity = "8", PlaneSpeed = 440, PlaneRange = 2900, PriceRate = 4200, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "G100", PlaneCapacity = "8", PlaneSpeed = 330, PlaneRange = 3000, PriceRate = 4500, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Legacy 450", PlaneCapacity = "8", PlaneSpeed = 500, PlaneRange = 2500, PriceRate = 4000, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Falcon 8X", PlaneCapacity = "13", PlaneSpeed = 300, PlaneRange = 6450, PriceRate = 12300, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Challenger 601", PlaneCapacity = "11", PlaneSpeed = 420, PlaneRange = 3200, PriceRate = 5500, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Falcon 2000DX", PlaneCapacity = "10", PlaneSpeed = 430, PlaneRange = 3000, PriceRate = 6000, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Gulfstream GIV", PlaneCapacity = "13", PlaneSpeed = 440, PlaneRange = 4200, PriceRate = 6300, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Falcon 900LX", PlaneCapacity = "13", PlaneSpeed = 447, PlaneRange = 3800, PriceRate = 6500, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Legacy 600 Executive", PlaneCapacity = "13", PlaneSpeed = 450, PlaneRange = 3250, PriceRate = 6000, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Hawker 1000", PlaneCapacity = "8", PlaneSpeed = 453, PlaneRange = 3500, PriceRate = 6000, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Challenger 850", PlaneCapacity = "13", PlaneSpeed = 460, PlaneRange = 2300, PriceRate = 5600, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Gulfstream G450", PlaneCapacity = "13", PlaneSpeed = 459, PlaneRange = 4200, PriceRate = 6600, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Challenger 605", PlaneCapacity = "10", PlaneSpeed = 600, PlaneRange = 4077, PriceRate = 6400, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Challenger 350", PlaneCapacity = "8", PlaneSpeed = 460, PlaneRange = 3200, PriceRate = 5700, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Legacy 500", PlaneCapacity = "12", PlaneSpeed = 470, PlaneRange = 3000, PriceRate = 4400, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Challenger 890", PlaneCapacity = "16", PlaneSpeed = 470, PlaneRange = 2000, PriceRate = 5700, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Cessna C750 Citation X", PlaneCapacity = "8", PlaneSpeed = 475, PlaneRange = 3400, PriceRate = 6000, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Falcon 7X", PlaneCapacity = "13", PlaneSpeed = 480, PlaneRange = 5900, PriceRate = 7200, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Bombardier Global 5000", PlaneCapacity = "13", PlaneSpeed = 500, PlaneRange = 4700, PriceRate = 7200, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Bombardier Global Express XRS", PlaneCapacity = "14", PlaneSpeed = 500, PlaneRange = 6000, PriceRate = 7500, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Flacon 5X", PlaneCapacity = "14", PlaneSpeed = 590, PlaneRange = 5200, PriceRate = 11300, TotalFuel = 2580 });
            planeList.Add(new Planes() { PlaneName = "Gulfstream G650", PlaneCapacity = "14", PlaneSpeed = 610, PlaneRange = 7500, PriceRate = 15900, TotalFuel = 2580 });
            return planeList;
        }

        public static List<Charters> createCharterList()
        {
            List<Charters> charterList = new List<Charters>();
            charterList.Add(new Charters() { CharterName = "PrimeJet", CharterFee = 600, CharterFuelCost = 2, InternationalFee = 200, LuggageFee = 100 });
            charterList.Add(new Charters() { CharterName = "Luxury Travel", CharterFee = 1200, CharterFuelCost = 1, InternationalFee = 0, LuggageFee = 150 });
            charterList.Add(new Charters() { CharterName = "Premier Flight Services", CharterFee = 800, CharterFuelCost = 2, InternationalFee = 400, LuggageFee = 100 });
            charterList.Add(new Charters() { CharterName = "Budget Private Charters", CharterFee = 500, CharterFuelCost = 1, InternationalFee = 100, LuggageFee = 0 });
            charterList.Add(new Charters() { CharterName = "Private Air", CharterFee = 600, CharterFuelCost = 3, InternationalFee = 150, LuggageFee = 150 });
            charterList.Add(new Charters() { CharterName = "One Air", CharterFee = 900, CharterFuelCost = 2, InternationalFee = 150, LuggageFee = 200 });
            return charterList;
        }

        public static List<Quotes> getQuotes(string departure, string arrival, int passengers, int luggage)
        {
            List<Planes> planeList = createPlaneList();
            List<Charters> charterList = createCharterList();
            List<Quotes> quoteList = new List<Quotes>();

            double DepLat = 32.71;
            double DepLon = -102.73;
            double ArrLat = 44.25;
            double ArrLon = -121.14;


            double distance = Math.Round(getDistance(DepLat, DepLon, ArrLat, ArrLon) * 0.8684);

            foreach (var plane in planeList)
            {
                if (Convert.ToInt64(plane.PlaneCapacity) >= passengers)
                {
                    if (!isInternational())
                    {
                        double time = distance / (plane.PlaneSpeed * 1.15078);
                        double travelPrice = time * plane.PriceRate;

                        double fuel = plane.TotalFuel;
                        foreach (var charter in charterList)
                        {
                            double fuelPrice = fuel / charter.CharterFuelCost;
                            double luggagePrice = luggage * charter.LuggageFee;

                            double quote = travelPrice + fuelPrice + charter.CharterFee + luggagePrice;

                            quoteList.Add(new Quotes() { DepartureLocation = departure, ArrivalLocation = arrival, CharterCompany = charter.CharterName, FlightQuote = Math.Round(quote), PlaneName = plane.PlaneName });
                        }


                    }
                    else if (isInternational())
                    {

                        double time = distance / plane.PlaneSpeed;
                        double travelPrice = time * plane.PriceRate;

                        double fuel = plane.TotalFuel;
                        foreach (var charter in charterList)
                        {
                            double fuelPrice = fuel / charter.CharterFuelCost;
                            double luggagePrice = luggage * charter.LuggageFee;

                            double quote = travelPrice + fuelPrice + charter.CharterFee + luggagePrice + charter.InternationalFee;

                            quoteList.Add(new Quotes() { DepartureLocation = departure, ArrivalLocation = arrival, CharterCompany = charter.CharterName, FlightQuote = quote, PlaneName = plane.PlaneName });
                        }

                    }

                }
                else
                {

                }
            }



            return quoteList;
        }

        public static bool isInternational()
        {
            bool international = false;

            return international;
        }

        public static double getDistance(double DepLat, double DepLon, double ArrLat, double ArrLon)
        {
            double DepLatR = (Math.PI * DepLat) / 180;
            double ArrLatR = (Math.PI * ArrLat) / 180;
            double theta = DepLon - ArrLon;
            double distance = Math.Sin(DepLatR) * Math.Sin(ArrLatR) / Math.Cos(DepLatR) * Math.Cos(ArrLatR) * Math.Cos(theta);
            distance = Math.Acos(distance);
            distance = distance * 180 / Math.PI;
            distance = distance * 60 * 1.1515;

            return distance;
        }
    }
}
