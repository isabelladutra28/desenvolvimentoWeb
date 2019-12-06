GET: $(document).ready(
		function() {

			$("#cadastro").click(function(event) {
				event.preventDefault();
				ajaxGet();
			});

			// DO GET
			function ajaxGet() {
				$.ajax({
					type : "GET",
					url : "ocorrenciaCadastro",
					success : function(result) {
						if (result.status == "success") {							
						      window.location.open("http://localhost:3030/ocorrenciaCadastro");
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