using Xamarin.Forms;
using System.Collections.Generic;

namespace CharterQuoting
{
    public partial class App : Application
    {
        public static bool UseMockDataStore = false;

        public static string BackendUrl = "http://tier0productions.com/";

        public App()
        {
            InitializeComponent();

            MainPage = new NavigationPage(new TabbedPageMain());
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
