app.service('validarService',['$http','$q', function ($http,$q) {
	this.sendfile=function(cadena){
		var d = $q.defer();
		$http.get("/xml/leer/").then(
				function(response) {
					//console.log(response);
					d.resolve(response.data);
				},
				function(response) {
				});
		return d.promise;
	}
}])

app.controller('validarController',['$scope','validarService','fileService', '$cookieStore', '$http','$interval','$window', function($scope,validarService,fileService,$cookieStore, $http, $interval, $window){
	document.querySelector('input').addEventListener('change', function() {

		  for(var i= 0; i<this.files.length; i++){
			  var reader = new FileReader();
			  reader.onload = function() {
			    var arrayBuffer = this.result;
			    var cadena=$('#cadena').text();
			    cadena= cadena+arrayBuffer+"CADENADEESCAPE";
			   
			    $('#cadena').text(cadena);
			  }
			  $('#cadena').text("");
			  reader.readAsText(this.files[i]);
		  }
		}, false);
	$scope.ok=function(){
		var c= $('#cadena').text();
		console.log(c);
		validarService.sendfile(c).then(function(data){
			console.log(data);
		});
	}
	$scope.valid = function(){
		validarService.sendfile
	}
	
}]);