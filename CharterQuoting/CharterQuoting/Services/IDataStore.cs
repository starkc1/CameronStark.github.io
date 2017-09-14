using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using CharterQuoting.Models;

namespace CharterQuoting
{
    public interface IDataStore<T>
    {
        Task<IEnumerable<T>> GetItemsAsync(bool forceRefresh = false);
    }
}
