app.controller('MainController', ['$scope', function($scope)
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

    $scope.experience = 
    [
        {
            image: 'images/StarkNetwork_Logo.png',
            company: 'Starknetwork',
            position: 'Mobile and Desktop Developer',
            desc1: 'Developed webpages for various customers',
            desc2: 'Developed mobile applications for various customers'
        },
        {
            image: 'images/Tier-Zero_Logo-Small.png',
            company: 'Tier-Zero',
            position: 'Lead Mobile and Desktop Developer',
            desc1: 'Developed Universal (UWP) apps for windows 10',
            desc2: 'Developed Windows 8.1 Desktop applications and Windows 8.1 Mobile applications'
        },
        {
            image: 'images/Fusion_Logo.png',
            company: 'Fusion Advertising',
            position: 'Lead Mobile Application Developer',
            desc1: 'Developed The Frugal You coupon application',
            desc1: 'Using Xamarin.Forms to create the Android and iOS aplication'
        }
    ];
}]);