<?php
require_once "Leite.php";
require_once "DVD.php";
date_default_timezone_set("America/Belo_Horizonte");



$Leite1 = new Leite(5, 5, "Garoto", 1500, "22/11/2019");
$Leite6 = new Leite(10, 8, "Cotochés", 1000, "22/10/2019");
$Leite2 = new Leite(6, 5, "Italac", 1000, "22/05/2020");
$Leite3 = new Leite(7, 6, "Ninho", 1000, "13/12/2021");
$Leite4 = new Leite(8, 6, "Parmalat", 1000, "20/10/2021");
$Leite5 = new Leite(9, 7, "Itambé", 1000, "11/09/2019");


$DVD1 = new DVD(1, 5, "A menina que roubava livros", 2012);
$DVD2 = new DVD(2, 5, "O som do coração", 1999);
$DVD3 = new DVD(3, 13, "Os vingadores: Ultimato", 2019);
$DVD4 = new DVD(4, 15, "Sherek 2", 2006);


$estoque = array($DVD1->codigo => $DVD1,
	$DVD2->codigo => $DVD2,
	$DVD3->codigo => $DVD3,
	$DVD4->codigo => $DVD4,
	$Leite1->codigo => $Leite1,
	$Leite2->codigo => $Leite2,
	$Leite3->codigo => $Leite3,
	$Leite4->codigo => $Leite4,
	$Leite5->codigo => $Leite5,
	$Leite6->codigo => $Leite6);

for($i = 1; $i <= 4; $i++){
echo "FILME: $i<br>$estoque[$i]<br><hr>";
}

$numero = 1;
for($i = 5; $i <= 10; $i++){
echo "LEITE: $numero<br>$estoque[$i]<br><hr>";
$numero++;
}

$mensagem = '';
for($i = 5; $i <= 10; $i++){
	if($estoque[$i]->estaVencido()){
		$mensagem .= $estoque[$i]->getMarca()."<br>";
	}
}
echo "Leites vencidos: <br>$mensagem<br><hr>";

$anoDig = 2007;
$mensagemPegaAno = '';
$boolean = false;
for($i = 1; $i <= 4; $i++){
	if($estoque[$i]->getAno() == $anoDig){
		$mensagemPegaAno .= $estoque[$i]->getTitulo()."<br>";
		$boolean = true;
	}
	}if($boolean == true){
		echo " DVDs lançados em $anoDigitado: <br>$mensagemPegaAno<br><hr>";
	}else{
		echo "Não existe DVD em estoque lançado em : <br>$anoDigitado<br><hr>";
	}

$somaProdutos = null;
for($i = 1; $i <= 10; $i++){
	$somaProdutos += $estoque[$i]->preco;
}
echo "Soma produtos em estoque: $somaTotalProdutos<br>";

?>
