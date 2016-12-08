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
            image: 'images/StarkNetwork_Logo2.jpg',
            company: 'Starknetwork',
            position: 'Mobile and Desktop Developer',
            desc1: 'Developed webpages/apps for various customers',
        },
        {
            image: 'images/Tier-Zero_Logo-Small.png',
            company: 'Tier-Zero',
            position: 'Lead Mobile and Desktop Developer',
            desc1: 'Developed Universal (UWP) apps for windows 10',
        },
        {
            image: 'images/Fusion_Logo.png',
            company: 'Fusion Advertising',
            position: 'Lead Mobile Application Developer',
            desc1: 'Using Xamarin.Forms to create the Android and iOS aplication'
        }
    ];

    $scope.languages = 
    [
        {
            lang1: 'HTML',
            lang2: 'C#'
        },
        {
            lang1: 'Xamarin',
            lang2: 'C++'
        },
        {
            lang1: 'CSS',
            lang2: 'Python'
        },
        {
            lang1: 'XAML',
            lang2: 'JavaScript'
        },
        {
            lang1: 'Ruby',
            lang2: 'SQL'
        },
        {
            lang1: 'Bootstrap',
            lang2: 'AngularJS'
        },
    ];

    $scope.software =
    [
        {
            software1: 'Visual Studio 2015',
            software2: 'Matlab'
        },
        {
            software1: 'Vegas Studio',
            software2: 'Catia'
        },
        {
            software1: 'Blender',
            software2: 'AutoCad'
        },
        {
            software1: 'Photoshop',
            software2: 'GitHub'
        }
    ];

    $scope.projectsdetailed = 
    [   
        {
            title: 'Basic Math Solver (Windows 10)',
            image: 'images/Project_1.png',
            created: 'Created By: Cameron Stark',
            p1: 'Solve basic math problems such as Area, Volume and Trig',
            p2: 'Made with Visual Studio 2015',
            p3: 'C# and XAML'
        },
        {
            title: 'Basic Math Solver (iOS)',
            image: 'images/Project_2.png',
            created: 'Created By: Cameron Stark',
            p1: 'Solve basic math problems such as Area, Volume and Trig',
            p2: 'Made with Visual Studio 2015 and Xamarin Studio',
            p3: 'C#, XAML, and Xamarin.Forms'
        },
        {
            title: 'Basic Math Solver (Android)',
            image: 'images/Project_2-5.png',
            created: 'Created By: Cameron Stark',
            p1: 'Solve basic math problems such as Area, Volume and Trig',
            p2: 'Made with Visual Studio 2015 and Xamarin Studio',
            p3: 'C#, XAML, and Xamarin.Forms'
        },
        {
            title: 'The Frugal You (iOS and Android)',
            image: 'images/Project_3.png',
            created: 'Created By: Cameron Stark',
            p1: 'Collect and use coupons for various stores and products',
            p2: 'Made with Visual Studio 2015 and Xamarin Studio',
            p3: 'C#, XAML, and Xamarin.Forms'
        },
        {
            title: 'EvenToConnect (Website)',
            image: 'images/Project_4.jpg',
            created: 'Created By: Cameron Stark, Pablo Garces, Brian Nunes De Souza, and Nicholas Van Bommel at HackRiddle 2016',
            p1: 'Takes user uploaded pictures and parses them through the clairfai API to determine what category they belong in',
            p2: 'Made with Visual Studio 2015',
            p3: 'C#.NET, HTML, CSS, and Bootstrap'
        },
        {
            title: 'HackRiddle App (Website)',
            image: 'images/Project_5.jpg',
            created: 'Created By: Embry-Riddle Mobile Application Development Club for HackRiddle 2016',
            p1: 'Allows HackRiddle attendees to keep track of social media and events going on during hackriddle',
            p2: 'HTML, CSS, and Materialize',
            p3: 'Twitter API and Notification API'
        }
    ];
}]);