app.controller('MainController', ['$scope', function($scope) {
    $scope.languages = [
        {
            lang: 'Python'
        },
        {
            lang: 'HTML'
        },
        {
            lang: 'XAML'
        },
        {
            lang: 'C++'
        },
        {
            lang: 'AngularJS'
        },
        {
            lang: 'Ruby'
        },
        {
            lang: 'C#'
        },
        {
            lang: 'Bootstrap'
        },
        {
            lang: 'CSS'
        },
        {
            lang: 'Xamarin'
        }
    ];

    $scope.programs = [
        {
            prog: 'Visual Studio'
        },
        {
            prog: 'MatLab'
        },
        {
            prog: 'Photoshop'
        },
        {
            prog: 'Catia'
        },
        {
            prog: 'Blender'
        },
        {
            prog: 'AutoCad'
        }
    ];
}]);