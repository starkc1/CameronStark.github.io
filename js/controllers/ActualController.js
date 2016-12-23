app.controller('ActualController', function($scope, $http) {
    $http.get("http://dev.nuviot.com/metadata/dox/domains").then(function(response) {
        $scope.info = response.data;
    });
    $http.get("http://dev.nuviot.com/metadata/dox/domains" + info.key).then(function(response) {
        $scope.models = response.data
    });
});