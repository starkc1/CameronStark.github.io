app.directive('ActualDirective', function() {
    return {
        restrict: 'E',
        scope: {
            info: '='
        },
        templateUrl: 'js/directives/ActualDirective.html'
    };
});