var app = angular.module('Portfolio',['ngRoute']);

config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/domains.html', {templateUrl: 'domains.html'});   
    $routeProvider.when('/domains.html/id', {templateUrl: 'domains.html'});
}]);