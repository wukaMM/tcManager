function addUser(){
	$.ajax({
		type: "GET",
		url: "/users",
		success: function(data) {
			console.log("ssssssssss");
		}
	});
}