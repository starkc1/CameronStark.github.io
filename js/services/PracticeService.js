app.factory('Domains', ['$http', function($http) {
    return $http.get('http://dev.nuviot.com/metadata/dox/domains')
        .success(function(data) {
            return data;
        })
}]);