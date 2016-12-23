app.directive('Detailed', function() {
    return {
        restrict: 'E',
        scope: {},
        templateUrl: 'js/directives/Detailed.html',

        link: function($scope, element, attrs) {
            $scope.detailed = function() {

            }
        }
    }
})