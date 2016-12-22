app.factory('PracticeService', ['$http', function($http) {
    return $http.get('http://dev.nuviot.com/metadata/dox/domains')
        .success(function(data) {
            return data;
        })
        .error(function(err) {
            return err
        });
}]);