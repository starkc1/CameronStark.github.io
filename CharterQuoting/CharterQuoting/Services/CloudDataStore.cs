using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;

using Newtonsoft.Json;
using Plugin.Connectivity;
using CharterQuoting.Models;


namespace CharterQuoting
{
    public class CloudDataStore : IDataStore<Destination>
    {
        HttpClient client;

        IEnumerable<Destination> destinations;

        public CloudDataStore()
        {
            client = new HttpClient();
            client.BaseAddress = new Uri($"{App.BackendUrl}/");

            destinations = new List<Destination>();
        }

        public async Task<IEnumerable<Destination>> GetItemsAsync(bool forceRefresh = false)
        {
            var json = await client.GetStringAsync($"api/airportCode");
            destinations = await Task.Run(() => JsonConvert.DeserializeObject<IEnumerable<Destination>>(json));

            return destinations;
        }
    }
}
