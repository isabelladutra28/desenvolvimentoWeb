GET: $(document).ready(
		function() {

			$("#entrar").click(function(event) {
				debugger;
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "home",
					success : function(result) {
						if (result.status == "success") {							
						      window.location.open("http://localhost:3030/home");
							console.log("Success: ", result);
						} else {
							$("#getResultDiv").html("<strong>Error</strong>");
							console.log("Fail: ", result);
						}
					},
					error : function(e) {
						$("#getResultDiv").html("<strong>Error</strong>");
						console.log("ERROR: ", e);
					}
				});
			}
		})