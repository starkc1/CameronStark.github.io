app.controller('ActualController', function ($scope, $http) {
    $http.get("http://dev.nuviot.com/metadata/dox/domains").then(function (response) {
        $scope.info = response.data;
    }),
    $scope.IsVisible = false;
    $scope.ShowHide = function () {
        element.toggleClass('btn-active')
        if($scope.IsVisible) {
            $scope.buttonText = "Show More";
            $scope.IsVisible =false;
        } else {
            $scope.buttonText = "Show Less";
            $scope.IsVisible = true;
        }
    }
});