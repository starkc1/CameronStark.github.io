var app = angular.module('Portfolio',['ngRoute']);

config(['$routeProvider','$locationProvider' , function($routeProvider, $locationProvider) {
    $routeProvider.when('/NuvIoT', {templateUrl: 'NuvIoT.html'});   
    $routeProvider.when('/NuvIoT/Models', {templateUrl: '/partials/Models.html', controller:"ModelController"});
    $routeProvider.otherwise({redirectTo: '/NuvIoT'});

    $locationProvider.html5Mode(true);
}]);