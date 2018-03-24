// Constants
var dateFormat = 'dd.MM.yyyy';
var dateTimeFormat = 'dd.MM.yyyy HH:mm:ss';

angular.module(
		'app',
		[ 'ui.bootstrap', 'ui.router', 'ngResource', 'app.directives',
				'app.controllers', 'app.services' ]).config(
		function($stateProvider) {
			$stateProvider.state('employees', {
				url : '/employees',
				templateUrl : 'view/employees-list',
				controller : 'EmployeesListController'
			}).state('discussion-form', {
				url : '/discussion-form/:employeeId',
				templateUrl : 'view/discussion-form',
				controller : 'DiscussionFormController'
			}).state('discussions-view', {
				url : '/discussions-view',
				templateUrl : 'view/discussions-view',
				controller : 'DiscussionsViewController'
			});

		}).run(function($rootScope, $state) {
	$rootScope.dateFormat = dateFormat;
	$rootScope.dateTimeFormat = dateTimeFormat;
	$state.go('employees');
});
