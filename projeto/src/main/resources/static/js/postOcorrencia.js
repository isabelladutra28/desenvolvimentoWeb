$(document).ready(
		function() {

			$("#cadastroocorrencia").submit(function(event) {	
				debugger;
				event.preventDefault();
				ajaxPost();
				
				
			});

			function ajaxPost() {

			
				var ocorrencia = {
				     
					 titulo : $("#titulo").val(),
					 data: $("#data").val(),
					 descricao : $("#descricao").val(),
					 status : $("#status").val()
				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "ocorrencia/salvar",
					data : JSON.stringify(ocorrencia),
					dataType : 'json',
					success : function(result) {
						if (result.status == "success") {
							$("#post").html(
									"" + result.data.titulo
											+ "Post Successfully! <br>"
											+ "---> Congrats !!" + "</p>");
						} else {
							$("#post").html("<strong>Error</strong>");
						}
						
						console.log(result);
					},
					error : function(e) {
						alert("Ocorrencia cadastrada!")
						console.log(": ", e);
					}
				});

			}

		})