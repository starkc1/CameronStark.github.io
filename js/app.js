var app = angular.module('Portfolio',['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {

    $routeProvider
        .when('/NuvIoT', {
            templateUrl: 'NuvIoT.html',
            controller: 'DomainController'
        })
        .when('/NuvIoT/Models', {
            templateUrl: 'NuvIoT.html'
        })
        .otherwise({
            redirectTo: '/NuvIoT'
        });

}]);