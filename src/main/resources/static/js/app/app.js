'use strict'
var demoApp = angular.module('demo', ['demo.controllers','demo.services']);
demoApp.constant("CONSTANTS", {
    getUserByIdUrl: "/user/getUser/",
    getAllUsers: "/user/getAllUsers",
    saveUser: "/user/saveUser"
});