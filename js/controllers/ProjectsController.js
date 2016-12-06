app.controller('ProjectsController', ['$scope', function($scope)
{
    $scope.projects =
    [
        {
            image: 'images/Project_1.png',
            desc1: 'Basic Math Solver',
            desc2: '(Windows 10)'
        },
        {
            image: 'images/Project_2.png',
            desc1: 'Basic Math Solver',
            desc2: '(iOS)'
        },
        {
            image: 'images/Project_2-5.png',
            desc1: 'Basic Math Solver',
            desc2: '(Android)'
        },
        {
            image: 'images/Project_3.png',
            desc1: 'The Frugal You',
            desc2: '(iOS and Android)'
        },
        {
            image: 'images/Project_4.jpg',
            desc1: 'EvenToConnect',
            desc2: '(Website)'
        },
        {
            image: 'images/Project_5.jpg',
            desc1: 'HackRiddle App',
            desc2: '(Website)'
        }
    ];
}]);