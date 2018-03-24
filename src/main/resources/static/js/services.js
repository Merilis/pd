var baseUrl = 'http://localhost:8080/rest-api/';

var appmodule = angular.module('app.services', []);

appmodule.factory('User', function($resource) {
	return $resource(baseUrl + 'users/:userId', {
		userId : '@userId'
	}, {
		update : {
			method : 'PUT'
		}
	});
}).factory('Employee', function($resource) {
	return $resource(baseUrl + 'employees/:employeeId', {
		employeeId : '@employeeId'
	});
}).factory('Discussion', function($resource) {
	return $resource(baseUrl + 'discussions/:discussionId', {
		discussionId : '@discussionId'
	});
}).factory('EmployeeDiscussion', function($resource) {
	return $resource(baseUrl + 'discussions-view');
});
