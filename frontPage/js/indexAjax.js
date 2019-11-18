$(document).ready(function(){
	$.getJSON("http://localhost:8080/SimpleWorkLogGenerator_war/workTypes?callback=?",function(result){
			$.each(result,function(i,filed){
			var newOption = $("<option></option>");
			newOption.attr("value",filed.workTypeId);
			newOption.append(filed.workTypeName);
			$("#workType").append(newOption);
		});
	});
	
	
});