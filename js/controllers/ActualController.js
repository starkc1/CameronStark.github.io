app.controller('ActualController', function($scope, $http) {
    $http.get("http://dev.nuviot.com/metadata/dox/domains").then(function(response) {
        $scope.info = response.data;
        $scope.IsVisible = false;
        $scope.ShowHide = function() {
            $scope.IsVisible = $scope.IsVisible ? false : true;
        }
    });
});