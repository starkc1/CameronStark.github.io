using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using CharterQuoting.Models;
using CharterQuoting.Views;

using Xamarin.Forms;


namespace CharterQuoting.Views
{
    public partial class DeparturePage : ContentPage
    {
        ItemsViewModel viewModel;

        public DeparturePage()
        {
            InitializeComponent();

            BindingContext = viewModel = new ItemsViewModel();



        }

        protected override void OnAppearing()
        {
            base.OnAppearing();

            if (viewModel.Destinations.Count == 0)
                viewModel.LoadItemsCommand.Execute(null);


        }
    }
}
