var appmodule = angular.module('app.controllers', []);

/*
 * https://docs.angularjs.org/api/ngResource/service/$resource 'get':
 * {method:'GET'}, 'save': {method:'POST'}, 'query': {method:'GET',
 * isArray:true}, 'remove': {method:'DELETE'}, 'delete': {method:'DELETE'}
 */

appmodule.controller('BlankController', function() {
});

appmodule.controller('EmployeesListController', function($scope, $state,
		Employee) {

	$scope.employees = [];

	$scope.load = function() {
		Employee.query(function(data) {
			$scope.employees = data;
		});
	};
	$scope.load();

	$scope.addDiscussion = function(employeeId) {
		$state.go('discussion-form', {
			employeeId : employeeId
		});
	}

});

appmodule.controller('DiscussionFormController', function($scope, $state, $filter, Employee, Discussion) {

	var vm = this;
	$scope.messages = [];
	$scope.employee = {};
	$scope.discussion = new Discussion();

	$scope.load = function() {
		Employee.get({
			employeeId : $state.params.employeeId
		}, function(data) {
			$scope.employee = data;
			$scope.discussion.employeeId = $state.params.employeeId;
		})
	};
	$scope.load();

	$scope.showError = function() {
		$scope.messages.push({
			msg : 'Cannot add a disuccsion.'
		});
	};

	$scope.save = function() {
		var form = $scope.discussionForm;
		form.$setSubmitted();
		if (form && form.$invalid) {
			return;
		}
		// convert a date from dd.MM.yyyy to yyyy-MM-dd
		var parts = $scope.discussionDate.split(".");
		var discussionDateValue = new Date(Date.UTC(parts[2], parts[1] - 1, parts[0], 0, 0, 0));
		$scope.discussion.discussionDate = discussionDateValue;
		Discussion.save($scope.discussion, function() {
			$state.go('employees');
		}, function() {
			$scope.showError();
		});
	};

});

appmodule.controller('DiscussionsViewController', function($scope,
		EmployeeDiscussion) {

	$scope.employeesDiscussion = [];

	$scope.load = function() {
		EmployeeDiscussion.query(function(data) {
			$scope.employeesDiscussion = data;
		});
	};
	$scope.load();

});
