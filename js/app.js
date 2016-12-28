var app = angular.module('Portfolio',['ngRoute']);

config(['$routeProvider','$locationProvider' , function($routeProvider, $locationProvider) {
    $routeProvider.when('/NuvIot.html', {templateUrl: 'NuvIoT.html'});   
    $routeProvider.when('/NuvIoT.html/id', {templateUrl: 'Models.html'});

    $locationProvider.html5Mode({enabled: true, requireBase: false});
}]);