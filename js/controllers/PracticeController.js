app.controller('PracticeController', ['$scope', 'Domains', function($scope, Domains) {
    Domains.success(function(data) {
        $scope.Domains = data;
    });
}]);