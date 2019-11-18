$(document).ready(function(){
	// alert("d");
	// document.cookie = "SameSite=None";
	// $("#workType").click(function(){
	// 	$.ajax({
	// 		async : true,
	// 		url : "http://localhost:8080/SimpleWorkLogGenerator_war/workTypes?callback=?",
	// 		type : "GET",
	// 		dataType : "jsonp", // 返回的数据类型，设置为JSONP方式
	// 		jsonp : 'callback', //指定一个查询参数名称来覆盖默认的 jsonp 回调参数名 callback
	// 		jsonpCallback: 'handleResponse', //设置回调函数名
	// 		success: function(response, status, xhr){
	// 		    console.log('状态为：' + status + ',状态是：' + xhr.statusText);
	// 		    console.log(response);
	// 			var jsondata = response;
	// 			    console.info(jsondata);
	// 			    console.info("姓名:"+jsondata[0].workTypeId);
	// 			    console.info("年龄:"+jsondata.workTypeName);
				    
			
	// 		}
	// 	});
	// });
	
	$.getJSON("http://localhost:8080/SimpleWorkLogGenerator_war/workTypes?callback=?",function(result){
			$.each(result,function(i,filed){
			var newOption = $("<option></option>");
			newOption.attr("value",filed.workTypeId);
			newOption.append(filed.workTypeName);
			$("#workType").append(newOption);
		});
	});
	
	
});