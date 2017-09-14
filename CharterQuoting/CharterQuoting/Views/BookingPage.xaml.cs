using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using CharterQuoting.Models;
using CharterQuoting.Views;
using CharterQuoting.ViewModels;

using Xamarin.Forms;

namespace CharterQuoting
{
    public partial class BookingPage : ContentPage
    {
        //PricingViewModel viewModel;

        public BookingPage()
        {
            InitializeComponent();

            //BindingContext = viewModel = new PricingViewModel();
            if (DepartureText.Text != "---" && ArrivalText.Text != "---")
            {
                List<Quotes> quoteList = PricingViewModel.getQuotes("Seminole", "Redmond", 14, 2);
                quoteListView.ItemsSource = quoteList;
            }
            //List<Quotes> quoteList = PricingViewModel.getQuotes("Seminole", "Redmond", 8, 2);

        }

        //protected override void OnAppearing()
        //{
        //    base.OnAppearing();
        //
        //    if (viewModel.Destinations.Count == 0)
        //        viewModel.LoadItemsCommand.Execute(null);
        //}


        async void DepartureClicked(object sender, System.EventArgs e)
        {
            await Navigation.PushAsync(new DeparturePage());
        }



    }
}
