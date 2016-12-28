var app = angular.module('Portfolio',['ngRoute']);

config(['$routeProvider','$locationProvider' , function($routeProvider, $locationProvider) {
    $routeProvider.when('/NuvIoT.html', {templateUrl: 'NuvIoT.html'});   
    $routeProvider.when('/NuvIoT.html/id', {templateUrl: '/partials/Models.html', controller:"ModelController"});

    $locationProvider.html5Mode(true);
}]);