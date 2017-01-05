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

    $scope.experience = [
        {
            company: 'StarkNetwork',
            img: 'images/StarkNetwork_Logo2.jpg',
            position: 'Web and App Developer',
            info1: 'Developed webpages for various customers',
            info2: 'Developed mobile apps for various customers'
        },
        {
            company: 'Tier-Zero',
            img: 'images/tier-zero-nobg.png',
            position: 'Lead Web and App Developer',
            info1: 'Developed UWP apps for Windows 10',
            info2: 'Developed Windows 8.1 apps'
        },
        {
            company: 'Fusion Advertising Inc.',
            img: 'images/Fusion_Logo.png',
            position: 'Lead Mobile Application Developer',
            info1: 'Developed The Frugal You coupon application',
            info2: 'Developed the database for coupon storage'
        },
    ];
}]);