var app = angular.module('Portfolio',['ngRoute']);

config(['$routeProvider','$locationProvider' , function($routeProvider, $locationProvider) {
    $routeProvider.when('/', {templateUrl: 'NuvIoT.html'});   
    $routeProvider.when('/id', {templateUrl: '/partials/Models.html'});

    $locationProvider.html5Mode({enabled: true, requireBase: false});
}]);