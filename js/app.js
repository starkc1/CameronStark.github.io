var app = angular.module('Portfolio',['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {

    $routeProvider
        .when('starkc1.github.io/NuvIoT', {
            templateUrl: 'NuvIoT.html',
            controller: 'DomainController'
        })
        .when('starkc1.github.io/NuvIoT/Models', {
            templateUrl: 'models.html'
        })
        .otherwise({
            redirectTo: 'starkc1.github.io/NuvIoT'
        });

}]);