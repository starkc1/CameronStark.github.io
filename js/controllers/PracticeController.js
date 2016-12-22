app.controller('PracticeController', ['$scope', 'PracticeService', function($scope, PracticeService) {
    PracticeService.success(function(data) {
        $scope.info = data;
    });
}]);