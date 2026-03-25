console.log("相原優");

$(function(){
    $("#colorRed").click(function(){
        $("#name").css("color","red");
    }); 
});

$(function(){
    $("#alertAge").click(function(){
        alert($("#age").val());
    });
});

$(function(){
    $("#doubleClick").click(function(){
        $(this).prop("disabled",true);
    });
});

$(function(){
   $("#languageSelect").change(function(){
       var selectedLanguage = $(this).val();
       if (selectedLanguage === "java") {
           $("#output").text('System.out.println("Hello, World");');
       } else if (selectedLanguage === "javascript") {
           $("#output").text('console.log("Hello, World");');
       } else {
           $("#output").text('');
       }
   });
});
