using System;
using System.Collections.ObjectModel;
using System.Diagnostics;
using System.Threading.Tasks;
using CharterQuoting.Models;

using Xamarin.Forms;

namespace CharterQuoting
{
    public class ItemsViewModel : BaseViewModel
    {
        public ObservableCollection<Destination> Destinations { get; set; }

        public Command LoadItemsCommand { get; set; }

        public ItemsViewModel()
        {
            Title = "Booking";
            Destinations = new ObservableCollection<Destination>();
            LoadItemsCommand = new Command(async () => await ExecuteLoadItemsCommand());
        }

        async Task ExecuteLoadItemsCommand()
        {
            if (IsBusy)
                return;

            IsBusy = true;

            try
            {
                Destinations.Clear();
                var destinations = await DataStore.GetItemsAsync(true);
                foreach (var item in destinations)
                {
                    Destinations.Add(item);
                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine(ex);
            }
            finally
            {
                IsBusy = false;
            }
        }
    }
}
