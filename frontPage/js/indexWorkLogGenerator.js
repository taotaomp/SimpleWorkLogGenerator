$(document).ready(function(){
    //工作记录生成
    $("#generate").click(function(){
        //table表签
        var newTable = $("<table></table>");
        newTable.attr("class","table table-bordered");
        //获取待生成的所有工作记录项
        var workActionItemArrays = $(".workActionItem");
        var newTr = $("<tr></tr>");
        var newTd1 = $("<td></td>");
        newTd1.append($("#startTime").val()+"-"+$("#finishTime").val());
        
        
        var newTd2 = $("<td></td>");
        //循环加入表格
        for (let index = 0; index < workActionItemArrays.length; index++) {
            
            
        }
        return false;
    });
});