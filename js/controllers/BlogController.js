app.controller('BlogController', ['$scope', function($scope) {
    $scope.html = [
        {
            component: 'Navigation Bar'
        },
        {
            component: 'Card'
        },
        {
            component: 'Jumbotron'
        },
        {
            component: 'Button'
        },
        {
            component: 'Background Image'
        },
        {
            component: 'Dropdown'
        }
    ];

    $scope.angular = [
        {
            component: 'Page Routing'
        },
        {
            component: 'ng-repeat'
        },
        {
            component: 'ng-view'
        }
    ];
}])