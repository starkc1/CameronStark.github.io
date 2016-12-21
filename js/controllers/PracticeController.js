app.controller('PracticeController', function($scope, domains) {
    domains.getDomains(function(data) {
        $scope.info = data;
    });
});