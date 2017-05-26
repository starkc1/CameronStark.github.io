using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace FlightRiskAssessment
{

    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Departure : ContentPage
    {
        public Departure()
        {
            InitializeComponent();

        }

        public String DepAirport;
        public String DepTime;
        public String DepWind;
        public String DepVisibility;
        public String DepCeiling;
        public String DepTemperature;
        public String DepAltimeter;
        public String DepDewPoint;

        async void Button_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new Arrival());
        }
    }

}
