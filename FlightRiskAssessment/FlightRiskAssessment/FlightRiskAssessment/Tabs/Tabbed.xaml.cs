using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;


namespace FlightRiskAssessment
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Tabbed : TabbedPage
    {

        public Tabbed()
        {
            InitializeComponent();

            var navigationPage = new NavigationPage(new Departure());
            navigationPage.Title = "Simulation";

            Children.Add(navigationPage);
            Children.Add(new HowTo());
        }
    }
}
