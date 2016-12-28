var app = angular.module('Portfolio',['ngRoute']);

app.config(['$routeProvider','$locationProvider' , function($routeProvider, $locationProvider) {

    $routeProvider
        .when('/NuvIoT', {
            templateUrl: 'NuvIoT.html',
            controller: 'DomainController'
        })
        .when('/NuvIoT/Models', {
            templateUrl: 'index.html'
        })
        .otherwise({
            redirectTo: '/NuvIoT'
        });

    $locationProvider.html5Mode(true);
}]);