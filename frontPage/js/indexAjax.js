$(document).ready(function(){
	$.getJSON("url",function(result){
		$.each(result,function(i,filed){
			var newOption = $("<option></option>");
			newOption.attr("value",i);
			newOption.append(filed);
			$("#workType").append(newOption);
		});
	});
	
	
});