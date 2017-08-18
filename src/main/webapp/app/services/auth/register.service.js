(function () {
    'use strict';

    angular
        .module('goniSoftwareApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
