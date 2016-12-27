var app = angular.module('Portfolio',[]);

app.config(['$routeProvider', function($routeProvider) {
    $routeProivder.
    when('/domains.html', {
        templateUrl: 'domains.html',
        controller: 'DomainController'
    }).
    when('/domains.html/:domainKey', {
        templateUrl: 'domains.html',
        controller: 'ModelController'
    }).
    otherwise({
       redirectTo: 'list' 
    });
}]);