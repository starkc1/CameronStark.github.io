var app = angular.module('Portfolio',[]);

app.config(['$routeProvider', function($routeProvider) {
    $routeProivder.
    when('/domains.html', {
        controller: 'DomainController'
    }).
    when('/domains.html/:domainKey', {
        controller: 'ModelController'
    }).
    otherwise({
       redirectTo: 'list' 
    });
}]);