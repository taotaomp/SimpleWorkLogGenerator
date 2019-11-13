$(document).ready(function(){
    $(".deleteWorkActionItem").click(function(){
        $(this).parent().parent().remove();
    });
});