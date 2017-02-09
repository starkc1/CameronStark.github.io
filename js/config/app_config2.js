 app.config(['$routeProvider', function($routeProvider) {

     $routeProvider
        .when('/Details', {
            templateUrl: 'views/Details.html'
        })
        .when('/Experience', {
            templateUrl: 'views/Experience.html'
        })
        .when('/Projects', {
            templateUrl: 'views/Projects.html'
        })
        .when('/Resume', {
            templateUrl: 'views/Resume.html'
        })
        .otherwise({
            redirectTo: '/Details'
        })
 }]);