app.controller('ModelController', function($scope, $http, $attrs) {
    $http.get("http://dev.nuviot.com/metadata/dox/domains" + "/" + id ).then(function(response) {
        $scope.model = response.data;
    });
});