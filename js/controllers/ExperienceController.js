app.controller('ProjectsController', ['$scope', function($scope)
{
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