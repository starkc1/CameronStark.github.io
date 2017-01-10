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

    $scope.report = [
        {
            period: 'Week of January 1st - January 7th',
            hours: 'Time Spent: 13.58 hrs',
            task1: 'ACCOMPLISHMENTS: Accomplished setting up controllers and with assitance completed the passing of parameters for the user to move through the website and JSON URLs',
            task2: 'WHAT I LEARNED: Learned how services work with the html and controllers to allow for the passing of parameters between various controllers',
            task3: 'DIFFICULTY: I found that getting the controller to receive the parameter once passed by the first controller and the service because the way angular can be used varies from each person therefore learning can be a challenge at times',
            task4: 'ENJOYED: I enjoyed trying to figure it out and also seeing the effect of passing parameter by use of the console.log which was cool to see it working'
        },
        {
            period: 'Week of December 25th - December 31st',
            hours: 'Time Spent: 15.28 hrs',
            task1: 'ACCOMPLISHMENTS: Accomplished setting up controllers for the three JSON urls and formatted them in a single page website',
            task2: 'WHAT I LEARNED: Learned routing and how it can be used with multiple controllers to create a website',
            task3: 'DIFFICULTY: I found that getting the routing and the ng-view to get working was difficult and passing a value from the view to a controller',
            task4: 'ENJOYED: I enjoyed setting up the whole thing because final effect of the siingle wab page layout is very interesting'
        },
        {
            period: 'Week of December 17th - December 23rd',
            hours: 'Time Spent: 15.29 hrs',
            task1: 'ACCOMPLISHMENTS: Accomplished setting up the first controller and began work on routing',
            task2: 'WHAT I LEARNED: Learned the basics of Angular and how it works with HTML',
            task3: 'DIFFICULTY: I found that getting the routing to be setup correctly and getting the angular components to work properly within the webpage to be difficult becuase there can be very little feed back from the webpage',
            task4: 'ENJOYED: I enjoyed learning a new language and seeing what it is capable of is very interesting'
        },
    ];
}]);