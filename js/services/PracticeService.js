app.factory('domains', function($http) {
    return {
        getDomains: function(callback) {
            $http.get('http://dev.nuviot.com/metadata/dox/domains').success(callback);
        }
    }
});