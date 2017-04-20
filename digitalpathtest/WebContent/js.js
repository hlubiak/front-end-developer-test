function sendAgeheight(){

	var xmlhttp;
	
	var age = document.getElementById( "age" ).value;
	var height = document.getElementById( "height" ).value;
	
	if (window.XMLHttpRequest){
		xmlhttp = new XMLHttpRequest();
	}else{
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function(){
			
		if ( xmlhttp.readyState == 4 && xmlhttp.status == 200 ){
			document.getElementById( "output" ).innerHTML = xmlhttp.responseText;
		}	
	}
	
	document.getElementById("processing").style.display = "block";
	document.getElementById( "age" ).value = "";
	document.getElementById( "height" ).value = "";
	
	
	xmlhttp.open( "POST", "results" ,true );
	xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	xmlhttp.send( "age="+age + "&height="+height );
	
}