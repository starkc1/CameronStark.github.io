var app = angular.module('Portfolio',[]);

app.config(['$routeProvider', function($routeProvider) {
    $routeProivder.
    when('/domains', {
        controller: 'DomainController'
    }).
    when('/domains/:domainKey', {
        controller: 'ModelController'
    }).
    otherwise({
       redirectTo: 'list' 
    });
}]);