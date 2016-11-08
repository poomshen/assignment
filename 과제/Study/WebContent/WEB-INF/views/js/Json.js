function postJson() {
			var JsonBody = '';
			$.ajax({
				type: "post",
				url: "message/post.json",
				contentType: "application/json;charset=UTF-8",
				data: JsonBody,
				processData: false,
				success: function( response ){
					alert(response);
					console.log(response);
				},
				error: function(){
					alert( "ERROR", arguments );
				}
			});
		}