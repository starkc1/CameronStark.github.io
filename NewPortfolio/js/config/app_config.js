app.config(['$routeProvider', function($routeProvider) {
    $routeProvider
        .when('/Home', {
            templateUrl: 'views/Home.html'
        })
        .when('/Experience', {
            templateUrl: 'views/Experience.html'
        })
        .otherwise({
            redirectTo: '/Home'
        })
        
}]);