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
    public partial class Risk : ContentPage
    {
        public Risk()
        {
            InitializeComponent();

            var scroll = new ScrollView();
            Content = scroll;

            var stack = new StackLayout();
            

            var Title = new Label();
            Title.Text = "Flight From KDAB To KDCA";
            Title.FontSize = 18;
            Title.HorizontalTextAlignment = TextAlignment.Center;
            Title.TextColor = Color.FromHex("#1d58b8");
            Title.FontAttributes = FontAttributes.Bold;
            Title.Margin = 10;

            var RatingTot = new Label();
            RatingTot.Text = "Flight Risk Is Medium";
            RatingTot.FontSize = 16;
            RatingTot.HorizontalTextAlignment = TextAlignment.Center;
            RatingTot.TextColor = Color.Yellow;


            stack.Children.Add(Title);
            stack.Children.Add(RatingTot);



            scroll.Content = stack;


        }
    }

}